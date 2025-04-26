/* Nama File    : AnabulTest.java
 * Deskripsi    : program utama untuk mengetes class Anabul beserta sub classnya dengan konsep polimorfisme
 * Tanggal      : 26 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004 
 */

 import java.util.ArrayList;

 public class AnabulTest {
     public static void main(String[] args) {
         Anabul hewan1 = new Kucing("Kucing");
         Anabul hewan2 = new Anjing("Anjing");
         Anabul hewan3 = new Burung("Burung");
 
         ArrayList<Anabul> anabul = new ArrayList<>();
         anabul.add(hewan1);
         anabul.add(hewan2);
         anabul.add(hewan3);
 
         for (Anabul hewan : anabul) {
            hewan.gerak();
            hewan.bunyi();
            System.out.println();              
         }
     }
 }
 