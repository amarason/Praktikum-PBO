/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7generic;

/**
 *
 * @author ACER
 */

/* Nama File: MAnabulGeneric.java
 * Deskripsi: file main implemntasi anabul denagn konsep generic
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 8 Mei 2025
*/

import java.util.ArrayList;

public class MAnabulGeneric {
    public static void main(String[] args) {
        Datum<Anabul> D = new Datum<>();
        Datum<Anabul> D2 = new Datum<>();
        Datum<Anabul> D3 = new Datum<>();

        D.setIsi(new Kucing("Kucing"));
        D2.setIsi(new Anjing("Anjing"));
        D3.setIsi(new Burung("Burung"));

        ArrayList<Datum<Anabul>> daftarDatum = new ArrayList<>();
        daftarDatum.add(D);
        daftarDatum.add(D2);
        daftarDatum.add(D3);

        ContohMetodeGenerik CMG= new ContohMetodeGenerik();
        for (Datum<Anabul> datum : daftarDatum) {
            Anabul anabul = CMG.Fungsi(datum);
            System.out.println("Nama: " + anabul.getNama());
            CMG.Prosedur(datum);
            System.out.println("");
        }
    }
}



 
