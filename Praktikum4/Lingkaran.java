/* Nama File    : Lingkaran.java 
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran sebagai subclass dari BangunDatar
 * Tanggal      : 13 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){

    }

    public Lingkaran(double diameter, String warna, String border){
        //BAGIAN 2: Modifikasi isi konstruktor dengan memanfaatkan keyword super
        super(0, warna, border);
        this.jari= diameter/2;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(0);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*jari*jari;
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    //BAGIAN 3: Override method printInfo
    @Override
    public void printInfo(){
        // System.out.println("Jumlah sisi: "+ getJmlSisi());
        // System.out.println("Warna:"+ getWarna());
        // System.out.println("Border:"+ getBorder());
        // System.out.println("Jari: "+ jari);
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
