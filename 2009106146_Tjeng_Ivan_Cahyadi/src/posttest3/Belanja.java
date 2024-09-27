package posttest3;

public class Belanja extends Barang {
    protected int jumlahBarang;
    
    public Belanja(String nama, String merk, int harga, int jumlahBarang){
        super(nama, merk, harga);
        this.jumlahBarang = jumlahBarang;
    }
    
    // GETTER
    public String getNama() {
        return this.nama;
    }
    
    public String getMerk() {
        return this.merk;
    }
    
    public int getHarga() {
        return this.harga;
    }
    
    public int getJumlahBarang() {
        return this.jumlahBarang;
    }
    
    // SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setMerk (String merk) {
        this.merk = merk;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    // PAJAK BARANG
    public double pajakBarang() {
        double pajak = 0.0;
        pajak += this.harga * 0.11;
        return pajak;
    }
    
    // PRINT DATA
    public void printData(int nomor){
        System.out.printf("%-5s%-100s%-20s%-11s%s\n", String.valueOf(nomor), this.nama, this.merk, String.valueOf(this.harga), String.valueOf(this.jumlahBarang));
    }
    
    // SUBTOTAL SUATU BARANG BELANJA
    public double subtotalBarangBelanja() {
        double subtotal = 0.0;
        subtotal += this.jumlahBarang * this.harga + this.pajakBarang();
        return subtotal;
    }
}
