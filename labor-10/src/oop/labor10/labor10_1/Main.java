package oop.labor10.labor10_1;

import oop.labor10.labor10_1.SortingDemo;

public class Main {
    public static void main(String[] args) {
        String filename = "fruits.txt";
        SortingDemo sortingDemo = new SortingDemo(filename);

        System.out.println("Original order of fruits:");
        sortingDemo.printFruits();

        sortingDemo.sortAlphabetically();
        System.out.println("\nFruits sorted alphabetically:");
        sortingDemo.printFruits();

        sortingDemo.sortReverseAlphabetically();
        System.out.println("\nFruits sorted reverse alphabetically:");
        sortingDemo.printFruits();
    }
}
