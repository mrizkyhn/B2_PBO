package PostTest1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Septalia
 */

class Reservasi{
    private String tanggal, jam, nama;
    private int pax, dp;

    public Reservasi(String tanggal, String jam, String nama, int pax, int dp){
        this.tanggal = tanggal;
        this.jam = jam;
        this.nama = nama;
        this.pax = pax;
        this.dp = dp;
    }

    public String toString(){
        return tanggal+"     "+jam+"     "+nama+"          "+pax+"  "+dp;
    }
}

public class PostTest1 {
    public static void main(String[] args) {

        ArrayList<Reservasi> r = new ArrayList<Reservasi>();

        int pilih;
        Scanner string = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);

        do{
            System.out.println(" ");
            System.out.println("    --- Sistem Reservasi Restoran ---");
            System.out.println("------------------------------------------");
            System.out.println("[1] Buat Reservasi");
            System.out.println("[2] Lihat Daftar Reservasi");
            System.out.println("[3] Update Reservasi");
            System.out.println("[4] Hapus Reservasi");
            System.out.println("[0] Exit");
            System.out.print(">> Pilihan : ");
            pilih = angka.nextInt();
            System.out.println("------------------------------------------------------");

            switch(pilih){
                case 1:
                    System.out.print("Tanggal reservasi : ");
                    String tanggal = string.next();

                    System.out.print("Jam reservasi : ");
                    String jam = string.next();

                    System.out.print("Nama pembuat reservasi : ");
                    String nama = string.next();

                    System.out.print("Jumlah pax : ");
                    int pax = angka.nextInt();

                    System.out.print("DP yang dibayarkan : ");
                    int dp = angka.nextInt();

                    r.add(new Reservasi(tanggal, jam, nama, pax, dp));
                    break;
                case 2:
                    System.out.println("Tanggal\t\t\tJam\t\t Nama\t\t\t  Pax\t\tDP");
                    System.out.println("------------------------------------------------------");
                    for(int i=0;i<r.size();i++){
                        System.out.println(r.get(i));
                    }
                    System.out.println("------------------------------------------------------");
                    break;
                case 3:
                    System.out.print("Masukkan urutan yang ingin diganti : ");
                    int ganti = angka.nextInt();

                    System.out.print("Tanggal reservasi : ");
                    String tanggalNew = string.next();

                    System.out.print("Jam reservasi : ");
                    String jamNew = string.next();

                    System.out.print("Nama pembuat reservasi : ");
                    String namaNew = string.next();

                    System.out.print("Jumlah pax : ");
                    int paxNew = angka.nextInt();

                    System.out.print("DP yang dibayarkan : ");
                    int dpNew = angka.nextInt();

                    r.set(ganti-1, new Reservasi(tanggalNew, jamNew, namaNew, paxNew, dpNew));
                    break;
                case 4:
                    System.out.print("Urutan yang ingin dihapus : ");
                    int hapus = angka.nextInt();
                    r.remove(hapus-1);
                    break;
            }
        }while(pilih!=0);
    }
}