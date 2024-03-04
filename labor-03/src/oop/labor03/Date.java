package oop.labor03;

//Szanto Robert

public class Date {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void year(int year){this.year = year;}

    public void month(int month){this.month = month; }

    public void day(int day){this.day = day; }

    public boolean isLeapYear(int year){
        if(day <= 364){
            return true;
        }
        else if(day >364) {
            return false;
        }
    }
}
