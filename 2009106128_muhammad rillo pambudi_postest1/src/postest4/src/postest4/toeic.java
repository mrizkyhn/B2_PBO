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
public class toeic {
    public class toeic extends toefl {

    //Constructor
   public toefl(String nama,String alamat,String jeniskelas,String nilai)
        super(nama, alamat, jeniskelas, nilai);
    }

    
    public void kelastoeic() {
        System.out.println("\nData peserta toeic");
        System.out.println("----------------------------------------\n");
    }

    //Method
    void peserta() {
        System.out.println("Data peserta berhasil di Input");
    }

    void editpeserta() {
        System.out.println("Data peserta berhasil di Ubah");
    }

    void hapuspeserta() {
        System.out.println("Data peserta berhasil di Hapus");
    }

}
}
