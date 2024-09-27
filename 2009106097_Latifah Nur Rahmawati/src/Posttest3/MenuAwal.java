package Posttest3;

import Posttest2.*;
import Posttest1.*;
import java.util.Scanner;
import java.util.ArrayList;

public class MenuAwal {
    public static void main(String[] args){
        System.out.println("Program Jasa Pengiriman Barang");
        System.out.println("Latifah Nur Rahmawati");
        System.out.println("2009106097");
        System.out.println("Informatika B 2020\n\n");

        System.out.println("==============================================");
        System.out.println("||      Jasa Pengiriman Barang              ||");
        System.out.println("==============================================");
        System.out.println("||  [1] Input Data Pengiriman Barang        ||");
        System.out.println("||  [2] Tampil Data Pengiriman Barang       ||");
        System.out.println("||  [3] Edit Data                           ||");
        System.out.println("||  [4] Hapus Data                          ||");
        System.out.println("||  [5] Keluar                              ||");
        System.out.println("==============================================");

        DataKirim a = new DataKirim();
        Scanner input = new Scanner(System.in);

        String np1 = input.next();
        String almt1 = input.next();
        int no1 = input.nextInt();
        String np2 = input.next();
        String almt2 = input.next();
        int no2 = input.nextInt();
        int kodepos = input.nextInt();
        int kodebrg = input.nextInt();
        String tipebrg = input.next();
        int berat = input.nextInt();
        int ongkir = input.nextInt();

        Scanner pilihan = new Scanner(System.in);
        System.out.println("Masukkan Pilihan : ");
        int pilih = pilihan.nextInt();
        switch(pilih){
            case(1):
                System.out.println("Input Data Pengiriman Barang");
                a.tambahData(new InputData(np1,almt1,no1,np2,almt2,no2,kodepos,kodebrg,tipebrg,berat,ongkir));
                Kurir kurirdava = new Kurir();
                Kurir kurirjaka = new Kurir();

                kurirdava.getid_kurir(1432);
                kurirdava.getnama("Dava");
                kurirdava.getalamat("Jalan Naga");
                kurirdava.getno_telp(088964463707.0);

                kurirjaka.getid_kurir(8722);
                kurirjaka.getnama("Jaka");
                kurirjaka.getalamat("Jalan Cengke");
                kurirjaka.getno_telp(082341871972.0);

                System.out.println("Id Kurir        : "+kurirdava.setid_kurir());
                System.out.println("Nama            : "+kurirdava.setnama());
                System.out.println("Alamat          : "+kurirdava.setalamat());
                System.out.println("No Telp         : "+kurirdava.setno_telp());

                System.out.println("Id Kurir        : "+kurirjaka.setid_kurir());
                System.out.println("Nama            : "+kurirjaka.setnama());
                System.out.println("Alamat          : "+kurirjaka.setalamat());
                System.out.println("No Telp         : "+kurirjaka.setno_telp());

            case(2):
                System.out.println("Tampil Data Pengiriman Barang");
                a.tampilData();

            case(3):
                System.out.println("Edit Data Pengiriman Barang");

            case(4):
                System.out.println("Hapus Data Pengiriman Barang");
                a.hapusData(kodebrg);

            case(5):
                System.exit(pilih);                  
        }

    }
}
