package tubespbo;

public class Tiket {
    private int idTiket;
    private Penumpang dataPenumpang;
    private Kereta dataKereta;

    public int getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }

    public Penumpang getDataPenumpang() {
        return dataPenumpang;
    }

    public void setDataPenumpang(Penumpang dataPenumpang) {
        this.dataPenumpang = dataPenumpang;
    }

    public Kereta getDataKereta() {
        return dataKereta;
    }

    public void setDataKereta(Kereta dataKereta) {
        this.dataKereta = dataKereta;
    }

    public void menampilkanInfoTiket(){
        System.out.println("Nama Penumpang: " + dataPenumpang.getNama());
        System.out.println("Umur: " + dataPenumpang.getUmur());
        System.out.println("Jenis Kelamin: " + dataPenumpang.getJenisKelamin());
        System.out.println("Nama Kereta Api: " + dataKereta.getNamaKereta());
        System.out.println("Kelas: " + dataKereta.getKelas());
        System.out.println("Gerbong: " + dataKereta.getJadwalTiba());
        System.out.println("Jadwal Berangkat: " + dataKereta.getJadwalBerangkat());
        System.out.println("Jadwal Tiba: " + dataKereta.getJadwalTiba());
    }
}
