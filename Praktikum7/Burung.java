/* Nama File    : Burung.java 
 * Deskripsi    : berisi atribut dan method dalam sub class Burung dengan konsep polimorfisme
 * Tanggal      : 26 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Burung extends Anabul {
    public Burung(String nama){
        setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println(this.getNama() + " bergerak terbang");
    }

    @Override
    public void bunyi(){
        System.out.println(this.getNama() + " berbunyi cuit");
    }

}
