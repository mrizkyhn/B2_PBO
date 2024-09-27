
package Posttest6;

import static Posttest6.kasir.dataPenjualan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class transaksi implements jual {
    
    @Override
    public void Struk(){
    System.out.println("===================================================================================");
    System.out.printf("%-5s%-25s%-15s%-10s%-15s%-15s\n","No", "Nama", "Merk","Jumlah", "Harga", "Total", "=");
    System.out.println("===================================================================================");
    for (int i = 0; i < dataPenjualan.size(); i++) {
        System.out.printf("%-5s%-25s%-15s%-10s%-15s%-15s\n",String.valueOf(i + 1), dataPenjualan.get(i).getNama(),dataPenjualan.get(i).getMerk(), String.valueOf(dataPenjualan.get(i).getJumlah()), String.valueOf(dataPenjualan.get(i).getHarga()), String.valueOf(dataPenjualan.get(i).totalBelanja()));
    }
    System.out.println("===================================================================================");
    }
    
    double perhitungan(){
        double total = 0.0;
        for (int i = 0; i < dataPenjualan.size(); i++) {
            total = total+dataPenjualan.get(i).totalBelanja();
        }
        return total;
    }

    @Override
    public void bayar() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tanggal = new Date();
        Scanner inputAngka = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String simpan = "", nama_pembeli = "", alamat_pembeli = "", nomor_HP= "";
        double uangPembeli = 0.0;
        Struk();
        System.out.printf("%-55s", "");
        System.out.print("Total\tRp" + perhitungan()+"\n");
        System.out.println("PERHATIKAN!");
        System.out.println("Ingin Transaksi Kembali ?");
        try {
            System.out.print("Konfirmasi transaksi(y/n): ");
            simpan= input.readLine();
        } catch (IOException ex) {
        }
        if (simpan.equals("n")){
            try {
                kasir.menu_kasir();
            } catch (IOException ex) {
            }
        }
        if (simpan.equals("y")) {
            System.out.println("Masukkan nama pembeli: ");
            try {
                nama_pembeli = input.readLine();
            } catch (IOException ex) {
            }
            System.out.println("Masukkan alamat pembeli: ");
            try {
                alamat_pembeli = input.readLine();
            } catch (IOException ex) {
            }
            System.out.println("Masukkan nomor HP pembeli: ");
            try {
                nomor_HP= input.readLine();
            } catch(IOException e){
            }
            while (true) {
                System.out.print("Masukkan uang pembeli: ");
                uangPembeli = inputAngka.nextDouble();
                if (uangPembeli < perhitungan()) {
                    System.out.println("Uang pembeli tidak cukup!");
                } else{
                    break;
                }
            }
            System.out.println("===================================================================================");
            System.out.println("                                       STRUK PENJUALAN");
            System.out.println("                                         " + sdf.format(tanggal)+"");
            System.out.println( "TOKO KUWEE");
            System.out.println("Nama Pembeli: " + nama_pembeli);
            System.out.println(alamat_pembeli );
            System.out.println(nomor_HP);
            System.out.println("===================================================================================");
            Struk();
            System.out.printf("%-55s", "");
            System.out.print("Total         : Rp " + String.valueOf(perhitungan()) + "\n");
            System.out.printf("%-55s", "");
            System.out.print("Dibayar       : Rp " + String.valueOf(uangPembeli) + "\n");
            System.out.printf("%-55s", "");
            System.out.print("Kembali       : Rp " + String.valueOf((uangPembeli - perhitungan())) + "\n");
            berhasil_belanja();
            System.out.println("===================================================================================");
            dataPenjualan.clear();
            try {
                main.menu();
            } catch (IOException ex) {
            }
        }
    } //To change body of generated methods, choose Tools | Templates.


    @Override
    public void berhasil_belanja() {
        System.out.println("Terima Kasih Telah Berbelanja "); //To change body of generated methods, choose Tools | Templates.
    }

   
}
