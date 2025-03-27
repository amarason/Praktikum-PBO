public class MFSM {
    public static void main(String[] args) {
        // Membuat objek Ruang Kelas
        RuangKelas ruangKelas = new RuangKelas("RK101", 10.0, 8.0, 3.5, 40, 5000, 20, 40);
        System.out.println("=== Informasi Ruang Kelas ===");
        ruangKelas.printInfo();
        System.out.println();

        // Membuat objek Ruang Laboratorium Komputer
        LabKomputer labKom = new LabKomputer("LAB-KOM1", 12.0, 10.0, 3.5, 30, 6000, "Lab Pemrograman", 500000, 25);
        System.out.println("=== Informasi Lab Komputer ===");
        labKom.printInfo();
        System.out.println();

        // Membuat objek Ruang Laboratorium Non-Komputer
        LabNonKomputer labNonKom = new LabNonKomputer("LAB-KIMIA1", 15.0, 10.0, 4.0, 25, 7000, "Lab Kimia", 700000, "Kimia Organik");
        System.out.println("=== Informasi Lab Non-Komputer ===");
        labNonKom.printInfo();
        System.out.println();

        RuangDept ruangDept = new RuangDept("DEPT-01", 20.0, 15.0, 4.0, 10, 8000,"Teknik Informatika", "Dr. Budi Santoso", 5, 20, 3);
        System.out.println("=== Informasi Ruang Departemen ===");
        ruangDept.printInfo();
        System.out.println();

        RuangDosen ruangDosen = new RuangDosen("DOSEN-01", 6.0, 5.0, 3.0, 2, 3000, "Prof. Imam, S.T., M.T.", 1, 2);
        System.out.println("=== Informasi Ruang Dosen ===");
        ruangDosen.printInfo();
        System.out.println();
    }
}
