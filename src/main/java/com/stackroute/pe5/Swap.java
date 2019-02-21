/*Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:*/


package com.stackroute.pe5;

import java.util.HashMap;

public class Swap {

    public HashMap checkMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("val1", "Java");
        map.put("val2", "C++");
        if (map.containsKey("val1")) {
            String aValue = map.get("val1");
            map.put("val2", aValue);
            map.put("val1", " ");
        }
        return map;

    }
}

