/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam superclass Pegawai dengan konsep polimorfisme
 * Tanggal      : 25 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004 
 */


public class Pegawai {
    private String nama;
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public static int gajiPokok = 5000000;
    
    public void tampilData(){
        System.out.println("Nama Pegawai: " + nama + ", Gaji Pokok: " + gajiPokok);
    }
}
