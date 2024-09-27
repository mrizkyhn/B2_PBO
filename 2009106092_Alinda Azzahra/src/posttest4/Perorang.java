//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
package posttest4;

public class Perorang extends Zakat{
    private String orang;
    
    public Perorang(String orang, String nama, int usia, String jenkel, String telp, String alamat, String harga){
        super(nama, usia, jenkel, telp, alamat, harga);
        this.orang = orang;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Bayar untuk    : "+this.orang);
    }

    public String getOrang() {
        return orang;
    }

    public void setOrang(String orang) {
        this.orang = orang;
    }
}
