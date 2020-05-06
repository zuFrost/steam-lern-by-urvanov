package com.zufrost.learn;

import java.util.LinkedList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> roster = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            roster.add(new Person());
        }
        System.out.println("roster list size = " + roster.size());



    }
}
