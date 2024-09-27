package posttest2;

public class Martabak {
    String nama;
    int harga;
    
    public Martabak(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    void idata(){
        System.out.println("Data Martabak berhasil ditambah");
    }
    void udata(){
        System.out.println("Data Martabak berhasil diedit");
    }
    void hdata(){
        System.out.println("Data Martabak berhasil dihapus");
    }    
}
