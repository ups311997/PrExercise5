//Write a program where an array of strings is input and output is a Map<String,boolean> where
//each different string is a key and its value is true if that string appears 2 or more times in the array

package com.stackroute.pe5;

import java.util.HashMap;

public class Check {
    public HashMap checkCharacter(String str[]) {
        int len[] = new int[str.length];//the length of the String
        boolean output[] = new boolean[str.length];

        HashMap hashMap = new HashMap();//using Hashmap


        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length - 1; j++) {
                if (str[i].equals(str[j]))
                    len[i] = count++;//count getting incremented
                if (len[i] > 0)
                    output[i] = true;
                else output[i] = false;
            }

        }


        for (int i = 0; i < len.length; i++) {
            hashMap.put(str[i], output[i]);//storing output in hashmap

        }

        // System.out.println(hashMap);

        return hashMap;
    }
}

