
package posttest4;

import java.io.IOException;
import static posttest4.posttest4.alasanWeb;
import static posttest4.posttest4.namaWeb;
import static posttest4.posttest4.nimWeb;
import static posttest4.posttest4.prodiWeb;

public class pendaftraan extends posttest4 {
    public String nama;
    private int nim;
    private String prodi;
    private String alasan;

    public pendaftraan(String nama, int nim, String prodi, String alasan) {
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
        posttest4.isRunning = isRunning;
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
}
