/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

final class Semen extends Bangunan {
    private final String os;
    private boolean baik;
    private String nama;
    private String bahan;
    private String harga;
    private String ukuran;
    
    
    public Semen(String nama, String ukuran, String bahan, String harga, String os){
        super(nama, ukuran, bahan, harga);   
                this.os = os;
    }
    
    @Override
    public final void display(){
        
        System.out.println("Nama Barang     : " + this.nama);
        System.out.println("Ukuran Barang     : " + this.ukuran);
        System.out.println("Bahan Barang  : " + this.bahan);
        System.out.println("Harga Barang  : " + this.harga);
        System.out.println("Stok Barang   : " + this.os);
        baik();
    }
    
    //Overload
    public void customer(){
        System.out.println("Semen ini punya orang");
    }
    public void customer(String nama){
        System.out.println("Semen ini punya " +nama);
    }

    @Override
    protected void baik() {
        System.out.println("Daftar Semen ");
    }
}

  