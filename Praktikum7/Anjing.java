/* Nama File    : Anjing.java 
 * Deskripsi    : berisi atribut dan method dalam sub class Anjing dengan konsep polimorfisme
 * Tanggal      : 26 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Anjing extends Anabul{
    public Anjing(String nama){
        setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println(this.getNama() + " bergerak melata");
    }

    @Override
    public void bunyi(){
        System.out.println(this.getNama() + " berbunyi guk-guk");
    }
}   

