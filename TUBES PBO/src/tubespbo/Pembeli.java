/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AdhiyaksaHutama
 */
public class Pembeli {
   
    private int idPenumpang,q;
    private String nama, jenisKelamin, alamat, email, nomorTelepon,umur;
 
    public ArrayList<Pembeli> pembeliss = new ArrayList<>();
    JDBC conn;
    public Pembeli(){
        
    };
    public Pembeli(String nama, String umur, String jenisKelamin){
       setNama(nama);
       setUmur(umur);
       setJenisKelamin(jenisKelamin);
    }

    public int getIdPenumpang() {
        return idPenumpang;
    }

    public void setIdPenumpang(int idPenumpang) {
        this.idPenumpang = idPenumpang;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
   public void pembelian(String nama,String nama_penumpangs, String umur, String jenisKelamin, String nama_kereta, String gerbong, String kelas, String jadwal_brkt, String jadwal_tiba, String stasiun_asal, String stasiun_tujuan){
        Connection koneksi = conn.connectDB();
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("INSERT INTO tiket (nama_penumpang,nama_penumpangs,umur, jenis_kelamin, nama_kereta, gerbong, kelas, jadwal_berangkat, jadwal_tiba, stasiun_asal, stasiun_tujuan) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, nama);
            ps.setString(2, nama_penumpangs);
            ps.setString(3, umur);
            ps.setString(4, jenisKelamin);
            ps.setString(5, nama_kereta);
            ps.setString(6, gerbong);
            ps.setString(7, kelas);
            ps.setString(8, jadwal_brkt);
            ps.setString(9, jadwal_tiba);
            ps.setString(10, stasiun_asal);
            ps.setString(11, stasiun_tujuan);
            int rs = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void EditTiket(int id,String nama_penumpangs, String umur, String jenisKelamin, String nama_kereta, String gerbong, String kelas, String jadwal_brkt, String jadwal_tiba, String stasiun_asal, String stasiun_tujuan){
        Connection koneksi = conn.connectDB();
        System.out.println(nama_kereta);
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("UPDATE tiket set nama_penumpangs = ?, umur= ?,jenis_kelamin= ?, nama_kereta= ?,gerbong= ?, kelas= ?, jadwal_berangkat = ?, jadwal_tiba= ?, stasiun_asal= ?, stasiun_tujuan= ? WHERE id = ?    ");
                
                ps.setString(1, nama_penumpangs);
                ps.setString(2, umur);
                ps.setString(3, jenisKelamin);
                ps.setString(4, nama_kereta);
                ps.setString(5, gerbong);
                ps.setString(6, kelas);
                ps.setString(7, jadwal_brkt);
                ps.setString(8, jadwal_tiba);
                ps.setString(9, stasiun_asal);
                ps.setString(10, stasiun_tujuan);
                ps.setInt(11, id);    
                ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void refund(int id){
        Connection koneksi = conn.connectDB();
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("DELETE FROM tiket WHERE id = ?");
                ps.setInt(1, id);
          
                ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
}
