package PostTest6;

interface SucsessMessage {
    static void BuatReservasi(String namaReservator){
        System.out.println("\n        \u001B[32m"+"Reservasi atas nama "+namaReservator+" berhasil dibuat!"+"\u001B[0m");
    }

    static void BuatPembayaran(String namaBayar){
        System.out.println("\n        \u001B[32m"+"Pembayaran atas nama "+namaBayar+" berhasil dibuat!"+"\u001B[0m");
    }
}