/*File : AngkaSial.java 
 * Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Nama : Amara Putri Soniaji / 2406012310004
 * Tanggal : 6 Maret 2025
*/

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +"bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!!");
        }
    }
}

/*1. Baris 13 di program saya {System.out.println(angka +"bukan angka sial")} tidak dieksekusi saat ekssepsi terjadi.
Hal ini karena kode tersebut berada setelah {throw new AngkaSialException()} sehingga kode berhenti berjalan
2. Baris 22 di program saya {catch(AngkaSialException ase)} dieksekusi saat method cobaAngka dipanggil 13.
Hal itu akibat dari eksepsi dari try. Sehingga program keluar dari blok try dan mamsuk ke blok catch untuk menangani eksepsi dan mengeluarkan message kesalahan
 */
