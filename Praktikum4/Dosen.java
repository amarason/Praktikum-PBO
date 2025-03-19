/* Nama File    : Dosen.java 
 * Deskripsi    : berisi atribut dan method dalam class Dosen sebagai subclass dari Pegawai
 * Tanggal      : 14 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/


import java.time.LocalDate;

public class Dosen extends Pegawai {
    /********ATRIBUT******* */
    private String fakultas;

    /********METHOD****** */
    public Dosen(){
        super();
        this.fakultas = "";

    }

    public Dosen(String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
