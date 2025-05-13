/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8koleksi1;

/**
 *
 * @author ACER
 */

/* Nama File: MapTest.java
 * Deskripsi: program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 10 Mei 2025
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        System.out.println(map.get(1));
        Set<Integer> key = map.keySet();
        
        for (Integer k: key){
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        }
    }
}

/*cara iterasi mengambil keputusan
menggunakan keySet() dari Map, iterasi melalui Set key untuk mengeksekusi setiap kunci 
dan mendapatkan nilainya memakai get(k)
*/
