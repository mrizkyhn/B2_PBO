//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
        
package posttest1;

import java.util.ArrayList;
import java.util.Scanner;

class Zakat {
    String nama;
    int usia;
    String jenkel;
    String telp;
    String alamat;
    String harga;
    
    Zakat(String nama, int usia, String jenkel, String telp, String alamat, String harga){
        this.nama = nama;
        this.usia = usia;
        this.jenkel = jenkel;
        this.telp = telp;
        this.alamat = alamat;
        this.harga = harga;
    }   
}


public class Posttest1 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        ArrayList<Zakat> fitrah = new ArrayList<Zakat>();
        int pilih;
        
        do{
            System.out.println("+------------------------------------------------+");
            System.out.println("|                SELAMAT DATANG                  |");
            System.out.println("|        DI SISTEM PENDATAAN ZAKAT FITRAH        |");
            System.out.println("+------------------------------------------------+");
            System.out.println("Menu pilihan ZAKAT FITRAH");
            System.out.println("[1] Masukkan Data");
            System.out.println("[2] Tampilkan Data"); 
            System.out.println("[3] Update Data");
            System.out.println("[4] Hapus Data");
            System.out.println("[5] Keluar");
            System.out.println("--------------------------------------------------");
            System.out.print("Pilih menu >> ");
            pilih = masuk.nextInt();
            switch(pilih){
                case (1) -> {
                    System.out.println("  TAMBAH DATA  ");
                    System.out.print("Masukkan nama: ");
                    String nama = masuk.next();
                    System.out.print("Masukkan usia: ");
                    int usia = masuk.nextInt();
                    System.out.print("Masukkan jenis kelamin: ");
                    String jenkel = masuk.next();
                    System.out.print("Masukkan no. telepon: ");
                    String telp = masuk.next();
                    System.out.print("Masukkan alamat: ");
                    String alamat = masuk.next();
                    System.out.print("Masukkan harga beras per KG: ");
                    String harga = masuk.next();
                    System.out.println("Data berhasil ditambahkan!!!");
                    
                    fitrah.add(new Zakat(nama, usia, jenkel, telp, alamat, harga));   
                }
                case (2) -> {
                    if(fitrah.isEmpty()){
                        System.out.println("Data kosong");
                    }
                    else {
                        for(int i=0; i<fitrah.size(); i++){
                            System.out.print("Data Muzakki - "+ (i +1));
                            System.out.print("Nama           : "+ fitrah.get(i).nama);
                            System.out.print("Usia           : "+ fitrah.get(i).usia);
                            System.out.print("Jenis Kelamin  : "+ fitrah.get(i).jenkel);
                            System.out.print("No. Telp       : "+ fitrah.get(i).telp);
                            System.out.print("Alamat         : "+ fitrah.get(i).alamat);
                            System.out.print("Harga          : "+ fitrah.get(i).harga);
                        }
                    }
                }
                case (3) -> {
                    for(int i = 0 ; i < fitrah.size();i++){
                    System.out.println("Data Muzakki["+ i +"] : "+ fitrah.get(i));}
                    System.out.println("Masukkan index yang ingin diupdate : ");
                    int j = masuk.nextInt();
                    System.out.println("Masukkan nama : ");
                    String m = masuk.next();
//                    fitrah.set();
                    break;
                        }
                case (4) -> {
                    System.out.println("Masukkan index yang ingin dihapus : ");
                    int hps = masuk.nextInt();
                    fitrah.remove(hps);
                    System.out.println("Data berhasil dihapus!!!");
                    break;
                }
                case (5) -> {
                    System.out.println("            TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI           ");
                    System.out.println("");
                    System.out.println("+---------------------------------------------------------------+");
                    System.out.println("|  SEMOGA ALLAH MEMBERIKAN PAHALA ATAS APA YANG ENGKAU BERIKAN  |");
                    System.out.println("| DAN SEMOGA ALLAH MEMBERIKAN BERKAH ATAS HARTA YANG KAU SIMPAN |");
                    System.out.println("|         DAN MENJADIKANNYA SEBAGAI PEMBERSIH BAGIMU            |");
                    System.out.println("+---------------------------------------------------------------+");
                    System.exit(0);
                }
            }
        }
        while(pilih != 5);
    }
}


        
 