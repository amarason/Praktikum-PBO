/* Nama File    : MPegawai.java 
 * Deskripsi    : berisi file main dari superclass Pegawai dan seluruh subclass dari Pegawai
 * Tanggal      : 14 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        System.out.println("---DOSEN TETAP---");
        DosenTetap dosenTetap = new DosenTetap("9545647548",  "Fakultas Sains dan Matematika", "78647324", 
        "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000.00);

        dosenTetap.printInfo();

        System.out.println("---DOSEN TAMU---");
        DosenTamu dosenTamu = new DosenTamu("99887766", LocalDate.of(2026, 12, 31), "Fakultas Hukum",
        "98988787", "Ana", LocalDate.of(1985, 8, 15), LocalDate.of(2018, 3, 1), 5000000.00);

        dosenTamu.printInfo();
        
        System.out.println("---TENDIK---");
        Tendik tendik = new Tendik("Bagian Sumber Daya", LocalDate.of(2047, 8, 1), "7654321", 
        "Tina", LocalDate.of(1992, 7, 5), LocalDate.of(2017, 4, 1), 4700000.00);

        tendik.printInfo();
    }
}