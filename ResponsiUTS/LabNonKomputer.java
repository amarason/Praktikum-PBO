public class LabNonKomputer extends RuangLaboratorium {
    /**ATRIBUT*** */
    private String mataKuliahHandled;

    /***METHOD**** */
    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaLab, double hargaSewa, String mataKuliahHandled) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan, namaLab, hargaSewa);
        this.mataKuliahHandled = mataKuliahHandled;
    }

    public String getMataKuliahHandled() {
        return mataKuliahHandled;
    }

    public void setMataKuliahHandled(String mataKuliahHandled) {
        this.mataKuliahHandled = mataKuliahHandled;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mata Kuliah yang Ditangani: " + mataKuliahHandled);
    }
}
