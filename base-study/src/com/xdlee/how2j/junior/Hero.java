package com.xdlee.how2j.junior;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午1:28
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */

public class Hero {
    // 姓名
    String name;

    // 血量
    float hp;

    // 最大血量
    float maxHP;

    {
        maxHP = 9999;
    }

    // 物品容量
    public static int itemCapacity;

    static {
        itemCapacity = 8;
    }

    // 护甲
    float armor;

    // 移动速度
    int moveSpeed;

    // 送了多少次
    int sendTimes;

    // 杀人次数
    int killingTimes;

    // 助攻次数
    int assistsTimes;

    // 金钱
    int money;

    // 补刀数
    int knives;

    // 攻击速度
    float attackSpeed;

    // 杀人后说的话
    String killingWords;

    // 被杀后说的话
    String beKilledWords;

    public void showAddressInMemory() {
        System.out.println("打印this看到的虚拟地址：" + this);
    }

    public Hero() {

    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name, float hp, float armor, int moveSpeed) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public static void main(String[] args) {
        Hero garon = new Hero();
        garon.name = "盖伦";
        garon.hp = 616.28f;
        garon.armor = 27.536f;
        garon.moveSpeed = 350;
        garon.showAddressInMemory();

        //给盖伦增加100速度
        garon.addMoveSpeed(100);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
    }

    public void attackHero(Hero h) throws EnemyHeroIsDeadException {
        if (h.hp == 0) {
            throw new EnemyHeroIsDeadException(h.name + " 已经挂了，不需要施放技能");
        }
    }

    /**
     * 坑队友
     */
    void keng() {
        System.out.println("坑队友");
    }

    /**
     * 超神
     */
    public void legendary() {
        System.out.println("你超神了");
    }

    /**
     * 获取护甲
     * @return float
     */
    public float getArmor() {
        return this.armor;
    }

    /**
     * 获取当前血量
     * @return
     */
    public float getHp() {
        return hp;
    }

    /**
     * 增加移动速度
     * @param speed
     */
    public void addMoveSpeed(int speed) {
        moveSpeed += speed;
    }

    /**
     * 回血
     * @param blood
     */
    public void recovery(int blood) {

        hp += blood;
    }

    public void revive(Hero h) {
        h = new Hero(h.name, 383);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
