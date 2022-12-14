package com.kevinbooms;

import com.kevinbooms.ClassesAndObjects.Person; // imported/created the person class so we have a "blueprint" for persons

public class App {

    public static void main(String[] args) {

        // NTS:1213221956 - develop this into a console app and turn the practice blocks into executable methods

        Person person = new Person("Bob", 28, "C, C++"); // create a new Person Object and give it some initial values

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSkill());

        Person newPerson = new Person();

        System.out.println(newPerson.getName());    // displays null, 0, and null because
        System.out.println(newPerson.getAge());     // no values have been set using a blank (default)
        System.out.println(newPerson.getSkill());   // constructor for the person object

        newPerson.setName("Kevin");                 // but if we set the values
        newPerson.setAge(38);                       // and then reprint the same object
        newPerson.setSkill("Java, Spring");            // the values should be updated

        System.out.println(newPerson.getName());    // and they are!
        System.out.println(newPerson.getAge());
        System.out.println(newPerson.getSkill());
    }
}
/*
* This object manipulation within the App class is possible because the Person class has been
* imported to the App class
* */