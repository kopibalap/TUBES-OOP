/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tubespbo.Pembeli;
/**
 *
 * @author LEGION
 */
public class Penumpang extends User {
    private int idPenumpang, umur;
    private String nama, jenisKelamin, alamat, email, nomorTelepon;
 
    ArrayList<Pembeli> pembeliss = new ArrayList<>();
    JDBC conn;
    
    public Penumpang(String username, String password){
        super(username, password);
        conn.connectDB();
    }

    public int getIdPenumpang() {
        return idPenumpang;
    }

    public void setIdPenumpang(int idPenumpang) {
        this.idPenumpang = idPenumpang;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
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
  
    
    @Override
    public void register(String username, String password, String nama, int umur, String jenisKelamin, String email, String alamat, String nomorTelepon){
        Connection koneksi = conn.connectDB();
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("INSERT INTO user (username, password, namaLengkap, umur, jenisKelamin, email, alamat, nomorTelepon) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, nama);
            ps.setInt(4, umur);
            ps.setString(5, jenisKelamin);
            ps.setString(6, email);
            ps.setString(7, alamat);
            ps.setString(8, nomorTelepon);
            int rs = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void login(){
       Connection koneksi = conn.connectDB();
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                String username = rs.getString(1);
                String password = rs.getString(2);
                //String namaLengkap = rs.getString(4);
                //System.out.println(namaLengkap);
                Penumpang p1 = new Penumpang(username, password);
                p1.setNama(rs.getString(4));
                p1.setJenisKelamin(rs.getString(6));
                p1.setUmur(Integer.parseInt(rs.getString(5)));
                Pembeli pembelis = new Pembeli(rs.getString(4),rs.getString(5),rs.getString(6));
                pembeliss.add(pembelis);
                Beranda beranda = new Beranda(pembelis);
                
                
                
                beranda.setVisible(true);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
