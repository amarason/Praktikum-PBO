/* Nama File    : Titik.java 
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Amara Putri Soniaji / 24060123120004
 * Tanggal      : 20 Februari 2025
*/


public class Titik {
     /*************ATRIBUT*************/
     double absis;
     double ordinat;  //double tipe data primitif untuk merepresentasikan angka desimal
     static int counterTitik = 0;
 
     /*************METHOD*************/
     //konstruksi untuk membuat titik (0,0)
     Titik() {
         absis = 0;
         ordinat = 0;
         counterTitik++;
     }

     Titik(double absis, double ordinat) {
        this.absis = absis ;
        this.ordinat = ordinat;
        counterTitik++;
     }

     //konstruktor untuk membuat Titik (0,0)
    // Titik() {
    //     this(0,0);
    // }
 
     //menggunakan nilai absis
     double getAbsis() {
         return absis;
     }
 
     //mengembalikan nilai ordinat
     double getOrdinat() {  
         return ordinat;
     }
 
     //mengeset absis titik dengan nilai baru x
     void setAbsis(double x) {
         absis = x;
     }
 
     //mengeset absis titik dengan nilai baru x
     void setOrdinat(double y) {
         ordinat = y;
     }
 
     //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
     void geser(double x, double y) {
         absis = absis + x;
         ordinat = ordinat + y;
     }
 
     //mencetak koordinat titik
     void printTitik() {
         System.out.println("Titik (" + absis + "," + ordinat + ")");
     }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    void printCounterTitik() {
        System.out.println(Titik.counterTitik);
    }

    int getKuardran() {
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else{
            return 4;
        }
    }
        
    double getJarakPusat() {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik T) {
        return Math.sqrt(((T.getAbsis() - this.absis)*(T.getAbsis() - this.absis)) + ((T.getOrdinat() - this.ordinat)*(T.getOrdinat() - this.ordinat)));
    }

    void refleksiX() {
        ordinat =  ordinat*(-1);
    }

    void refleksiY() {
        absis =  absis*(-1);
    }

    Titik getRefleksiX() {
        return new Titik(getAbsis(), getOrdinat()*-1);
    }

    Titik getRefleksiY() {
        return new Titik(getAbsis()*-1, getOrdinat());
    }

} //end class Titik
