/* Nama File    : PNS.java 
 * Deskripsi    : berisi atribut dan method dalam class PNS, subclass dari Manusia 
 * Tanggal      : 21 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

//NIM 14 = 4
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    /********ATRIBUT******** */
    private String nip;
    private static Integer counterPNS=0;

    /*********METHOD********* */
    public PNS(){

    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNIP(){
        return nip;
    }

    public void setnip(String nip){
        this.nip = nip;
    }

    public static Integer getCounterPNS(){
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 4;
    }

    @Override 
    public double hitungPajak(){
        return 0.10*pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
