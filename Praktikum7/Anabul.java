/* Nama File    : Anabul.java 
 * Deskripsi    : berisi atribut dan method dalam superclass Anabul dengan konsep polimorfisme
 * Tanggal      : 26 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Anabul {
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }        

    public String getNama(){
        return nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak");
    }

    public void bunyi(){
        System.out.println(nama + " berbunyi");
    }
}
