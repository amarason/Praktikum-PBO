/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8tugas36;

/**
 *
 * @author ACER
 */

/* Nama File: Anabul.java
 * Deskripsi: berisi atribut dan method dalam superclass Anabul
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 12 Mei 2025
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


