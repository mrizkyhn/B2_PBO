package Postestpbo;

class Barang {
   String jenis;
   private String asal;
   private String merk;
   private Integer harga;
    
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

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the asal
     */
    public String getAsal() {
        return asal;
    }

    /**
     * @param asal the asal to set
     */
    public void setAsal(String asal) {
        this.asal = asal;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the harga
     */
    public Integer getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(Integer harga) {
        this.harga = harga;
    }
    
}
