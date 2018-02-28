package com.iteso.nintendo;
import java.util.HashMap;
import java.util.Map;

public class Water implements iType{
    String type = "water";
    Map<String, Float> typeTable = new HashMap<String, Float>(){
        {
            put("fire", 0.5f);
            put("water", 0.5f);
            put("electric", 2f);
            put("grass", 2f);
            put("normal", 1f);
        }
    };

    public int getFinalDamage(String type, int damage){
        return (int)(typeTable.get(type) * (float)damage);
    }

    public String getName(){
        return type;
    }
}
