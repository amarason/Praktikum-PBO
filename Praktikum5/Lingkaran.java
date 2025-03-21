/* Nama File    : Lingkaran.java 
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran sebagai subclass dari BangunDatar
 * Tanggal      : 20 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran(){
    }

    public Lingkaran(double diameter, String warna, String border){
        super(0, warna, border);
        this.jari= diameter/2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas(){
        return Math.PI*jari*jari;
    }

    @Override
    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    @Override
    public void zoomIn(){
        jari = jari*1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * (percent / 100.0);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
