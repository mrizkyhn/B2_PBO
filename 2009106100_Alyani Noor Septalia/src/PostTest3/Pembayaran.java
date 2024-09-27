package posttest3;

class Pembayaran {
    private String nama;
    private String metodeBayar;
    private int kodeBooking; 
    private int dp;

    public Pembayaran(int kodeBooking, String nama, int dp, String metodeBayar){
        setKodeBooking(kodeBooking);
        setNama(nama);
        setDp(dp);
        setMetodeBayar(metodeBayar);
    }

    public String toString(){
        return getKodeBooking()+"       "+getNama()+"          "+getDp()+"         "+getMetodeBayar();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMetodeBayar() {
        return metodeBayar;
    }

    public void setMetodeBayar(String metodeBayar) {
        this.metodeBayar = metodeBayar;
    }

    public int getKodeBooking() {
        return kodeBooking;
    }

    public void setKodeBooking(int kodeBooking) {
        this.kodeBooking = kodeBooking;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }


}