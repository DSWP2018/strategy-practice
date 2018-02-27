package com.iteso.nintendo.attacks;

public class FireBall implements Attack {

    private String attackName;
    private int damage;

    public FireBall(){
        attackName = "Fire ball";
        damage = 20;
    }


    @Override
    public String attack() {
        return "Se ataco al pokemon con " + attackName + ", dañandolo con " + damage + " puntos.";
    }

    @Override
    public String attackName() {
        return attackName;
    }

    @Override
    public int attackDamage() {
        return damage;
    }
}
