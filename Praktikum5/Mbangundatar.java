/* Nama File    : MBangunDatar.java 
 * Deskripsi    : berisi main class untuk menguji class Persegi dan Lingkaran
 * Tanggal      : 20 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Mbangundatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); //Eror karena class BangunDatar dibuat abstrac sehingga saat membuat objek baru harus lewat subclassnya 
        BangunDatar P1 = new Persegi(10, "hitam", "merah");
        Persegi P2 = new Persegi(10, "kuning", "biru");
        BangunDatar L1 = new Lingkaran(7, "hijau", "putih");
        Lingkaran L2 = new Lingkaran(7, "merah", "biru");

        P1.printInfo();
        System.out.println("------");
        P2.printInfo();
        System.out.println("-------");
        L1.printInfo();
        System.out.println("--------");
        L2.printInfo();

        System.out.println("Kesamaan Persegi");
        System.out.println("Apakah luasnya sama? " + P1.isEqualLuas(P2));
        System.out.println("Apakah kelilingnya sama? " + P1.isEqualKeliling(P2));
        System.out.println("Kesamaan Lingkaran");
        System.out.println("Apakah luasnya sama? " + L1.isEqualLuas(L2));
        System.out.println("Apakah kelilingnya sama? " + L1.isEqualKeliling(L2));

        System.out.println("Apakah luas 2 jenis bangundatar sama? " + P1.isEqualLuas(L2));

        P2.zoomIn();
        System.out.println("Ukuran persegi zoomIn P2: " + P2.getSisi());
        P2.zoom(35);
        System.out.println("Ukuran persegi Zoom P2: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Ukuran persegi ZoomOut P2: " + P2.getSisi());

        L2.zoomIn();
        System.out.println("Ukuran lingkaran zoomIn L2: " + L2.getJari());
        L2.zoom(35);
        System.out.println("Ukuran lingkaran Zoom L2: " + L2.getJari());
        L2.zoomOut();
        System.out.println("Ukuran Lingkaran ZoomOut L2: " + L2.getJari());

    }
}
//No 3
/* BangunDatar B1 = new BangunDatar();
Eror karena class BangunDatar dibuat abstract sehingga saat membuat objek baru harus lewat subclassnya */

//No 5
/* Method isEqualLuas dan isEqualKeliling bisa dibuat membandingkan 2 jenis bangundatar yang berbeda, 
tidak akan eror tetapi hasilnya akan selalu False */
/*Method isEqualLuas dan isEqualKleiling pada class BangunDatar jika tidak dijadikan abstract tetap bisa diimplementasikan, asalkan harus ada implementasi dari getLuas dan getKeliling. Namun, hal itu akan susah karena 2 jenis bangundatar itu rumus menghitungnya akan berbeda */
/*Keuntungan BangunDatar sebagai abstract class: memastikan semua subclass mengimplementasikan getLuas dan getKeliling dan mencegah instansiasi langsung */
