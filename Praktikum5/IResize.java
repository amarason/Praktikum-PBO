/* Nama File    : IResize.java 
 * Deskripsi    : berisi method tanpa body pada interface IResize
 * Tanggal      : 20 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public interface IResize {
    public void zoomIn();
    public void zoomOut();
    public void zoom(int percent);
} 

/*Hasil pemanggilan IResize di main berhasil terhadap objek Persegi dan Lingkaran */
/*Keuntungan zoomin(), zoomout(), zoom() dikemas dalam interface IResize adalah memfokuskan kegunaan class IResize untuk menghitung perubahan ukuran yang bisa diterapkan ke kelas lain seperti Garis, Bangun3D, sedangkan BangunDatar berfokus terhadap geometris */