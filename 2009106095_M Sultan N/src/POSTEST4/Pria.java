/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POSTEST4;
public class Pria extends Masyarakat {
    private String Nama;

    public Pria(String Nama, String nama, String alamat, String laporan) {
        super(nama, alamat, laporan);
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
   
//Override
public void display() {
        System.out.println("nama    : " + this.Nama);
        System.out.println("alamat  : " + this.alamat);
        System.out.println("laporan : " + this.laporan);
        
    }

}
