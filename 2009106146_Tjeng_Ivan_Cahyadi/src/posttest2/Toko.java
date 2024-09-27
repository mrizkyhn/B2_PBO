package posttest2;

public class Toko {
    private String nama;
    private String merk;
    private String jenis;
    private int harga;
    private int stock;
    
    public Toko(String nama, String merk, String jenis, int harga, int stock){
        this.nama = nama;
        this.merk = merk;
        this.jenis = jenis;
        this.harga = harga;
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
    public void printData(){
        System.out.println("Nama    --> " + this.nama);
        System.out.println("Merk    --> " + this.merk);
        System.out.println("Jenis   --> " + this.jenis);
        System.out.println("Harga   --> Rp" + this.harga);
        System.out.println("Stock   --> " + this.stock);
    }
}
