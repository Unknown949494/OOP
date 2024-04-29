package oop.labor06.felveteli;

import java.util.ArrayList;

public class Informatika {
        ArrayList<Diak> felvetelizok = new ArrayList<>();
        Informatika(){

        }

        void ujbeiratkozok(Diak diak){
                felvetelizok.add(diak);
        }

        int felvetelizokSzama(){
                return felvetelizok.size();
        }

        double felvetelizokAtlaga(){
                double osszeg = 0;
                for(Diak diak : felvetelizok) {
                        osszeg += diak.atlag();
                }
                return osszeg / felvetelizok.size();
        }

        void listazOsszes(){
                for(Diak diak : felvetelizok){
                        System.out.println(diak.getVnev() + " " + diak.getKnev());
                }
        }
        void listazAtlag(double atlag){
                for(Diak diak : felvetelizok){
                        if(diak.atlag() >= atlag){
                                System.out.println(diak.getVnev() + " " + diak.getKnev());
                        }
                }
        }
}
