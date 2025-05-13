/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8tugas35;

/**
 *
 * @author ACER
 */

/* Nama File: MainKoleksi.java
 * Deskripsi: file main implementasi kelas Koleksi
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 12 Mei 2025
*/

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiAngka = new Koleksi<Character>(10);
        
        koleksiAngka.add('0');
        koleksiAngka.add('1');
        koleksiAngka.add('2');
        koleksiAngka.add('3');
        koleksiAngka.add('4');
        koleksiAngka.add('5');
        koleksiAngka.add('6');
        koleksiAngka.add('7');
        koleksiAngka.add('8');
        koleksiAngka.add('9');
        
        
        System.out.println("Elemen koleksi: ");
        koleksiAngka.showAll();
        
        koleksiAngka.delete();
        System.out.println("Koleksi setelah didelete: ");
        koleksiAngka.showAll();
        
    }
    
}
