public class toeic extends toefl{
   
    //Constructor

    public toeic(String nama, String alamat, String jeniskelas, String nilai) {
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



