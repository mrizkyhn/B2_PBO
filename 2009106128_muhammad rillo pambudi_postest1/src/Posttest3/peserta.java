package Posttest3;

public class peserta {
    private String nama;
    private String alamat;
    private String jeniskelas;
    private String tanggallahir;

    //constructor
    public peserta(String nama, String alamat, String jeniskelas, String tanggallahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.jeniskelas = jeniskelas;
        this.tanggallahir = tanggallahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelas() {
        return jeniskelas;
    }

    public void setJeniskelas(String jeniskelas) {
        this.jeniskelas = jeniskelas;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    //method
    void addDataPeserta(){
        System.out.println("data berhasil di tambah kan ");
}
    void deleteDataPeserta(){
        System.out.println("data berhasil di hapus");
    }
}