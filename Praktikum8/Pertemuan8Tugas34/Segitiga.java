/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8tugas34;

/**
 *
 * @author ACER
 */

/* Nama File: Segitigas.java
 * Deskripsi: implementasi Segitiga sebagai BangunDatar
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 11 Mei 2025
*/

public class Segitiga extends BangunDatar {
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    public Segitiga(double sisiA, double sisiB, double sisiC){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
    
    public double getSisiA(){
        return sisiA;
    }
    
    public void setSisiA(double sisiA){
        this.sisiA = sisiA;
    }
    
    public double getSisiB(){
        return sisiB;
    }
    
    public void setSisiB(double sisiB){
        this.sisiB = sisiB;
    }
    
    public double getSisiC(){
        return sisiC;
    }
    
    public void setSisiC(double sisiC){
        this.sisiC = sisiC;
    }
    
    @Override
    public double hitungKeliling(){
        return sisiA + sisiB + sisiC;
    }
    
    @Override
    public double hitungLuas(){
        double s = (sisiA+sisiB+sisiC)/2;
        return Math.sqrt(s* (s-sisiA)*(s-sisiB)*(s- sisiC));
    }
}
