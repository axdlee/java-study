package com.xdlee.how2j.junior;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午3:21
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class ADHero extends Hero {
    public void attack() {
        System.out.println(name + " 进行了一次攻击，但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(name + " 对 " + h1.name + "进行了一次攻击");
    }

    public void attack(Hero h1, int damage) {
        System.out.println(name + " 对 " + h1.name + " 进行了攻击,并使他掉了 " + damage + " 血");
    }

    public void attack(Hero... heroes) {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(name + " 攻击了 " + heroes[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
        int damage = 100;

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
        Hero h3 = new Hero();
        h3.name = "蛮王";

        bh.attack();
        bh.attack(h1);
        bh.attack(h1, damage);
        bh.attack(h1, h2, h3);
    }
}
