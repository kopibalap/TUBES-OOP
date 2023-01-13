package tubespbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {
    private int idAdmin;
    private User dataUser;
    private Tiket dataTiket;
    private ArrayList<Tiket> userTiket = new ArrayList<>();
    JDBC conn;
    
    public Admin(){
        conn.connectDB();
    }
    
    public User getDataUser(){
        return dataUser;
    }

    public Tiket getDataTiket(){
        return dataTiket;
    }
    
     public void membuatKereta(int id, String namaKA, String gerbongKA, String kelasKA, String jadwalBerangkatKA, String jadwalTibaKA, int hargaTiketKA, String stasiunAsalKA, String stasiunTujuanKA){
        Connection koneksi = conn.connectDB();    
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("INSERT INTO kereta (idKereta, namaKereta, gerbong, kelas, jadwalBerangkat, jadwalTiba, hargaTiket, stasiunAsal, stasiunTujuan) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, id);
            ps.setString(2, namaKA);
            ps.setString(3, gerbongKA);
            ps.setString(4, kelasKA);
            ps.setString(5, jadwalBerangkatKA);
            ps.setString(6, jadwalTibaKA);
            ps.setInt(7, hargaTiketKA);
            ps.setString(8, stasiunAsalKA);
            ps.setString(9, stasiunTujuanKA);
            int rs = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public void updateKereta(int id, String namaKA, String gerbongKA, String kelasKA, String jadwalBerangkatKA, String jadwalTibaKA, int hargaTiketKA, String stasiunAsalKA, String stasiunTujuanKA){
        Connection koneksi = conn.connectDB();
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("UPDATE kereta set namaKereta= ?, gerbong= ?, kelas= ?, jadwalBerangkat= ?, jadwalTiba= ?, hargaTiket = ?, stasiunAsal= ?, stasiunTujuan= ? WHERE idKereta = ?");
                
                ps.setString(1, namaKA);
                ps.setString(2, gerbongKA);
                ps.setString(3, kelasKA);
                ps.setString(4, jadwalBerangkatKA);
                ps.setString(5, jadwalTibaKA);
                ps.setInt(6, hargaTiketKA);
                ps.setString(7, stasiunAsalKA);
                ps.setString(8, stasiunTujuanKA);
                ps.setInt(9, id);    
                ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteKereta(int id){
        Connection koneksi = conn.connectDB();
        try {
            PreparedStatement ps = (PreparedStatement)koneksi.prepareStatement("DELETE FROM kereta WHERE idKereta = ?");
                ps.setInt(1, id);
                ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
