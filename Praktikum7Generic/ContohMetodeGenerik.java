/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7generic;

/**
 *
 * @author ACER
 */

/* Nama File: ContohMetodeGenerik.java
 * Deskripsi: program yang memiliki metode/fingsi/prosedur generik yang dapat mengendalikan kelas Datum
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 8 Mei 2025
*/

public class ContohMetodeGenerik {
    public static <G extends Anabul> G Fungsi(Datum<G> D) {
        return D.getIsi();
    }

    public static <G extends Anabul> void Prosedur(Datum<G> D) {
        G anabul = D.getIsi();
        anabul.gerak(); 
        anabul.bunyi(); 
    } 
}
