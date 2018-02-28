package com.iteso.nintendo;
import java.util.HashMap;
import java.util.Map;

public class Grass implements iType{
    String type = "grass";
    Map<String, Float> typeTable = new HashMap<String, Float>(){
        {
            put("fire", 2f);
            put("water", 0.5f);
            put("electric", 0.5f);
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
