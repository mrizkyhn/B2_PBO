package posttest1;

public class Barang {

    private String nama;
    private String merk;
    private String jenis;
    private int harga;
    private int stock;

    public Barang(String nama, String merk, String jenis, int harga, int stock){
        this.nama = nama;
        this.merk = merk;
        this.jenis = jenis;
        this.harga = harga;
        this.stock = stock;
    }
    
    
//    GETTER
    public String getNama(){
        return nama;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int getStock(){
        return stock;
    }
    
    
//    SETTER
    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }
    
    public void setMerk(String merkBaru){
        this.merk = merkBaru;
    }
    
    public void setJenis(String jenisBaru){
        this.jenis = jenisBaru;
    }
    
    public void setHarga(int hargaBaru){
        this.harga = hargaBaru;
    }
    
    public void setStock(int stockBaru){
        this.stock = stockBaru;
    }
}
