package com.iteso.nintendo.attacks;

public class QuickAttack extends BaseAttack{
    
    public QuickAttack(){
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