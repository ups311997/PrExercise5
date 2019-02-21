/*Write a program to implement set interface which sorts the given randomly ordered names in

ascending order. Convert the sorted set in to an array list*/

package com.stackroute.pe5;

import java.util.TreeSet;

public class Namesort {
    public TreeSet sortNames(String s[]) {
        TreeSet<String> tree = new TreeSet<>();//taking treeset for automatic sorting

        for (int i = 0; i < s.length; i++) {
            tree.add(s[i]);
        }
        return tree;
    }
}

