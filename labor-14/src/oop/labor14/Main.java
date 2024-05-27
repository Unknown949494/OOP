package oop.labor14;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("balint","laszlo",1999));
        persons.add(new Person("Robert","Veress",2004));
        Collections.sort(persons);

    }
}
