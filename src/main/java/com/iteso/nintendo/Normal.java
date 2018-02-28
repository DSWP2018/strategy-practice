package com.iteso.nintendo;
import java.util.HashMap;
import java.util.Map;

public class Normal implements iType{
    String type = "normal";
    Map<String, Float> typeTable = new HashMap<String, Float>(){
        {
            put("fire", 1f);
            put("water", 1f);
            put("electric", 1f);
            put("grass", 1f);
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
