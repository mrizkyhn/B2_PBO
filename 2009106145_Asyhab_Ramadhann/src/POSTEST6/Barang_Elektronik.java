package POSTEST6;

public final class Barang_Elektronik extends Barang implements InterfaceKemas{
    private int Ukuran;

    public Barang_Elektronik(int id, String nm, String br, String js, int jm, int hg, String jb,int Ukuran) {
        super(id, nm, br, js, jm, hg, jb);
        this.Ukuran = Ukuran;
    }

    public Barang_Elektronik() {
        this.Ukuran = 0;
    }

    public int getUkuran() {
        return Ukuran;
    }

    public void setUkuran(int Ukuran) {
        this.Ukuran = Ukuran;
    }
    @Override
     final void barangbeli(){
        System.out.println("Data Barang Elektronik Telah Tertambah");
    }
    @Override
    final void barangubah(){
        System.out.println("Data Barang Elektronik Telah DiUbah");
    }
    @Override
    void barangberhasil(){
        System.out.println("Data Barang Elektronik Telah DiHapus");
    }
    @Override
    public void wellcome(){
        System.out.println("Sistem Crud Pembelanjaan Elektronik");
    }
    @Override
    public void wellcome2(){
        System.out.println("Silahkan Eksekusi Menu Anda");
    }
    
}
