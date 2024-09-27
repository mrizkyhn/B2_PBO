
package Posttest4;

public class makanan {
    
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

    public void tampilkan() {
        System.out.println("Nama Makanan : " + this.nama);
        System.out.println("Merk Makanan : " + this.merk);
        System.out.println("Harga Makanan : " + this.harga);
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
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public void setMerk(String merk) {
        this.merk = merk;
    }
 
    public void setHarga(int harga) {
        this.harga = harga;
    }
    static void tambah_data(){
        System.out.println("Data Telah Ditambahkan ");
    }
    static void update_data(){
        System.out.println("Data Telah Diupdate");
    }
    static void hapus_data(){
        System.out.println("Data Telah Dihapus ");
    }

}