/* Nama File    : Petani.java 
 * Deskripsi    : berisi atribut dan method dalam  class Petani,  subclass dari Manusia
 * Tanggal      : 21 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

//NIM 12 = 0
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak{
    /********ATRIBUT******** */
    private String asal_kota;
    private static Integer counterPetani=0;

    /***********METODE********* */
    public Petani(){

    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static Integer getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 0; 
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal kota: " + asal_kota);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
