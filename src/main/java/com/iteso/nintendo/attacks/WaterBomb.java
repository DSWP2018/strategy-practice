package com.iteso.nintendo.attacks;

public class WaterBomb extends BaseAttack{
    
    public WaterBomb(){
        this.attackName = "WaterBomb";
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