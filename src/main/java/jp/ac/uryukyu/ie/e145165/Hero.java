package jp.ac.uryukyu.ie.e145165;


/**
 * Created by masaaki on 2017/01/19.
 */
public class Hero extends LivingThing {
    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

    }

    @Override
    public void attack(LivingThing opponent) {

        int attack = getAttack();
        String name = getName();
        boolean dead = getDead();

        int damage = (int) (Math.random() * attack);

        //確率を出す用に変数countを用意　
        double count;
        count = Math.random();

        if (dead == false) {

            if (damage != 0) {
                //30%の確率で、０〜９の数から指定した値が出た場合
                if (count < 0.3) {
                    damage *= 2;
                    System.out.printf("%sの攻撃!会心の一撃!!%sに%dのダメージを与えた!!\n", name, opponent.getName(), damage);
                    opponent.wounded(damage);
                    //それ以外の数がでた場合
                } else {
                    System.out.printf("%sの攻撃!%sに%dのダメージを与えた!!\n", name, opponent.getName(), damage);
                    opponent.wounded(damage);
                }

            } else {
                System.out.printf("%sの攻撃!...だが、%sは攻撃を回避した！\n", name, opponent.getName(), damage);
            }
        }
    }
}
