package com.iteso.nintendo;

public interface Attack{
        /**
         *
         * @return
         */
        public String attackOpponent();

        /**
         *
         */
        public void cancelAttack();

        public String getAttackName();
        public int getAttackDamage();
        }

