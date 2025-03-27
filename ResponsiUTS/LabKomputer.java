public class LabKomputer extends RuangLaboratorium {
    /****ATRIBUT**** */
    private int jumlahKomputer;

    /****METHOD**** */

    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }

    public int getJumlahKomputer() { 
        return jumlahKomputer; 
    }

    public void setJumlahKomputer(int jumlahKomputer) { 
        this.jumlahKomputer = jumlahKomputer; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}

