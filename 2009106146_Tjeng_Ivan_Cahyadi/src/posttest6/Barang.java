package posttest6;

abstract class Barang {
    // PROPERTY
    protected final String id;
    protected String nama, merk;
    protected int harga;
    
    // CONSTRUCTOR
    protected Barang(String id, String nama, String merk, int harga) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }
    
    // GETTER
    public String getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public int getHarga() {
        return harga;
    }
    
    // SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // ABSTRACT METHOD
    protected abstract void printData(int nomor);
}
