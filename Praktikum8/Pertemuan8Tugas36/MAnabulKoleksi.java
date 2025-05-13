/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8tugas36;

/**
 *
 * @author ACER
 */

/* Nama File: MAnabulKoleksi.java
 * Deskripsi: file main implementasi konsep anabul dengan koleksi
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 12 Mei 2025
*/


public class MAnabulKoleksi {
    public static void main(String[] args) {
      Koleksi<Anabul> KoleksiAnabul = new Koleksi<>(10);
      
      KoleksiAnabul.add(new Kucing("Kitty"));
      KoleksiAnabul.add(new Kucing("Katty"));
      KoleksiAnabul.add(new Kucing("Ketty"));
      KoleksiAnabul.add(new Anjing("Puppy"));
      KoleksiAnabul.add(new Anjing("Pappy"));
      KoleksiAnabul.add(new Anjing("Pippy"));
      KoleksiAnabul.add(new Burung("Perkutut"));
      KoleksiAnabul.add(new Burung("Merpati"));
      KoleksiAnabul.add(new Burung("Burung Unta"));
      KoleksiAnabul.add(new Burung("Burung Hantu"));
      
      KoleksiAnabul.showAll();
      
      System.out.println("Perilaku anabul");
      for (int i=0; i< KoleksiAnabul.getSize(); i++){
        Anabul anabul = KoleksiAnabul.getIsi(i);
        System.out.println(anabul.getNama() + ": ");
        anabul.gerak();
        System.out.println(anabul.getNama() + ": ");
        anabul.bunyi();
        System.out.println();
    }
    } 
}
