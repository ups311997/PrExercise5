/*Write a Java program to update specific array element by given element and empty the array list.*/
package com.stackroute.pe5;

import java.util.ArrayList;


public class Update {

    public ArrayList checkList(ArrayList arrayList) {

        arrayList.set(0, "Kiwi");
        arrayList.set(2, "Mango");
        return arrayList;

    }

    public ArrayList removeList(ArrayList arrayList) {
        arrayList.clear();
        return arrayList;
    }
}


