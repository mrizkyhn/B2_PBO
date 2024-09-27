package PostTest5;

public final class DataPembayaranFinal {
    public final String nama = "Marsha";
    public final String metodeBayar = "Debit";
    public final int kodeBooking = 12052202;
    public final int dp = 300000;

    public final void tampilDataPembayaran(){
        System.out.println(kodeBooking+"       "+nama+"          "+dp+"         "+metodeBayar);
    }
}
