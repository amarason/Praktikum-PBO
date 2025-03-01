/* Nama File    : MataKuliah.java 
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Tanggal      : 27 Februari 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class MataKuliah {
    /*************ATRIBUT************ */
    private String idMatkul;
    private String nama;
    private Integer sks;
    
    /*******METHOD***********/
    public MataKuliah() {
        idMatkul = " ";
        nama = " ";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, Integer sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public Integer getSks() {
        return sks;
    }

    public void setIdMatkul(String ID) {
        idMatkul = ID;
    }

    public void setNama(String Nama) {
        nama = Nama;
    }

    public void setSks(Integer SKS) {
        sks = SKS;
    }
}
