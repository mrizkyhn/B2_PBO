
package Posttest5;

public final class makanan_ringan extends makanan{
    private int stock;
    private int berat;
    
    makanan_ringan(String nama, String merk, int harga,int stock, int berat) {
        super(nama, merk, harga);
        this.stock = stock;
        this.berat = berat;
    }
    //Overloading
    makanan_ringan() {
        this.stock = 0;
        this.berat = 0;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }
    public int getBerat(){
        return berat;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getStock() {
        return stock;
    }   

    @Override
    public void printData() {
        System.out.println("Nama : " + nama);
        System.out.println("Merk : " + merk);
        System.out.println("Berat : " + berat);
        System.out.println("Stock : " + stock);
        System.out.println("Harga : " + harga);
    }
    
}
