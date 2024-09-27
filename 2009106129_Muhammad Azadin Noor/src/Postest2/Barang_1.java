 class Barang {
    String jenis;
    String asal;
    String merk;
    Integer harga;
    
    // Method
    public Barang(String jenis,String asal,String merk,Integer harga){
        this.jenis = jenis;
        this.asal = asal;
        this.merk = merk;
        this.harga = harga;
       
                
    }
    void readybarang(){
        System.out.println("Barang ready");
    }
    void noreadybarang(){
        System.out.println("Barang tidak ready");
    }
    
}
