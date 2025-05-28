/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author ACER
 */


import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        koneksi = (Connection) MysqlUtility.getConnection();
    }
    
    //Buat Objek Mahasiswa
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException{
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId((rs.getInt("id")));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }
    
    public void add(Mahasiswa mhs) {
        try {
            String sql = "INSERT INTO person (id, name) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error tambah data: " + e.getMessage());
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET nama=?, WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Error update data: " + e.getMessage());
        }
    }

    // Delete data mahasiswa
    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error delete data: " + e.getMessage());
        }
    }

    // Ambil mahasiswa berdasarkan ID
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error getById: " + e.getMessage());
        }
        return mhs;
    }

    // Ambil semua mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Error getAll: " + e.getMessage());
        }
        return list;
    }
    
    //Reset indeks tabel maahasiswa ke 1...
    public void indexReset(){
        try {
        String sql = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        Statement stmt = koneksi.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Index reset berhasil!");
    } catch (SQLException e) {
        System.out.println("Error indexReset: " + e.getMessage());
    }
    }
    
    //Memeriksa apakah tabel ksoong
    public boolean isEmpty(){
        boolean kosong = true;
    try {
        String sql = "SELECT COUNT(*) AS jumlah FROM mahasiswa";
        Statement stmt = koneksi.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            int jumlah = rs.getInt("jumlah");
            kosong = (jumlah == 0);
        }
    } catch (SQLException e) {
        System.out.println("Error isEmpty: " + e.getMessage());
    }
    return kosong;
    }
    
    //Menutup koneksi le DB
    public void closeConnesction(){
        try {
        if (koneksi != null && !koneksi.isClosed()) {
            koneksi.close();
            System.out.println("Koneksi tertutup.");
        }
    } catch (SQLException e) {
        System.out.println("Error closeConnection: " + e.getMessage());
    }
    }
}

