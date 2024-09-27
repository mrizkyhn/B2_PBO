//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
package posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class Posttest3 {
    public static void main(String[] args) {
        ArrayList<Zakat> fitrah = new ArrayList<Zakat>();
        Scanner masuk = new Scanner(System.in);
        int pilih;
        
        Zakat zakat1 = new Zakat();
        
        while (true) {
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
                case 1:
                    System.out.println("--------TAMBAH DATA MUZAKKI-------");
                    System.out.print("");
                    System.out.print("Masukkan Nama: ");
                    String nama = masuk.next();
                    System.out.print("Masukkan Usia: ");
                    int usia = masuk.nextInt();
                    System.out.print("Masukkan Jenis Kelamin (P/L): ");
                    String jenkel = masuk.next();
                    System.out.print("Masukkan No. Telepon: ");
                    String telp = masuk.next();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = masuk.next();
                    System.out.print("Masukkan Harga Beras perKg: ");
                    String harga = masuk.next();
   
                    fitrah.add(new Zakat(nama, usia, jenkel, telp, alamat, harga));
                    zakat1.Simpan();
                    break;
                    
                case 2:
                    if(fitrah.isEmpty()) {
                        System.out.println("Data Kosong...");
                        break;
                    }
                    else {
                        for(int i=0; i<fitrah.size(); i++){
                        System.out.println("+-------------------------------+");
                        System.out.println("        DATA MUZAKKI - " + (i +1));
                        System.out.println("+-------------------------------+");
                        fitrah.get(i).display();
                        }
                        break;
                    }
                
                case 3:
                    System.out.println("--------UPDATE DATA MUZAKKI-------");
                    System.out.print("Masukkan Nama Muzakki: ");
                    String namaMuzakki = masuk.next();
                    for (Zakat zakat : fitrah) {
                        if (zakat.getNama().equals(namaMuzakki)) {
                            System.out.println("");
                            System.out.print("Masukkan Nama: ");
                            zakat.setNama(masuk.next());
                            System.out.print("Masukkan Usia: ");
                            zakat.setUsia(masuk.nextInt());
                            System.out.print("Masukkan Jenis Kelamin (P/L): ");
                            zakat.setJenkel(masuk.next());
                            System.out.print("Masukkan No. Telp: ");
                            zakat.setTelp(masuk.next());
                            System.out.print("Masukkan Alamat: ");
                            zakat.setAlamat(masuk.next());
                            System.out.print("Masukkan Harga Beras PerKg: ");
                            zakat.setHarga(masuk.next());
                            break;
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("--------HAPUS DATA MUZAKKI-------");
                    System.out.print("Masukkan Nama Muzakki: ");
                    String NamaMuzakki = masuk.next();
                    for (int i = 0; i < fitrah.size(); i++) {
                        if (fitrah.get(i).getNama().equals(NamaMuzakki)) {
                            fitrah.remove(i);
                            System.out.println("Data Berhasil Dihapus!!!");
                            break;
                        }
                    }
                    break;
                
                case 5:
                    System.out.println("            TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI           ");
                    System.out.println("");
                    System.out.println("+---------------------------------------------------------------+");
                    System.out.println("|  SEMOGA ALLAH MEMBERIKAN PAHALA ATAS APA YANG ENGKAU BERIKAN  |");
                    System.out.println("| DAN SEMOGA ALLAH MEMBERIKAN BERKAH ATAS HARTA YANG KAU SIMPAN |");
                    System.out.println("|         DAN MENJADIKANNYA SEBAGAI PEMBERSIH BAGIMU            |");
                    System.out.println("+---------------------------------------------------------------+");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak ada!!!");
                    break;
            }
        }
    }
}
