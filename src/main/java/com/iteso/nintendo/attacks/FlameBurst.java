package com.iteso.nintendo.attacks;

/** */
public class FlameBurst extends BaseAttack {
    /** */
    public static final int BASEATTACKDAMAGE = 10;
    /** */
    public static final int BASECRITICALFAILPROB = 0;
    /** */
    public static final int BASECRITICALHITPROB = 0;
    /** */
    public FlameBurst() {
        setAttackName("FlameBurst");
        setAttackDamage(BASEATTACKDAMAGE);
        setCriticalFailProbablity(BASECRITICALFAILPROB);
        setCriticalHitProbability(BASECRITICALHITPROB);
    }

    /**
     * @return AttackResult
     */
    public final AttackResult attackOpponent() {
        AttackResult attackResult = new AttackResult();
        attackResult.setAttackName(getAttackName());
        attackResult.setDamageGiven(getAttackDamage());
        return attackResult;
    }
}
