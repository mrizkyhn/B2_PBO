package POSTEST5;

abstract class Barang{
    private int id;
    private String Nama;
    private String Barang;
    private String Jenis;
    private int Jumlah;
    private int Harga;
    private String J_Bayar;
    Barang(int id, String nm, String br, String js, int jm, int hg, String jb)
    {
        this.id = id;
        this.Nama = nm;
        this.Barang = br;
        this.Jenis = js;
        this.Jumlah = jm;
        this.Harga = hg;
        this .J_Bayar = jb;

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getBarang() {
        return Barang;
    }

    public void setBarang(String Barang) {
        this.Barang = Barang;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getJ_Bayar() {
        return J_Bayar;
    }

    public void setJ_Bayar(String J_Bayar) {
        this.J_Bayar = J_Bayar;
    }
    Barang(){
        this.id = 0;
        this.Nama = "";
        this.Barang = "";
        this.Jenis = "";
        this.Jumlah = 0 ;
        this.Harga = 0;
        this.J_Bayar = "";
        
        
    }     
    public int getId()
    {
       return id;
    }
     
    public String getNm()
    {
       return Nama;
    }
     
    public String getBr()
    {
       return Barang;
    }
    
   public String getJs()
    {
       return Jenis;
    }

    public int getJm()
    {
       return Jumlah;
    }

    public int getHg()
    {
       return Harga;
    }

    public String getJb()
    {
       return J_Bayar;
    }
    void barangbeli(){
        System.out.println("Data Telah Tertambahh");
    }
    void barangubah(){
        System.out.println("Data Telah DiUbah");
    }
    void barangberhasil(){
        System.out.println("Data Telah DiHapus");
    }
}
