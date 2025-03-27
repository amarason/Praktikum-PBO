public class RuangKelas extends RuangFakultas {
    /****ATRIBUT**** */
    private int jumlahMeja;
    private int jumlahKursi;
    
    /***METHOD*** */
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, int jumlahMeja, int jumlahKursi) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahMeja() { 
        return jumlahMeja; 
    }

    public int getJumlahKursi() { 
        return jumlahKursi; 
    }

    public void setJumlahMeja(int jumlahMeja) { 
        this.jumlahMeja = jumlahMeja; 
    }
    public void setJumlahKursi(int jumlahKursi) { 
        this.jumlahKursi = jumlahKursi; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}