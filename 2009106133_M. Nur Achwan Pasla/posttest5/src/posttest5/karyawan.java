package posttest5;

public abstract class karyawan {
    private String nama_karyawan;
    private String alamat;
    private String tanggal_lahir;
    private int umur;
    private Double tinggi;
    private Double berat_badan;
    
    public karyawan (String nama_karyawan, String alamat, String tanggal_lahir, int umur, Double tinggi, Double berat_badan){
        this.nama_karyawan = nama_karyawan;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.umur = umur;
        this.tinggi = tinggi;
        this.berat_badan = berat_badan;
    }
    
    public karyawan (){
        this.nama_karyawan = "Achwan";
        this.alamat = "Perjuangan";
        this.tanggal_lahir = "14 April 1999";
        this.umur = 17;
        this.tinggi = 70.0;
        this.berat_badan = 60.0;
    }

    public String getNama_karyawan() {
        return nama_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    public Double getBerat_badan() {
        return berat_badan;
    }

    public void setBerat_badan(Double berat_badan) {
        this.berat_badan = berat_badan;
    }
    
}
