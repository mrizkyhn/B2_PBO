package posttest2;

public class Belanja {
    private String nama;
    private String merk;
    private int harga;
    private int jumlahBarang;
    
    public Belanja(String nama, String merk, int harga, int jumlahBarang){
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
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
    public void printData(){
        System.out.println("Nama            --> " + this.nama);
        System.out.println("Merk            --> " + this.merk);
        System.out.println("Harga           --> Rp" + this.harga);
        System.out.println("Jumlah Barang   --> " + this.jumlahBarang);
    }
    
    // SUBTOTAL SUATU BARANG BELANJA
    public double subtotalBarangBelanja() {
        double subtotal = 0.0;
        subtotal += this.jumlahBarang * this.harga + this.pajakBarang();
        return subtotal;
    }
}
