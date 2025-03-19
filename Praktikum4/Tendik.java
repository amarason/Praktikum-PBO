/* Nama File    : Tendik.java 
 * Deskripsi    : berisi atribut dan method dalam class Tendik sebagai subclass dari Pegawai
 * Tanggal      : 14 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Tendik extends Pegawai {
    /************ ATRIBUT *********** */
    private LocalDate BUP;
    private String bidang;

    /************ METHOD ******** */
    public Tendik() {
        super();
        this.BUP = null;
        this.bidang = "";
    }

    public Tendik(String bidang, LocalDate BUP, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.BUP = setBUP();
        this.bidang = bidang;
    }

    public LocalDate setBUP() {
        LocalDate usia55 = getTanggalLahir().plusYears(55);
        return usia55.plusMonths(1).withDayOfMonth(1);
    }

    public LocalDate getBUP() {
        return BUP;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public int getMasaKerjaTahun() {
        return masaKerja().getYears();
    }

    public int getMasaKerjaBulan() {
        return masaKerja().getMonths();
    }

    public double tunjangan() {
        return 0.01 * getGajiPokok() * getMasaKerjaTahun();
    }

    public void printInfo(){
        DateTimeFormatter formattanggal = DateTimeFormatter.ofPattern("d MMMM yyyy");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));

        System.out.println("NIP           : " + getNIP());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir().format(formattanggal));
        System.out.println("TMT           : " + getTMT().format(formattanggal));
        System.out.println("Jabatan       : Tenaga Kependidikan");
        System.out.println("Bidang Kerja  : " + getBidang());
        System.out.println("Masa Kerja    : " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("BUP           : " + getBUP().format(formattanggal));
        System.out.println("Gaji Pokok    : " + formatRupiah.format(getGajiPokok()));
        System.out.println("Tunjangan     : 1% x 10 x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(tunjangan()));
    }
}