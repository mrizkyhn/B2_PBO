//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
package posttest6;

public abstract class Zakat implements Bayar{
    static String nama;
    static int usia;
    static String jenkel;
    static String telp;
    static String alamat;
    static String harga;
    
    Zakat(){}

    public Zakat(String nama, int usia, String jenkel, String telp, String alamat, String harga) {
        this.nama = nama;
        this.usia = usia;
        this.jenkel = jenkel;
        this.telp = telp;
        this.alamat = alamat;
        this.harga = harga;
    }
    

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getJenkel() {
        return jenkel;
    }

    public String getTelp() {
        return telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getHarga() {
        return harga;
    }
    
    void display() {
        System.out.println("Nama           : " + this.nama);
        System.out.println("Usia           : " + this.usia + " tahun");
        System.out.println("Jenis Kelamin  : " + this.jenkel);
        System.out.println("No. Telp       : " + this.telp);
        System.out.println("Alamat         : Jl. " + this.alamat);
        System.out.println("Harga          : Rp. " + this.harga);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    public abstract void Simpan();
    
    public static void Gagal(){
        System.out.println("Data gagal disimpan");
    }

    @Override
    public void sudahBayar(){
        System.out.println("Muzakki sudah membayar zakat");
    }

    @Override
    public void belumBayar() {
        System.out.println("Muzakki belum membayar zakat");
    }
    
    

}