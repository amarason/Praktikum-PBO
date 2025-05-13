/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7generic;

/**
 *
 * @author ACER
 */

/* Nama File: Datum.java
 * Deskripsi: program yang memiliki komponene atribut kelas generik Datum
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 8 Mei 2025
*/

class Datum<G extends Anabul> {
    private G isi;
    
    public G getIsi(){
        return isi;
    }
    
    public void setIsi(G isi){
        this.isi = isi;
    }
}
