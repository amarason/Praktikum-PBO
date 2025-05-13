/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8koleksi1;

/**
 *
 * @author ACER
 */

/* Nama File: Lingkaran.java
 * Deskripsi: implementasi Lingkaran sebagai BangunDatar
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 10 Mei 2025
*/

public class Lingkaran extends BangunDatar {
    private double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    public double getSisi(){
        return jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }   
}
