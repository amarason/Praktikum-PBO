/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8koleksi1;

/**
 *
 * @author ACER
 */

/* Nama File: BngunDatarGenericTest.java
 * Deskripsi: main class untuk generic bangun datar
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 10 Mei 2025
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();
        bdg.set(l);
        System.out.println("keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());    
    }
}