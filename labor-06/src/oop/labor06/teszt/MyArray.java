package oop.labor06.teszt;

public class MyArray {
    private double[] array;
    private int capacity;

    public MyArray(int capacity){
        this.array = capacity;
    }

    public double[] getArray() {
        return array;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    double mean() {
        double sum =0;
        for(double iterator : array){
            sum += iterator;
        }
        return sum/array.length;
    }
}
