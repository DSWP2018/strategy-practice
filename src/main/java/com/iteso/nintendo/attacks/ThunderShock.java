package com.iteso.nintendo.attacks;

public class ThunderShock extends BaseAttack{
    
    public ThunderShock(){
        this.attackName = "Thunder Shock";
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