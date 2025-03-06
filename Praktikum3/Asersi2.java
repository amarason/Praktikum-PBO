/*File : Asersi2.java 
 * Deskripsi : Program untuk demo asersi, yang menolak input jari-jari lingkaran yang bernilai nol
 * Nama : Amara Putri Soniaji / 2406012310004
 * Tanggal : 6 Maret 2025
*/

//class Lingkaran
class Lingkaran {
    public double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak bokeh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Pada asersi tersebut ada kesalahan konsep tepatnya di saat menghitung keliling lingkaran dengan jari-jari bernilai 0,
ketika dijalankan kode tersebut masih tetap membuat objek lingkaran dengan keliling 0.
Padahal hal itu menyalahi aturan dikarenakan sudah ditetapkan asersinya bahwa jari-jari harus > 0. 
Lalu, di program ini Asersi hanya aktif dengan enableassertion di terminal.
Sehingga kode tetap bisa menghitung kelilingnya walaupun jari-jari= 0   
*/