/*File : AngkaSialException.java 
 * Deskripsi : Eksepsi buatan sendiri, menolak angka 13!
 * Nama : Amara Putri Soniaji / 2406012310004
 * Tanggal : 6 Maret 2025
*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}
