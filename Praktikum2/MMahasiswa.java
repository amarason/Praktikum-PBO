/* Nama File    : MMahasiswa.java 
 * Deskripsi    : berisi objek dari class Mahasiswa, MataKuliah, Dosen, dan Kendaraan
 * Tanggal      : 27 Februari 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah IMK = new MataKuliah("IMK", "Interaksi Manusia dan Komputer", 2);
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);          
        M1.addMatkul(MBD);
        M1.addMatkul(IMK);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS()); 
    }
}
