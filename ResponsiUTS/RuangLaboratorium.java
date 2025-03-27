import java.text.DecimalFormat;

public class RuangLaboratorium extends RuangFakultas {
    /****ATRIBUT*** */
    private String namaLab;
    private double hargaSewa;

    /****METODH**** */

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }

    public String getNamaLab() { 
        return namaLab; 
    }

    public double getHargaSewa() { 
        return hargaSewa; 
    }

    public void setNamaLab(String namaLab) { 
        this.namaLab = namaLab; 
    }

    public void setHargaSewa(double hargaSewa) { 
        this.hargaSewa = hargaSewa; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Laboratorium: " + namaLab);
        DecimalFormat formatRupiah = new DecimalFormat("#,###");
        System.out.println("Harga sewa: Rp " + formatRupiah.format(hargaSewa));
    }
}