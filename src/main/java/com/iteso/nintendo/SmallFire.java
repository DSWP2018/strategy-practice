package com.iteso.nintendo;

public class SmallFire implements Attack {
    public static final int ATTACK_DAMAGE = 3;
    public static final String ATTACK_NAME = "Small Fire";

    @Override
    public String attackOpponent() {
        return "Aventar bolita de fuego";
    }

    @Override
    public String animation() {
        return "Mover manitas lento";
    }

    public int getAttackDamage(){
        return this.ATTACK_DAMAGE;
    }

    public String getNameAttack(){
        return this.ATTACK_NAME;
    }
}
