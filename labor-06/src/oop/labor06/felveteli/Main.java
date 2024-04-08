package oop.labor06.felveteli;

import oop.labor06.felveteli.Diak;
import oop.labor06.felveteli.Informatika;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Informatika informatika = new Informatika();

        informatika.ujbeiratkozok(new Diak("Kovacs","Bela",75.5,85.5));
        informatika.ujbeiratkozok(new Diak("Nagy","Anna",80.0,90.7));

        System.out.println("Osszes beiratkozott diakok:");
        informatika.listazOsszes();

        //try(FileReader r = newFR(..){ .. }
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("Diak.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if(parts.length == 4){
                    Diak diak = new Diak(parts[0].trim(),parts[1].trim(), Double.parseDouble(parts[2].trim()), Double.parseDouble(parts[3].trim()));
                    informatika.ujbeiratkozok(diak);
                }
            }
            reader.close();
        }catch(IOException e) {
        e.printStackTrace();
        }

        System.out.println("\n8-asnal nagyobb atlaggal rendelkezok: ");
        informatika.listazAtlag(8.0);

        System.out.println("\nFelvetelizok szama: " + informatika.felvetelizokSzama());
        System.out.println("\nFelvetelizok atlaga: " + informatika.felvetelizokAtlaga());


        System.out.println("\nOsszes beiratkozott diakok:");
        informatika.listazOsszes();
    }

}
