/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8tugas34;

/**
 *
 * @author ACER
 */
/* Nama File: BngunDatarGenericTest.java
 * Deskripsi: main class untuk generic bangun datar
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 11 Mei 2025
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        //Persegi
        Persegi persegi = new Persegi(5);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        bdgPersegi.set(persegi);
        System.out.println("Keliling persegi: " + bdgPersegi.hitungKeliling());
        System.out.println("Luas persegi: " + bdgPersegi.get().hitungLuas());
        System.out.println();
        
        //Persegi Panjang
        PersegiPanjang persegipanjang = new PersegiPanjang(6,4);
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<>();
        bdgPersegiPanjang.set(persegipanjang);
        System.out.println("Keliling persegi panjang: " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("Luas persegi panjang: " + bdgPersegiPanjang.get().hitungLuas());
        System.out.println();
        
        //Segitiga
        Segitiga segitiga = new Segitiga(5,8,2);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        bdgSegitiga.set(segitiga);
        System.out.println("Keliling segitiga: " + bdgSegitiga.hitungKeliling());
        System.out.println("Luas segitiga: " + bdgSegitiga.get().hitungLuas());
        System.out.println();
    }
}
