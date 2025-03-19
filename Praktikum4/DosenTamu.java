/* Nama File    : DosenTamu.java 
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu sebagai subclass dari Dosen
 * Tanggal      : 14 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class DosenTamu extends Dosen {
    /**********ATRIBUT******** */
    private String NIDK;
    private LocalDate tenggatKontrak;

    /**********METHOD*********** */
    public DosenTamu(){
        super();
        this.NIDK = "";
        this.tenggatKontrak = null;
    }

    public DosenTamu(String NIDK, LocalDate tenggatKontrak, String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        super(fakultas, NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.tenggatKontrak = tenggatKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public LocalDate getTenggatKontrak(){
        return tenggatKontrak;
    }

    public void setTenggatKontrak(LocalDate tenggatKontrak){
        this.tenggatKontrak = tenggatKontrak;
    }

    public int getMasaKerjaTahun() {
        return masaKerja().getYears();
    }

    public int getMasaKerjaBulan() {
        return masaKerja().getMonths();
    }

    public double tunjangan(){
        return 0.025 * getGajiPokok() * getMasaKerjaTahun();
    }

    public void printInfo(){
        DateTimeFormatter formattanggal = DateTimeFormatter.ofPattern("d MMMM yyyy");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        System.out.println("NIP           : " + getNIP());
        System.out.println("NIDK          : " + getNIDK());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir().format(formattanggal));
        System.out.println("TMT           : " + getTMT().format(formattanggal));
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa Kerja    : " + masaKerja().getYears() + " tahun " + masaKerja().getMonths() + " bulan");
        System.out.println("Tenggat Kontrak: " + getTenggatKontrak().format(formattanggal));
        System.out.println("Gaji Pokok    : " + formatRupiah.format(getGajiPokok()));
        System.out.println("Tunjangan     : 2,5% x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(tunjangan()));
    }
}
