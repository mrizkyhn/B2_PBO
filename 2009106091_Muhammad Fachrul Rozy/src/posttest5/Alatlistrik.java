/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

final class Alatlistrik extends Bangunan {
    private final String os;
    private boolean baik;
    private String nama;
    private String ukuran;
    private String bahan;
    private String harga;
    
    
    public Alatlistrik(String nama, String ukuran, String bahan, String harga, String os){
        super(nama, ukuran, bahan, harga); 
            this.os = os;
    }


    @Override
    public final void display(){
        System.out.println("Nama      : " + this.nama);
        System.out.println("Ukuran     : " + this.ukuran);
        System.out.println("Jenis Perbaikan : " + this.bahan);
        System.out.println("Harga Perbaikan : " + this.harga);
        System.out.println("Sistem Operasi  : " + this.os);
        baik();
    }
    
    //Overload
    public void customer(){
        System.out.println("Barang Alat Listrik ini punya orang");
    }
    public void customer(String nama){
        System.out.println("Barang Alat Listrik  ini punya " +nama);
    }

    @Override
    protected void baik() {
        System.out.println("Daftar Barang Bangunan Alat Listrik ");
    }
}