/* Nama File    : MTitik.java 
 * Deskripsi    : berisi objek Titik dan memanggil method dalam class Titik
 * Pembuat      : Amara Putri Soniaji / 24060123120004
 * Tanggal      : 20 Februari 2025
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
         
        //Object Reference
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(3,5);
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        System.out.println("Jarak T3 ke titik pusat: " + T3.getJarakPusat());

        T3.refleksiY();
        T3.printTitik();

        T3.refleksiX();
        T3.printTitik();

        System.out.println("T3 berada di kuadran: " + T3.getKuardran());

        Titik TB = T3.getRefleksiX();
        TB.printTitik();
        System.out.println("TB berada di kuadran: " + TB.getKuardran());
        
        System.out.println("Jarak kedua titik: " + TB.getJarak(T3));
    }
}

