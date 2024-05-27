package oop.labor13.lab13_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Line: ");
        String inputLine = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\S");
        Matcher matcher = pattern.matcher(inputLine);
        double sum = 0;
        while (matcher.find()) {
            try {
                sum += Double.parseDouble(matcher.group());
            } catch (NumberFormatException e) {
            }
        }
        System.out.printf("Output: %.1f%n", sum);
    }
}
