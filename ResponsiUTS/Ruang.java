public abstract class Ruang {
    // Atribut
    private String kode;
    private int kapasitas;
    private double tarifKebersihan;
    private double panjang;
    private double lebar;
    private double tinggi;

    // Konstruktor asbtrac harus portected
    protected Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan) {
        try {
            if (panjang <= 0 || lebar <= 0 || tinggi <= 0 || kapasitas < 0 || tarifKebersihan < 0) {
                throw new IllegalArgumentException("Nilai harus lebih dari 0");
            }
            this.kode = kode;
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
            this.kapasitas = kapasitas;
            this.tarifKebersihan = tarifKebersihan;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public String getKode() { 
        return kode; 
    }
    public void setKode(String kode) { 
        this.kode = kode; 
    }

    public int getKapasitas() { 
        return kapasitas; 
    }
    public void setKapasitas(int kapasitas) { 
        this.kapasitas = kapasitas; 
    }

    public double getTarifKebersihan() { 
        return tarifKebersihan; 
    }
    public void setTarifKebersihan(double tarifKebersihan) { 
        this.tarifKebersihan = tarifKebersihan; 
    }

    public double getPanjang() { 
        return panjang; 
    }
    public double getLebar() { 
        return lebar; 
    }
    public double getTinggi() { 
        return tinggi; 
    }

    public double hitungBiayaKebersihan() {
        return panjang * lebar * tarifKebersihan;
    }

    public abstract void printInfo();
}