/* Nama File    : Progammer.java
 * Deskripsi    : berisi atribut dan method dalam subclass Programmer dengan konsep polimorfisme
 * Tanggal      : 24 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004 
 */

public class Programmer extends Pegawai{
    private static int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }

}

