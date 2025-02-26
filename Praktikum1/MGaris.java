/* Nama File    : MGaris.java 
 * Deskripsi    : berisi objek Garis dan memanggil method dalam class Garis
 * Pembuat      : Amara Putri Soniaji / 24060123120004
 * Tanggal      : 20 Februari 2025
*/


public class MGaris {
    public static void main(String[] args) {
        Titik TGA = new Titik(8, 7);
        Titik TGB = new Titik(6, -4);
        Garis G1 = new Garis(TGA, TGB);
        G1.printGaris();

        Titik TGC = new Titik(-3, -9);
        Titik TGD = new Titik(-7, 6);
        Garis G2 = new Garis(TGC, TGD);

        System.out.println("Panjang garis tersebut: " + G1.panjang());

        System.out.println("Kemiringan garis tersebut: " + G1.gradien());

        G1.titikTengah();

       Titik TGE = new Titik(2, -5);
       Titik TGF = new Titik(6, -20);
       Garis G3 = new Garis(TGE, TGF);

        System.out.println("Apakah 2 garis tersebut sejajar: " + G2.isSejajar(G3));

        Titik TGG = new Titik(4, 3);
       Titik TGH = new Titik(15, 1);
       Garis G4 = new Garis(TGG, TGH);

        System.out.println("Apakah 2 garis tersebut tegak lurus: " + G1.isTegakLurus(G4));

        System.out.println("Banyak garis: " + Garis.getCounterGaris());

        System.out.println("Persamaan garis: " + G3.persGaris());
    }
}
