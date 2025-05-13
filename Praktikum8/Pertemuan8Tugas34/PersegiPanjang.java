/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8tugas34;

/**
 *
 * @author ACER
 */

/* Nama File: PersegiPanjang.java
 * Deskripsi: implementasi Persegi Panjang sebagai BangunDatar
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 11 Mei 2025
*/

public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }
    
    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }
}
