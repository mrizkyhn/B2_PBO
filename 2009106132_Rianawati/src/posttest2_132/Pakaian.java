package posttest2_132;

class Pakaian {


    String nama, bahan, warna;
    int harga, jumlah;
    
    public Pakaian(String nama, String bahan, String warna, int harga, int jumlah){
        this.nama = nama;
        this.bahan = bahan;
        this.warna = warna;
        this.harga = harga;
        this.jumlah = jumlah;
        
    }

    void BerhasilDitambah(){
        System.out.println("\n=====================================");
        System.out.println(">>> Stok Telah Berhasil Di Tambah <<<");
        System.out.println("=====================================\n\n");
    }
    void BerhasilDiubah(){
        System.out.println("\n===================================");
        System.out.println(">>> Stok Telah Berhasil Di Ubah <<<");
        System.out.println("===================================\n");
    }
    void BerhasilDihapus(){
        System.out.println("\n====================================");
        System.out.println(">>> Stok Telah Berhasil Di Hapus <<<");
        System.out.println("====================================\n");
    }
}

