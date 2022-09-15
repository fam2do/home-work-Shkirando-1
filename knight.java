package com.company;

import java.util.Random;

public class knight extends Warrior{
    public int getDamage(){
        Random gen = new Random();
        int chance = gen.nextInt(10000);
        if(chance < 1000)
        return 2*super.getDamage();
        else
            return super.getDamage();

    }

}
