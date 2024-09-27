package posttest5;

abstract class Barang implements GetterSetter {
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
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public String getMerk() {
        return merk;
    }
    
    @Override
    public int getHarga() {
        return harga;
    }
    
    // SETTER
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // ABSTRACT METHOD
    protected abstract void printData(int nomor);
}
