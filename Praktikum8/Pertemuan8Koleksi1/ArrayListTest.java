/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8koleksi1;

/**
 *
 * @author ACER
 */

/* Nama File: ArrayListTest.java
 * Deskripsi: program penggunaan objek ArrayList sebagai Collection class
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 8 Mei 2025
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        for (String s : strings){
            System.out.print(s +" ");
        }
    }
}
