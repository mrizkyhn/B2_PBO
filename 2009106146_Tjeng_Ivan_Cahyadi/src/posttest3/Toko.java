package posttest3;

public class Toko extends Barang {
    protected String jenis;
    protected int stock;
    
    public Toko(String nama, String merk, String jenis, int harga, int stock){
        super(nama, merk, harga);
        this.jenis = jenis;
        this.stock = stock;
    }
    
    // GETTER
    public String getNama() {
        return this.nama;
    }
    
    public String getMerk() {
        return this.merk;
    }
    
    public String getJenis() {
        return this.jenis;
    }
    
    public int getHarga() {
        return this.harga;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    // SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setMerk (String merk) {
        this.merk = merk;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    // PRINT DATA
    public void printData(int nomor){
        System.out.printf("%-5s%-100s%-20s%-40s%-11s%s\n", String.valueOf(nomor), this.nama, this.merk, this.jenis, String.valueOf(this.harga), String.valueOf(this.stock));
    }
}
