package com.xdlee.how2j.junior;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午3:33
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class SupportHero extends Hero {
    public void heal() {
        System.out.println(name + " 对不知道谁进行了治疗 ");
    }

    public void heal(Hero h1, int hp) {
        System.out.println(name + " 为 " + h1.name + " 加了 "+ hp +" 的血 ");
    }

    public void heal(Hero ... heroes) {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(name + " 对 " + heroes[i].name + " 进行了治疗");
        }
    }

    public static void main(String[] args) {
        SupportHero qn = new SupportHero();
        qn.name = "琴女";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
        Hero h3 = new Hero();
        h3.name = "蛮王";

        qn.heal();
        qn.heal(h1, 100);
        qn.heal(h1, h2, h3);
    }
}
