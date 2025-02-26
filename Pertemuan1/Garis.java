/* Nama File    : Garis.java 
 * Deskripsi    : berisi atribut dan method dalam class Garis yang berkaitan dengan class Titik
 * Pembuat      : Amara Putri Soniaji / 24060123120004
 * Tanggal      : 20 Februari 2025
*/


public class Garis {
        //Atribut
        Titik titikAwal;
        Titik titikAkhir;
        static int counterGaris = 0;

        /****************METHOD**************/
        //Konstruktor
        Garis() {
            this.titikAwal = new Titik(0,0);
            this.titikAkhir = new Titik(1,1);
            counterGaris++;
        }

        Garis(Titik titikAwal, Titik titikAkhir) {
            this.titikAwal = titikAwal;
            this.titikAkhir = titikAkhir; 
            counterGaris++;
        }

        //Selektor (getter)
        Titik getTitikAwal() {
            return titikAwal;
        }

        Titik getTitikAkhir() {
            return titikAkhir;
        }

        //Mutator (setter)
        void setTitikAwal(Titik TG) {
            this.titikAwal = TG;
        }

        void setTitikAkhir(Titik TG) {
            this.titikAkhir = TG;
        }

        static int getCounterGaris() {
            return counterGaris;
        }

        //Panjang sebuah garis
        double panjang() {
            double hasilX = (titikAkhir.getAbsis()-titikAwal.getAbsis())*(titikAkhir.getAbsis()-titikAwal.getAbsis());

            double hasilY = (titikAkhir.getOrdinat()- titikAwal.getOrdinat())*(titikAkhir.getOrdinat()- titikAwal.getOrdinat());

            return Math.sqrt(hasilX + hasilY);
        }

        // Gradien atau kemiringan sebuah garis
        double gradien() {
            return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
        }

        //Titik tengah sebuah garis
        void titikTengah() {
            double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
            double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
            System.out.println("Titik tengah garis: (" + tengahX +", " + tengahY + ")");
        }

        //Cek kesejajaran 2 garis
        boolean isSejajar(Garis GB) {
            if (this.gradien() == GB.gradien()) {
                return true;
            } else {
                return false;
            }
        }

        //Cek tegak lurus antara 2 garis
        boolean isTegakLurus(Garis GB) {
            if (this.gradien()*GB.gradien() == -1) {
                return true;
            } else {
                return false;
            }
        }

        //Menampilkan titik awal dan titik akhir
        void printGaris() {
            System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
            System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
        }

        //Menampilkan persamaan garis y= mx + c
        String persGaris() {
            double m = this.gradien();
            double c = titikAwal.getOrdinat() - (this.gradien()*titikAwal.getAbsis());
           return "y = " + m + "x + " + c;
        }
}
