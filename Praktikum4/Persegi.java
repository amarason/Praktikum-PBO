/* Nama File    : Persegi.java 
 * Deskripsi    : berisi atribut dan method dalam class Persegi sebagai subclass dari BangunDatar
 * Tanggal      : 13 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/


public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }   

    public Persegi(double sisi, String warna, String border){
        setJmlSisi(4);
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        //BAGIAN 2: Modifikasi isi konstruktor dengan memanfaatkan keyword super
        // super(4, warna, border);
        // this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2)*sisi;
    }

    //BAGIAN 3: Override method printInfo
    @Override
    public void printInfo(){
        // System.out.println("Jumlah sisi: "+ getJmlSisi());
        // System.out.println("Warna:"+ getWarna());
        // System.out.println("Border:"+ getBorder());
        // System.out.println("Sisi: "+ sisi);
        super.printInfo();
        System.out.println("Sisi: "+sisi);
    }
    
    //BAGIAN 3: Overriding method printCounterBangunDatar()
    // @Override
    // public static void printCounterBangunDatar(){
    //     System.out.println("Jumlah objek bangun datar: "+ counterBangunDatar);
    // }

}

/*Konstruktor persegi itu dapat direalisasikan, tetapi tergantung pada sifat atribut warna dan border di class BangunDatar. 
Jika 2 atribut itu bersifat private maka konstruktor persegi tersebut tidak bisa akses langsung*/
