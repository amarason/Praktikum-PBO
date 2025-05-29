/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author ACER
 */

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        
        System.out.println("");
        
        System.out.println("===Insert");
        Mahasiswa addMahasiswa = new Mahasiswa(4, "Ujang Spakbor");
        service.add(addMahasiswa);
        System.out.println("berhasil insert" + addMahasiswa);
    }
}
