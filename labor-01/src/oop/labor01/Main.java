package oop.labor01;

import javax.xml.transform.Source;

public class Main {
    public static void main1(String[] args)
    {
        System.out.println("Szanto Robert, Romania");
    }

    public static void main2(String[] args)
    {
        String name = "Szanto Robert";
        for(int i=0;i < name.length();++i)
        {
            System.out.println(name.charAt(i));
        }
    }

    public static void main3(String[] args)
    {
        String name = "Joe Donald Biden";
        String[] parts = name.split(" ");

        for(String part : parts)
        {
            System.out.println(part);
        }
    }

    public static void main4(String[] args)
    {
        String name = "TREE";
        for (int i=0; i <= name.length(); i++)
        {
            System.out.println(name.substring(0,i));
        }
    }

    public static double maxElement(double array[])
    {
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<array.length;++i)
        {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static void main5(String[] args)
    {
        double x[] ={ 7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
    }

    public static byte getBit(int number, int order)
    {
        int mask = 1 << order;
        return (byte) ((number & mask) != 0 ? 1 : 0);
    }

    public static void main6(String[] args)
    { //hibas
        int number = 1;
        int order = 3;
        byte bitValue = getBit(number, order);
        System.out.println("Bit value at position " + order + ": " + bitValue);
    }

    public static int countBits(int number)
    {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static void main7(String[] args)
    {
        int number = 13;
        int bitCount = countBits(number);
        System.out.println("Number of '1' bits in " + number + ": " + bitCount);
    }

    public static double mean(double[] array)
    {
        if (array.length == 0)
        {
            return Double.NaN;
        }

        double sum = 0;
        for (double num : array)
        {
            sum += num;
        }

        return sum / array.length;
    }

    public static void main8(String[] args)
    {
        double[] array1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] array2 = {};

        System.out.println("Mean of array1: " + mean(array1));
        System.out.println("Mean of array2: " + mean(array2));
    }

    public static double[] max2(double[] array)
    {
        double[] max = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        for (double num : array)
        {
            if (num > max[0])
            {
                max[1] = max[0];
                max[0] = num;
            }
            else if (num > max[1] && num != max[0])
            {
                max[1] = num;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        double[] array = {5, 8, 999, 100, 99, 85};
        double[] result = max2(array);
        System.out.println("The two largest elements are: " + result[0] + ", " + result[1]);
    }
}
