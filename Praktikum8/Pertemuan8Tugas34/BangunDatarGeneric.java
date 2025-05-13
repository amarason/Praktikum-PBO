/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8tugas34;

/**
 *
 * @author ACER
 */

/* Nama File: BangunDatarGeneric.java
 * Deskripsi: kelas kontruksi geenric untuk BangunDatar
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 11 Mei 2025
*/

public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
    
    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}

