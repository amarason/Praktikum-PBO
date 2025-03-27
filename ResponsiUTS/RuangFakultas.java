import java.text.DecimalFormat;

public class RuangFakultas extends Ruang {
    // Konstruktor
    public RuangFakultas(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + getKode());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Ukuran: " + getPanjang() + " x " + getLebar() + " x " + getTinggi());
        DecimalFormat formatRupiah = new DecimalFormat("#,###");
        System.out.println("Biaya Kebersihan: Rp " + formatRupiah.format(hitungBiayaKebersihan()));
    }
}