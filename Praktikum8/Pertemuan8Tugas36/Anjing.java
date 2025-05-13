/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8tugas36;

/**
 *
 * @author ACER
 */

/* Nama File: Anjing.java
 * Deskripsi: berisi atribut dan method dalam subclass Anjing 
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 12 Mei 2025
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

