/* Nama File    : Manajer.java
 * Deskripsi    : berisi atribut dan method dalam subclass Manajer dengan konsep polimorfisme
 * Tanggal      : 25 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004 
 */


public class Manajer extends Pegawai {
    private static int tunjangan = 700000;
    
    public Manajer(String nama){
        setNama(nama);
    }
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
