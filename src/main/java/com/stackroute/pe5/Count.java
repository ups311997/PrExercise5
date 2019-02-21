//Write a program to find the number of counts in the following String. Store the output in
//Map<String,Integer> as key value pair.

package com.stackroute.pe5;

import java.util.HashMap;


public class Count {
    public HashMap countFrequencies(String str, String[] input) {
        {
            int array[] = new int[input.length];//length of the arrayElements
            int len[] = new int[input.length];//length of the input

            HashMap hashMap = new HashMap();


            for (int i = 0; i < array.length; i++) {
                array[i] = str.length() - (str.replaceAll(input[i], "").length());
            }

            for (int i = 0; i < array.length; i++) {
                len[i] = input[i].length();
            }

            for (int i = 0; i < array.length; i++) {
                hashMap.put(input[i], (array[i] / len[i]));

            }

            // System.out.println(hashMap);

            return hashMap;
        }
    }
}

