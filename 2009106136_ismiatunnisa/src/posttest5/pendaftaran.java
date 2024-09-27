
package posttest5;

import java.io.IOException;
import static posttest5.posttest5.alasanWeb;
import static posttest5.posttest5.namaWeb;
import static posttest5.posttest5.nimWeb;
import static posttest5.posttest5.prodiWeb;

public class pendaftaran extends posttest5 {
    public String nama;
    private int nim;
    private String prodi;
    private String alasan;

    public pendaftaran(String nama, int nim, String prodi, String alasan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alasan = alasan;
    }
    public void lihatWeb(){
            if(namaWeb.isEmpty()){
                System.out.println("Belum ada data pendaftar study club web");
            } else {
                int i=0;
                System.out.println("No |     Nama     |     Nim     |   prodi   |    alasan  |");
                for(String nama : namaWeb){
                    String nim = nimWeb.get(i);
                    String prodi = prodiWeb.get(i);
                    String alasan = alasanWeb.get(i);
      
                   System.out.println(i+"\t"+nama+"\t\t"+nim+"\t\t"+prodi+"\t\t"+alasan);
                 i++;
                }
         }
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nimp) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public static boolean isIsRunning() {
        return isRunning;
    }

    public static void setIsRunning(boolean isRunning) {
        posttest5.isRunning = isRunning;
    }

    void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void hapus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void tambah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNamalomba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 
