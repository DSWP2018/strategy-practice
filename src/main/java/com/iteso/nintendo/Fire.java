package com.iteso.nintendo;
import java.util.HashMap;
import java.util.Map;

public class Fire implements iType{
    String type = "fire";
    Map<String, Float> typeTable = new HashMap<String, Float>(){
        {
            put("fire", 0.5f);
            put("water", 2f);
            put("electric", 1f);
            put("grass", 0.5f);
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
