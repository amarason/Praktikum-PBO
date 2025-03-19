/* Nama File    : BangunDatar.java 
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar sebagai superclass
 * Tanggal      : 13 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

public class BangunDatar {
//BAGIAN 5: Mengubah class BangunDatar menjadi final
// public final class BangunDatar{

    /***********ATRIBUT*************/
    // private int jmlSisi;
    // private String warna;
    // private String border;
    private static int counterBangunDatar=0;
    //BAGIAN 4: Memodifikasi atribut menjadi protected agar dapat diakses oleh subclass
    protected int jmlSisi;
    protected String warna;
    protected String border;
    
    /*********METHOD************ */
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;       
    }

    public void printInfo(){
    //BAGIAN 5: Mengubah method printInfo menjadi final    
    // public final void printInfo(){
        System.out.println("Jumlah sisi: "+ jmlSisi);
        System.out.println("Warna: "+ warna);
        System.out.println("Border: "+ border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar: "+ counterBangunDatar);
    }
}

/* Overriding pada method printCounterBangunDatar pada subclass dari BangunDatar tidak akan berhasil karena method itu bersifat static dan di java static method tidak bisa dioverride*/

/*Jika menambahkan final di class BnagunDatar maka persegi dan lingkaran tidak dapat mewarisi BangunDatar akan muncul eror */

/*Jika menambahkan final di method prinInfo(), method itu tidak bisa dioverride oleh Persegi dan Lingkaran maka akan muncul eror */