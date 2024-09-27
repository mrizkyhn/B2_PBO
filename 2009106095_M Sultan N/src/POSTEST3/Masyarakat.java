/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POSTEST3;

/**
 *
 * @author ACER
 */
public class Masyarakat {
   private String Nama;
   private String alamat;
   private String laporan;
   private Integer no_hp;
   
   public Masyarakat(String Nama,String alamat, String laporan, Integer no_hp){
       this.Nama = Nama;
       this.alamat = alamat;
       this.laporan = laporan;
       this.no_hp = no_hp;
   }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLaporan() {
        return laporan;
    }

    public Integer getNo_hp() {
        return no_hp;
    }
   
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }

    public void setNo_hp(Integer no_hp) {
        this.no_hp = no_hp;
    }
   
   
   void pengaduanDiterima(){
       System.out.println("Pengaduan di terima");
   }
   void pengaduanTidakDiterima(){
       System.out.println("Pengaduan Tidak di terima");
   }
}
