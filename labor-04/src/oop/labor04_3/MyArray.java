package oop.labor04_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length, double[] elements) {
        this.length = length;
        this.elements = new double[length];
    }

    public MyArray(MyArray copy){
        this.length = copy.length;
        this.elements = new double[copy.length];
        for(int i=0;i< copy.length;i++){
            this.elements[i] = copy.elements[i];
        }

    }

    public MyArray(double[] elements){
        this.length = elements.length;
        this.elements = new double[elements.length];
        for(int i=0;i< elements.length;i++){
            this.elements[i] = elements[i];
        }
    }

    public MyArray(String filename){
        int n=0;
        try(Scanner scanner = new Scanner(new File(filename))){
            n = scanner.nextInt();
            this.elements = new double[this.length];
            for(int i=0;i< n; i++){
                this.elements[i] = scanner.nextDouble();
            }
        } catch (FileNotFoundException e){
            this.elements = new double[0];
        }
        this.length = n;
    }
}
