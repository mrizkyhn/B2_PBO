package Posttest3;

public class sewa {
    private String namapenyewa, nomorlapangan, jenislapangan;
    private int harga;
    
    
    public sewa (String namapenyewa, String nomorlapangan, String jenislapangan, int harga){
        this.namapenyewa    = namapenyewa;
        this.nomorlapangan  = nomorlapangan;
        this.jenislapangan  = jenislapangan;
        this.harga          = harga;
    }
    void tambah(){
        System.out.println(" Berhasil menambahkan");
    }
    
    void update(){
        System.out.println(" Berhasil mengupdate");
    }
     void display() {
        System.out.println("***********");
        System.out.println("|namapenyewa   : " + this.namapenyewa   );
        System.out.println("|nomorlapangan : " + this.nomorlapangan);
        System.out.println("|jenislapangan : " + this.jenislapangan);
        System.out.println("|harga         : " + this.harga);
        System.out.println("***********");
    }
    
    public void setnamapenyewa (String namapenyewa ){
        // System.out.println("namapenyewa    : ");
        this.namapenyewa        = namapenyewa ;
    }
    public void setnomorlapangan  (String nomorlapangan ){
        // System.out.println("nomorlapangan   : ");
        this.nomorlapangan      = nomorlapangan  ;
    }
    public void setjenislapangan (String jenislapangan ){
        // System.out.println("jenislapangan    : ");
        this.jenislapangan      = jenislapangan;
    }
    public void setharga  (int harga  ){
        // System.out.println("harga       : ");
        this.harga      = harga  ;
    }
    
    public String getnamapenyewa(){
        return namapenyewa;
    }
    public String getnomorlapangan(){
        return nomorlapangan;
    }
    public String getjenislapangan(){
        return jenislapangan;
    }
    public int getharga(){
        return harga;
    }
}
