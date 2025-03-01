/* Nama File    : Kendaraan.java 
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Tanggal      : 27 Februari 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Kendaraan {
    /********ATRIBUT******* */
    private String noPlat;
    private String jenis;

    /**********METHOD******** */
    public Kendaraan() {
        noPlat = " ";
        jenis = " ";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String Plat){
        noPlat = Plat;
    }

    public void setJenis(String Jenis){
        jenis = Jenis;
    }
}
