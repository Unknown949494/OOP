package oop.labor05;

import oop.labor05.Model.Course;
import oop.labor05.Model.Student;
import oop.labor05.Model.Training;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("DPJava", "Design Patterns in Java", 24);
        Date startDate = new Date(2022, 3, 21);
        Date endDate = new Date(2022, 3, 25);
        Training training = new Training(course, startDate, endDate);

        training.enroll(new Student("2871119070718", "Laszlo", "Franciska"));
        training.enroll(new Student("1800923051246", "Juhasz", "Jacint"));
        training.enroll(new Student("1720626020015", "Biro", "Tamas"));
        training.enroll(new Student("1780824043217", "Godri", "Istvan"));
        training.enroll(new Student("1850917060518", "Bodo", "Elod"));
        training.enroll(new Student("2901121070018", "Bogacs", "Katalin"));
        training.enroll(new Student("1861018060618", "Bege", "Istvan"));
        training.enroll(new Student("2891220070818", "Berekmeri", "Emoke"));
        training.enroll(new Student("2820614052018", "Kovacs", "Emese"));
        training.enroll(new Student("2810513041018", "Zsido", "Maria"));

        System.out.println(training);
    }
}