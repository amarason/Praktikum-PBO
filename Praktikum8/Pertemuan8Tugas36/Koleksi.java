/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8tugas36;

/**
 *
 * @author ACER
 */

/* Nama File: Koleksi.java
 * Deskripsi: berisi atribut dan method dalam class Koleksi
 * Nama/NIM: Amara Putri Soniaji/ 24060123120004
 * Tanggal: 12 Mei 2025
*/

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;
    
    public Koleksi(int size){
        this.nbelm = 0;
        this.wadah = new ArrayList<>(size);
    }
    
    public int getSize(){
        return this.nbelm;
    }
    
    public void setSize(int x){
        this.nbelm = x;
    }
    
    public T getIsi(int indeks){
        return this.wadah.get(indeks);
    }
    
    public void setIsi(int indeks, T e){
        this.wadah.set(indeks, e);
    }
    
    public void add(T e){
        this.wadah.add(e);
        this.nbelm++;
    }
    
    public void delete(int indeks){
        for (int i=indeks; i<this.nbelm-1; i++){
            this.wadah.set(i, this.wadah.get(i+1));
        }
        this.wadah.set(this.nbelm-1, null);
        this.nbelm = this.nbelm -1;
    }
    
    public void showAll(){
        for (int i=0; i<this.nbelm; i++){
            System.out.println(this.wadah.get(i));
        }
    }
}

