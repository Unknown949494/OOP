package oop.labor13.lab13_2;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String inputFile = "students.csv";
        String outputFile = "processed_students.csv";
        String warningFile = "warning.csv";

        processStudentData(inputFile, outputFile, warningFile);
    }

    public static void processStudentData(String inputFile, String outputFile, String warningFile) {
        Path inputPath = Paths.get(inputFile);

        if (!Files.exists(inputPath)) {
            System.err.println("Error: Input file does not exist.");
            return;
        }
    }
}
