/* Nama File    : Pegawai.java 
 * Deskripsi    : berisi atribut dan method dalam class Pegawai sebagai superclass
 * Tanggal      : 14 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /******ATRIBUT********** */
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private double gajiPokok;

    /***********METHOD******** */
    public Pegawai(){

    }

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }
    
    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }   

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }   

    public void setTanggalLahir(LocalDate tanggalLahir){
       this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public Period masaKerja() {
        if (TMT == null) {
            return Period.ZERO;
        }
        return Period.between(TMT, LocalDate.now());
    }
}


