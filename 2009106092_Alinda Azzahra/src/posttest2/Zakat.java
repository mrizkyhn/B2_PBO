//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
package posttest2;

public class Zakat {
    String nama;
    int usia;
    String jenkel;
    String telp;
    String alamat;
    String harga;

    public Zakat(String nama, int usia, String jenkel, String telp, String alamat, String harga) {
        this.nama = nama;
        this.usia = usia;
        this.jenkel = jenkel;
        this.telp = telp;
        this.alamat = alamat;
        this.harga = harga;
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
    
    void Simpan(){
        System.out.println("Data berhasil disimpan");
    }
    
    void Gagal(){
        System.out.println("Data gagal disimpan");
    }
}