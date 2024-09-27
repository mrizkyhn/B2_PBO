//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
package posttest4;

import java.util.ArrayList;
import java.util.Scanner;

public class Posttest4 {
    public static void main(String[] args) {
        ArrayList<Zakat> fitrah = new ArrayList<Zakat>();
        ArrayList<Perorang> orangg = new ArrayList<Perorang>();
        ArrayList<Perkeluarga> keluargaa = new ArrayList<Perkeluarga>();
        Scanner masuk = new Scanner(System.in);
        int pilih;
        int pilihan;
        
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
                    System.out.println("Silahkan pilih pembayaran zakat untuk...");
                    System.out.println("[1] Sendiri");
                    System.out.println("[2] Keluarga");
                    System.out.println("-----------------------------------");
                    System.out.print("Pilih >> ");
                    pilihan = masuk.nextInt();
                    if(pilihan == 1){
                        System.out.print("Masukkan Kategori: ");
                        String orang = masuk.next();
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
   
                        orangg.add(new Perorang(orang, nama, usia, jenkel, telp, alamat, harga));
                        zakat1.Simpan();
                        
                    }else{
                        System.out.print("Masukkan Kategori: ");
                        String keluarga = masuk.next();
                        System.out.print("Masukkan Jumlah Anggota: ");
                        int jumAnggota = masuk.nextInt();
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
                        
                        keluargaa.add(new Perkeluarga(keluarga, jumAnggota, nama, usia, jenkel, telp, alamat, harga));
                        zakat1.Simpan();
                    }
                    break;
                    
                case 2:
                    for(int i=0; i<orangg.size(); i++){
                    System.out.println("+-------------------------------+");
                    System.out.println("        DATA MUZAKKI - " + (i +1));
                    System.out.println("+-------------------------------+");
                    orangg.get(i).display();
                    }
                    for(int i=0; i<keluargaa.size(); i++){
                    System.out.println("+-------------------------------+");
                    System.out.println("        DATA MUZAKKI - " + (i +1));
                    System.out.println("+-------------------------------+");
                    keluargaa.get(i).display();
                    }
                    break; 
                
                case 3:
                    System.out.println("--------UPDATE DATA MUZAKKI-------");
                    System.out.print("Masukkan Nama Muzakki: ");
                    String namaMuzakki = masuk.next();
                    for (Perorang perorang : orangg) {
                        if (perorang.getNama().equals(namaMuzakki)) {
                            System.out.println("");
                            System.out.print("Masukkan Nama: ");
                            perorang.setNama(masuk.next());
                            System.out.print("Masukkan Usia: ");
                            perorang.setUsia(masuk.nextInt());
                            System.out.print("Masukkan Jenis Kelamin (P/L): ");
                            perorang.setJenkel(masuk.next());
                            System.out.print("Masukkan No. Telp: ");
                            perorang.setTelp(masuk.next());
                            System.out.print("Masukkan Alamat: ");
                            perorang.setAlamat(masuk.next());
                            System.out.print("Masukkan Harga Beras PerKg: ");
                            perorang.setHarga(masuk.next());
                            break;
                        }
                    }
                    for (Perkeluarga perkeluarga : keluargaa) {
                        if (perkeluarga.getNama().equals(namaMuzakki)) {
                            System.out.println("");
                            System.out.print("Masukkan Nama: ");
                            perkeluarga.setNama(masuk.next());
                            System.out.print("Masukkan Usia: ");
                            perkeluarga.setUsia(masuk.nextInt());
                            System.out.print("Masukkan Jenis Kelamin (P/L): ");
                            perkeluarga.setJenkel(masuk.next());
                            System.out.print("Masukkan No. Telp: ");
                            perkeluarga.setTelp(masuk.next());
                            System.out.print("Masukkan Alamat: ");
                            perkeluarga.setAlamat(masuk.next());
                            System.out.print("Masukkan Harga Beras PerKg: ");
                            perkeluarga.setHarga(masuk.next());
                            break;
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("--------HAPUS DATA MUZAKKI-------");
                    System.out.print("Masukkan Nama Muzakki: ");
                    String NamaMuzakki = masuk.next();
                    for (int i = 0; i < orangg.size(); i++) {
                        if (orangg.get(i).getNama().equals(NamaMuzakki)) {
                            orangg.remove(i);
                            System.out.println("Data Berhasil Dihapus!!!");
                            break;
                        }
                    }
                    for (int i = 0; i < keluargaa.size(); i++){
                        if (keluargaa.get(i).getNama().equals(NamaMuzakki)) {
                            keluargaa.remove(i);
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
