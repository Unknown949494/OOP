package oop.labor03;

//Szanto Robert

public class Date {
    private int year;
    private int month;
    private int day;

    //constructor
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getter
    public int getYear() {
        return year;
    }

    //getter
    public int getMonth() {
        return month;
    }

    //getter
    public int getDay() {
        return day;
    }

    //megnezi ha szokoev
    public boolean isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
