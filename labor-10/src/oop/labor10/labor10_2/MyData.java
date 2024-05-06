package oop.labor10.labor10_2;

public class MyData implements  Comparable<MyData> {
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyData o) {
        if(this.year != o.year) {
            return Integer.compare(this.year,o.year);
        } else if (this.month != o.month) {
            return  Integer.compare(this.month,o.month);
        } else if(this.day != o.day) {
            return Integer.compare(this.day,o.day);
        }
        return 0;
    }
}
