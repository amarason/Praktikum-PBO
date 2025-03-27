public class RuangDept extends Ruang {
    /***** ATRIBUT *****/
    private String namaDepartemen;
    private String ketuaDepartemen;
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;

    /*** KONSTRUKTOR ***/
    public RuangDept(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaDepartemen, String ketuaDepartemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
    }


    public String getNamaDepartemen() { 
        return namaDepartemen; 
    }

    public String getKetuaDepartemen() { 
        return ketuaDepartemen; 
    }

    public int getJumlahMeja() { 
        return jumlahMeja; 
    }

    public int getJumlahKursi() { 
        return jumlahKursi; 
    }

    public int getJumlahLemari() { 
        return jumlahLemari; 
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + getKode());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Nama Departemen: " + namaDepartemen);
        System.out.println("Ketua Departemen: " + ketuaDepartemen);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        DecimalFormat formatRupiah = new DecimalFormat("#,###");
        System.out.println("Biaya Kebersihan: Rp " + formatRupiah.format(hitungBiayaKebersihan()));
}
}
