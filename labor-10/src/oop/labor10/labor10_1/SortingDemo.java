package oop.labor10.labor10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SortingDemo {
    private List<String> fruits;

    public SortingDemo(String filename) {
        fruits = readFruitsFromFile(filename);
    }

    private List<String> readFruitsFromFile(String filename) {
        List<String> fruitsList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                fruitsList.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fruitsList;
    }

    public void sortAlphabetically() {
        Collections.sort(fruits);
    }

    public void sortReverseAlphabetically() {
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2); //- nelkul rendesen irja ki!!
            }
        });
    }

    public void printFruits() {
        System.out.println(String.join(" ", fruits));
    }
}
