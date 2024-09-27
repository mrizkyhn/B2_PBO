package POSTEST5;

import POSTEST4.*;

public abstract class Masyarakat {
   protected String nama, alamat, laporan; 
   protected final String daerah = "Samboja";
   
   public abstract void Negara();
   
   public Masyarakat(String nama,String alamat, String laporan){
       this.nama = nama;
       this.alamat = alamat;
       this.laporan = laporan;
       
   }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getLaporan() {
        return laporan;
    }

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }

   
   void pengaduanDiterima(){
       System.out.println("Pengaduan di terima");
   }
   void pengaduanTidakDiterima(){
       System.out.println("Pengaduan Tidak di terima");
   }
}