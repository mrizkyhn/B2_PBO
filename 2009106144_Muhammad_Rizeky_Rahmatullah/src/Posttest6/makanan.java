
package Posttest6;


public abstract class makanan {

    protected String nama;
    protected String merk;
    protected int harga;
    
    public makanan(String nama, String merk, int harga){
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }
    //Overloading
    public makanan(){
        this.nama = "";
        this.merk = "";
        this.harga = 0;
    }

    public abstract void printData();
    
    public String getNama() {
        return nama;
    }
 
    public String getMerk() {
        return merk;
    }
 
    public int getHarga() {
        return harga;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public void setMerk(String merk) {
        this.merk = merk;
    }
 
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    static final void tambah_data(){
        System.out.println("Data Telah Ditambahkan ");
    }
    static final void update_data(){
        System.out.println("Data Telah Diupdate");
    }
    static final void hapus_data(){
        System.out.println("Data Telah Dihapus ");
    }

}