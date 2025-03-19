/* Nama File    :MBangunDatar.java 
 * Deskripsi    : berisi main class untuk menguji class Persegi dan Lingkaran
 * Tanggal      : 13 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Mbangundatar {
    public static void main(String[] args) {
        Persegi p = new Persegi(5, "Kuning", "Biru");
        Lingkaran l = new Lingkaran(7, "Biru", "Merah");

        p.printInfo();
        System.out.println("Luas persegi: " + p.getLuas());
        System.out.println("Keliling persegi: "+ p.getKeliling());
        System.out.println("Diagonal persegi: "+ p.getDiagonal());

        l.printInfo();
        System.out.println("Luas lingkaran: "+ l.getLuas());
        System.out.println("Keliling lingkaran: "+ l.getKeliling());

        BangunDatar.printCounterBangunDatar();
    }
}
