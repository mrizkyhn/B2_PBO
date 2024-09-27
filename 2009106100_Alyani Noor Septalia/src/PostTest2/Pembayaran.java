package PostTest2;

public class Pembayaran {
    String nama, metodeBayar;
    int kodeBooking, dp;

    public Pembayaran(int kodeBooking, String nama, int dp, String metodeBayar){
        this.nama = nama;
        this.metodeBayar = metodeBayar;
        this.kodeBooking = kodeBooking;
        this.dp = dp;
    }

    public String toString(){
        return this.kodeBooking+"       "+this.nama+"          "+this.dp+"         "+this.metodeBayar;
    }
}