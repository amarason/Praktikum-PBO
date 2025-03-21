/* Nama File    : Persegi.java 
 * Deskripsi    : berisi atribut dan method dalam class Persegi sebagai subclass dari BangunDatar
 * Tanggal      : 20 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Persegi extends BangunDatar implements IResize {
    protected double sisi;

    public Persegi(){
    }   

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(Integer sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2)*sisi;
    }

    @Override
    public void zoomIn(){
        sisi = sisi*1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * (percent / 100.0);
    }


    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: "+sisi);
    }

}

