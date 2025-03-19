/* Nama File    : DosenTetap.java 
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap sebagai subclass dari Dosen
 * Tanggal      : 14 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class DosenTetap extends Dosen  {
    /*******ATRIBUT********** */
    private String NIDN;
    private LocalDate BUP;

    /*********METODE******** */
    public DosenTetap(){
        super();
        this.NIDN= "";
        this.BUP = LocalDate.now();
    }

    public DosenTetap(String NIDN, String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        super(fakultas, NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
        this.BUP = hitungBUP();
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public LocalDate hitungBUP(){
        LocalDate usia65 = getTanggalLahir().plusYears(65);
        return usia65.plusMonths(1).withDayOfMonth(1);
    }

    public LocalDate getBUP(){
        return BUP;
    }

    public void setBUP(LocalDate BUP){
        this.BUP = BUP;
    }

    public int getMasaKerjaTahun() {
        return masaKerja().getYears();
    }

    public int getMasaKerjaBulan() {
        return masaKerja().getMonths();
    }

    public double tunjangan(){
        return 0.02 * getGajiPokok() * getMasaKerjaTahun();
    }

    public void printInfo(){
        DateTimeFormatter formattanggal = DateTimeFormatter.ofPattern("d MMMM yyyy");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        System.out.println("NIP          : " + getNIP());
        System.out.println("NIDN         : " + getNIDN());
        System.out.println("Nama         : " + getNama());
        System.out.println("Tanggal Lahir: " + getTanggalLahir().format(formattanggal));
        System.out.println("TMT          : " + getTMT().format(formattanggal));
        System.out.println("Jabatan      : Dosen Tetap");
        System.out.println("Fakultas     : " + getFakultas());
        System.out.println("Masa Kerja   : " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("BUP          : " + getBUP().format(formattanggal));
        System.out.println("Gaji Pokok   : " + formatRupiah.format(getGajiPokok()));
        System.out.println("Tunjangan    : 2% x " + getMasaKerjaTahun() + " x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(tunjangan()));
    }
}
