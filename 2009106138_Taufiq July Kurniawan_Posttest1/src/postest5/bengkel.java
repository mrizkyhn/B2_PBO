package postest5;

public abstract class bengkel {
    
 protected int Id,Jumlah;
   protected String Barang;


    void display(){
        System.out.println("Id Produk     : " + this.Id);
        System.out.println("Nama Produk   : " + this.Barang);
        System.out.println("Jumlah Produk : " + this.Jumlah);
}

   public bengkel(int id, int jumlah, String barang) {
    Id = id;
    Jumlah = jumlah;
    Barang = barang;
}
public void setBarang(String Barang){
      this.Barang = Barang;
   }
public void setJumlah(int Jumlah){
    this.Jumlah=Jumlah;
 }
   public int GetId(){
      return Id;
   }
   public int GetJumlah(){
      return Jumlah;
   }

   public String GetBarang(){
      return Barang;
   } 
     public abstract void Masukkan();
  public abstract void Keluar();
}

