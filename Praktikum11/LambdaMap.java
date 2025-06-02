package pertemuan11lambda;

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("0004", "Amara");
        mahasiswaMap.put("004", "Putri");
        
        //tanpa blok statement
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : "+ nama));
        
        //pakai blok statement
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " Nama: " + nama);
      
            
        });
        
    }
}