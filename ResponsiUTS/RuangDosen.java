import java.text.DecimalFormat;

public class RuangDosen extends Ruang {
    /**** ATRIBUT ***/
    private String namaDosen;
    private int jumlahMejaDosen;
    private int jumlahKursiDosen;
    private String namaDepartment;

    /****** METODE ****/
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaDosen, int jumlahMejaDosen, int jumlahKursiDosen) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.namaDosen = namaDosen;
        this.jumlahMejaDosen = jumlahMejaDosen;
        this.jumlahKursiDosen = jumlahKursiDosen;
    }

    public String getNamaDepartment() {
        return namaDepartment;
    }

    public void setNamaDepartment(String namaDepartment) {
        this.namaDepartment = namaDepartment;
    }

    public String getNamaDosen() { 
        return namaDosen; 
    }

    public int getJumlahMejaDosen() { 
        return jumlahMejaDosen; 
    }

    public int getJumlahKursiDosen() { 
        return jumlahKursiDosen; 
    }

    public void setNamaDosen(String namaDosen) { 
        this.namaDosen = namaDosen; 
    }
    
    public void setJumlahMejaDosen(int jumlahMejaDosen) { 
        this.jumlahMejaDosen = jumlahMejaDosen; 
    }
    
    public void setJumlahKursiDosen(int jumlahKursiDosen) { 
        this.jumlahKursiDosen = jumlahKursiDosen; 
    }    

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + getKode());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Jumlah Meja Dosen: " + jumlahMejaDosen);
        System.out.println("Jumlah Kursi Dosen: " + jumlahKursiDosen);
        DecimalFormat formatRupiah = new DecimalFormat("#,###");
        System.out.println("Biaya Kebersihan: Rp " + formatRupiah.format(hitungBiayaKebersihan()));
    }
}
