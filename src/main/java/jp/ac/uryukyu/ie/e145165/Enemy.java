package jp.ac.uryukyu.ie.e145165;

/**
 * Created by masaaki on 2017/01/19.
 */

    public class Enemy extends LivingThing {
        public Enemy(String name, int maximumHP, int attack) {
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
                //20%の確率で、0~9の数から指定した値が出た場合
                if(count<0.2){
                    damage *= 2;
                    System.out.printf("%sの攻撃!痛恨の一撃!!%sに%dのダメージを与えた!!\n",name,opponent.getName(),damage);
                    opponent.wounded(damage);
                    //それ以外の数がでた場合
                }else {
                    System.out.printf("%sの攻撃!%sに%dのダメージを与えた!!\n", name, opponent.getName(), damage);
                    opponent.wounded(damage);
                }

            }else{
                System.out.printf("%sの攻撃!...だが、%sは攻撃を回避した！\n",name,opponent.getName(),damage);
            }

        }

    }
}

