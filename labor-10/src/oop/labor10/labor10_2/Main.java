package oop.labor10.labor10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyData> dates = generateRandomDates( 10);

        System.out.println("Generated dates:");
        for (MyData date : dates) {
            System.out.println(date);
        }

        Collections.sort(dates);

        System.out.println("\nSorted dates:");
        for (MyData date : dates) {
            System.out.println(date);
        }
    }

    public static ArrayList<MyData> generateRandomDates(int count) {
        ArrayList<MyData> dates = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int year = 1900 + random.nextInt(125);// 1900 es 2024 kozott
            int month = 1 + random.nextInt(12);
            int day = 1 + random.nextInt(30);
            dates.add(new MyData(year, month, day));
        }

        return dates;
    }
}
