package postest5;

public class product extends bengkel{
    private int Harga;
    
  public product(int Id, int Jumlah, String Barang, int Harga) {
           super(Id, Jumlah, Barang);
     this.Harga = Harga;
   }
   void display(){

       System.out.println("Harga Produk  : " + this.Harga);
}

  public void setHarga(int Harga){
     this.Harga= Harga;
  }

  public int GetHarga(){
     return Harga;
  }
  public final void Masukkan(){
      System.out.println("Barang Masuk!!!");
  }
  public final void Keluar(){
    System.out.println("Barang Keluar!!!");
}
public static void add(product tambah) {
}
}

