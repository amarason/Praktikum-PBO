/* Nama File    : Dosen.java 
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Tanggal      : 27 Februari 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Dosen {
    /**************ATRIBUT************* */
    private String nip;
    private String nama;
    private String prodi;

    /*****************METHOD********* */
    public Dosen() {
        nip = " ";
        nama = " ";
        prodi = " ";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String NIP) {
        nip = NIP;
    }

    public void setNama(String Nama) {
        nama = Nama;
    }

    public void setProdi(String Prodi) {
        prodi = Prodi;
    }







    
}
