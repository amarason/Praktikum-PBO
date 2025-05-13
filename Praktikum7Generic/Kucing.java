/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7generic;

/**
 *
 * @author ACER
 */
/* Nama File: Kucing.java
 * Deskripsi: berisi atribut dan method dalam subclass Kucing 
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 8 Mei 2025
*/

public class Kucing extends Anabul{
    public Kucing(String nama){
        setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println(this.getNama() + " bergerak melata");
    }

    @Override
    public void bunyi(){
        System.out.println(this.getNama() + " berbunyi meong");
    }
    
}
