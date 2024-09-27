/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest4;

/**
 *
 * @author HP
 */
public class toefl {
    
    private String nama;
    private String alamat;
    private String jeniskelas;
    private String nilai;
    
    public toefl(String nama,String alamat,String jeniskelas,String nilai)
            this.nama = nama;
            this.alamat = alamat;
            this.jeniskelas = jeniskelas;
            this.nilai = nilai;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public String getAlamat(){
    return Alamat;
}
public void setAlamat(String alamat){
    this.alamat = alamat;
}

public String getJenislkelas(){
    return Jeniskelas;
}
public void setJeniskelas(String jeniskelas){
    this.jeniskelas = jeniskelas;
}

public String nilai(){
    return nilai;
}
public void setnilai(String nilai){
    this.nilai = nilai;
}

public void toefl() {
     System.out.println("\n\t\t peserta toefl\n");
     System.out.println("=======================================");
    }
}

}
}
