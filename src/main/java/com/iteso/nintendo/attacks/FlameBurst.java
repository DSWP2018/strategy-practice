package com.iteso.nintendo.attacks;

public class FlameBurst extends BaseAttack{
    
    public FlameBurst(){
        this.attackName = "FlameBurst";
        this.attackDamage = 10;
        this.criticalFailProbablity = 0;
        this.criticalHitProbability = 0;
    }


	public AttackResult attackOpponent() {
        AttackResult attackResult = new AttackResult();
        attackResult.setAttackName(this.attackName);
        attackResult.setDamageGiven(this.attackDamage);
        return attackResult;
	}

}