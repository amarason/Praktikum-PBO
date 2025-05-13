/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7generic;

/**
 *
 * @author ACER
 */

/* Nama File: Burung.java
 * Deskripsi: berisi atribut dan method dalam subclass Burung
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 8 Mei 2025
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
