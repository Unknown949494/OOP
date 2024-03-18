package oop.labor04_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void readFilePrintItsLineNumbered(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int lineNr = 1;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(lineNr + " " + line);
                lineNr++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");
                String firstName = data[0].trim();
                String lastName = data[1].trim();
                String birthYear = data[2].trim();
                Person person = new Person(firstName, lastName, Integer.parseInt(birthYear));
                persons.add(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }


    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_input.txt");
        for(Person p: readFromCSVFile("lab4_1_input.csv")){
            System.out.println(p);
        }
    }
}
