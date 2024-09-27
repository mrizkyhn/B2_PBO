
package posttest6;

public interface datasantri {
       static final String PROVINSI = "Kalimantan Timur";

   public void setNama(String namaSantri);
   public void setAlamat(String alamatSantri);
   public String getNama();
   public String getAlamat();

}
class Data implements datasantri{
   String nama, alamat;

   public Data(String namaSantri, String alamatSantri){
      nama = namaSantri;
      alamat = alamatSantri;
   }

   public void setNama(String namaSantri){
      nama = namaSantri;
   }

   public void setAlamat(String alamatSantri){
      alamat = alamatSantri;
   }

   public String getNama(){
      return nama;
   }

   public String getAlamat(){
      return alamat;
   }
 
   public String getProvinsi(){
      return PROVINSI;
   }

   public String toString(){
      return
        "Nama       : "+nama+"\n"+
        "Alamat            : "+alamat+"\n"+
        "Provinsi   : "+PROVINSI+"\n"; 
   }
}

public class data{

    public data(String mingyue, String jalan_Merdeka_123) {
    }
   public static void main (String[] args) {
      test();
   }

   static void test(){
      datasantri jumlah;
      jumlah = new data("mingyue","Jalan Merdeka 123");
      System.out.println("Informasi Santri : "+"\n"+jumlah);
   }
}
    

