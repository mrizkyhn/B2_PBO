
package Posttest2;

public class manajemen {
    String nama;
    String kelas;
    String alasan;
    int nim;
    

    manajemen(String nama, String kelas,String alasan, int nim ){
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    this.alasan = alasan;
    
    }
    
    void TambahWeb(){
        System.out.println("data telah ditambahkan");
    }
    void TambahNet(){
        System.out.println("data telah ditambahkan");
    }
    void TambahRbt(){
        System.out.println("data telah ditambahkan");
    }
}

