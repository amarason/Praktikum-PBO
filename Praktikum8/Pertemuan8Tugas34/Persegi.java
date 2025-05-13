/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8tugas34;

/**
 *
 * @author ACER
 */

/* Nama File: Persegi.java
 * Deskripsi: implementasi Persegi sebagai BangunDatar
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 11 Mei 2025
*/

public class Persegi extends BangunDatar{

    static void set(Persegi persegi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    public double getSisi(){
        return sisi;
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
    
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
