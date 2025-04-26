/* Nama File    : TestPolimorfisme.java
 * Deskripsi    : program utama untuk mengetes class Pegawai beserta sub classnya dengan konsep polimorfisme
 * Tanggal      : 25 April 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004 
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {

        System.out.println("Nama: Amara Putri Soniaji 24060123120004");
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        // Programmer pegawai4 = new Programmer("Adit");
        // Manajer pegawai5 = new Manajer("Ani");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps){
            emp.tampilData();
        }    }
}

//JAWABAN:
/*2. Polimorfisme di kasus itu berjenis inclusion karena objek programmer  dari subclass programmer dan manajer dari subclass manajer pmemakai referensi parents (superclass) Pegawai.
 * Hal ini memberikan kemudahan mengeola beberapa objek yang berbeda dalam satu keturunan saat penggunaan ArrayList yang sama dan untuk menampilkan info lengkap hanya perlu memanggil emp.tanpilData(),
 * tidak akan eror walaupun objekna berbeda

*/

/*3. Jika membuat pegawai4 dan pegawai5 tanpa polimorfisme inclusion, akan eror di perulangan for  karena semua objek Pegawai disimpan di ArrayList bertipe pegawai, sehingga setiap ada jenis pegawai baru, 
maka perlu mmembuat list sebanyak n jenis pegawai dan  n for loop.
*/
