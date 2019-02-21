package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter1 implements Comparator<StudentSorter> {

    @Override
    public int compare(StudentSorter studentSorter, StudentSorter t1) {
        if (studentSorter.age == t1.age) {
            if (studentSorter.name == t1.name) {
                if (studentSorter.id == t1.id) {
                    return 0;
                } else if (studentSorter.id > t1.id) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return 1;
            }
        } else if (studentSorter.age > t1.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
