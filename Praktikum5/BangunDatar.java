/* Nama File    : BangunDatar.java 
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar sebagai superclass dengan konsep abstract 
 * Tanggal      : 20 Maret 2025
 * Nama/NIM     : Amara Putri Soniaji/24060123120004
*/

abstract class BangunDatar {
    /***********ATRIBUT*************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    
    /*********METHOD************ */
    public BangunDatar(){
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
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

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: "+ jmlSisi);
        System.out.println("Warna: "+ warna);
        System.out.println("Border: "+ border);
    }
}

