/* Nama File    : Pengusaha.java 
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha, subclass dari Manusia 
 * Tanggal      : 21 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

//NIM 13 = 0
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak{
    /**ATRIBUT**** */
    private String npwp;
    private static int counterPengusaha=0;

    /***METHOD*** */
    public Pengusaha(){

    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static Integer getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 0; 
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}