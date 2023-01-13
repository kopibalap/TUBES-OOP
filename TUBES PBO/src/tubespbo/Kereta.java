package tubespbo;
import java.util.ArrayList;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Kereta {
    private int idKereta, hargaTiket;
    private String namaKereta, gerbong, kelas, jadwalBerangkat, jadwalTiba, stasiunAsal, stasiunTujuan;
    private ArrayList<Kereta> kereta = new ArrayList<>();
    DefaultListModel dlm = new DefaultListModel();
    ResultSet rs;
    JDBC conn;
    
    public Kereta(int idKereta, int hargaTiket, String namaKereta, String gerbong, String kelas, String jadwalBerangkat, String jadwalTiba, String stasiunAsal, String stasiunTujuan) {
        setIdKereta(idKereta);
        setHargaTiket(hargaTiket);
        setNamaKereta(namaKereta);
        setGerbong(gerbong);
        setKelas(kelas);
        setJadwalBerangkat(jadwalBerangkat);
        setJadwalTiba(jadwalTiba);
        setStasiunAsal(stasiunAsal);
        setStasiunTujuan(stasiunTujuan);
        conn.connectDB();
    }

    public int getIdKereta() {
        return idKereta;
    }

    public void setIdKereta(int idKereta) {
        this.idKereta = idKereta;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public String getGerbong() {
        return gerbong;
    }

    public void setGerbong(String gerbong) {
        this.gerbong = gerbong;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJadwalBerangkat() {
        return jadwalBerangkat;
    }

    public void setJadwalBerangkat(String jadwalBerangkat) {
        this.jadwalBerangkat = jadwalBerangkat;
    }

    public String getJadwalTiba() {
        return jadwalTiba;
    }

    public void setJadwalTiba(String jadwalTiba) {
        this.jadwalTiba = jadwalTiba;
    }

    public String getStasiunAsal() {
        return stasiunAsal;
    }

    public void setStasiunAsal(String stasiunAsal) {
        this.stasiunAsal = stasiunAsal;
    }

    public String getStasiunTujuan() {
        return stasiunTujuan;
    }

    public void setStasiunTujuan(String stasiunTujuan) {
        this.stasiunTujuan = stasiunTujuan;
    }

    public ArrayList<Kereta> getKereta() {
        return kereta;
    }

    public void setKereta(ArrayList<Kereta> kereta) {
        this.kereta = kereta;
    }

    public void menampilkanInfoKereta(){
       /*
       try{
            Connection koneksi;
            conn = new JDBC();
            koneksi = conn.connectDB();
            Statement stmt = koneksi.createStatement();
            String sql = "SELECT * FROM kereta";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                dlm.addElement(rs.getString("namaKereta"));
                dlm.addElement
            }
            listKA.setModel(dlm);
                
        } catch(SQLException e){
            e.printStackTrace();
        }
        */
    }

}
