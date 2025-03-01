/* Nama File    : Mahasiswa.java 
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Tanggal      : 27 Februari 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/


import java.util.ArrayList;

public class Mahasiswa {
    /********ATRIBUT********/
    private String nim;
    private String nama;    
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**********METHOD************ */
    public Mahasiswa() {
        nim = " ";
        nama = " ";
        prodi = " ";
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi; 
        this.listMatkul = new ArrayList<>();
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    } 

    public Dosen getDosenWali(){
        return dosenWali;
    } 

    public Kendaraan getKendaraan(){
        return kendaraan;
    } 

    public ArrayList<MataKuliah>getListMataKuliah(){
        return new ArrayList<>(listMatkul);
    }
    
    public void setNim(String Nim) {
        nim = Nim;
    }

    public void setNama(String Nama) {
        nama = Nama;
    }

    public void setProdi(String Prodi) {
        prodi = Prodi;
    }

    public void setDosenWali(Dosen doswal) {
        this.dosenWali = doswal;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void setListMataKuliah(ArrayList<MataKuliah> listmk){
        this.listMatkul = listmk;
    }

    public void addMatkul(MataKuliah mk) {
        listMatkul.add(mk);
    }

    public Integer getJumlahSKS() {
        Integer jumlah = 0;
            for (int i=0; i< listMatkul.size(); i++) {
                jumlah += listMatkul.get(i).getSks();
            }
        return jumlah;
    }

    public Integer getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.print("Daftar MK: ");
        for (int i= 0; i<listMatkul.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(listMatkul.get(i).getNama());
        }
        System.out.println(); 
        System.out.println("Dosen Wali: " + dosenWali.getNama() + " - " + dosenWali.getNip());
        System.out.println("Kendaraan: " + kendaraan.getNoPlat() + " - " + kendaraan.getJenis());
    }
}
