package posttest6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static posttest6.Main.input;
import static posttest6.Main.kumpulanBarang;
import static posttest6.Main.kumpulanBarangBelanja;
import static posttest6.Main.write;

class Kasir extends User {
    @Override
    public void register(String nama_user, String email_user, String nomor_telepon_user, String username, String password) {
        this.setNamaUser(nama_user);
        this.setEmailUser(email_user);
        this.setNomorTeleponUser(nomor_telepon_user);
        this.setUsername(username);
        this.setPassword(password);
    }

    @Override
    public boolean login(String username, String password) {
        for (int i = 0; i < Main.kumpulanKasir.size(); i++) {
            if(username.equals(Main.kumpulanKasir.get(i).getUsername()) && password.equals(Main.kumpulanKasir.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    static int stockBarang(ArrayList<Toko> kumpulanBarang) {
        int totalStockBarang = 0;
        for (Toko barang : kumpulanBarang) {
            totalStockBarang += barang.getStock();
        }
        return totalStockBarang;
    }
    
    static boolean existBarangBelanja(ArrayList<Belanja> kumpulanBarangBelanja, Toko barangDibeli) {
        for (Belanja barang : kumpulanBarangBelanja) {
            if (barang.getId().equals(barangDibeli.getId())){
                return true;
            }
        }
        return false;
    }
    
    static void tampilBarangBelanja(){
        System.out.println("DATA BARANG BELANJA");
        System.out.println("");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.printf("%-5s%-100s%-20s%-11s%s\n", "No", "Nama", "Merk", "Harga", "Jumlah Barang");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i = 0; i < kumpulanBarangBelanja.size(); i++){
            kumpulanBarangBelanja.get(i).printData(i + 1);
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
    }
    
    static void tambahBarangBelanja(){
        Admin.tampilBarang();
        Scanner input = new Scanner(System.in);
        int nomorBarang;
        while (true) {
            try {
                System.out.print("Masukkan nomor barang yang dibeli: ");
                nomorBarang = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("\nNomor barang berupa bilangan bulat!\n");
            }
        }
        if (nomorBarang > 0 && nomorBarang <= kumpulanBarang.size()){
            while (true){
                int jumlahBarang;
                while (true) {
                    try {
                        System.out.print("Masukkan jumlah barang yang dibeli: ");
                        jumlahBarang = Integer.parseInt(input.nextLine());
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("\nJumlah barang berupa bilangan bulat!\n");
                    }
                }
                if (jumlahBarang > 0 && jumlahBarang <= kumpulanBarang.get(nomorBarang - 1).getStock()){
                    System.out.println("");
                    if (!(existBarangBelanja(kumpulanBarangBelanja, kumpulanBarang.get(nomorBarang - 1)))){
                        Belanja temp = new Belanja(kumpulanBarang.get(nomorBarang - 1).getId(), kumpulanBarang.get(nomorBarang - 1).getNama(), kumpulanBarang.get(nomorBarang - 1).getMerk(), kumpulanBarang.get(nomorBarang - 1).getHarga(), jumlahBarang);
                        kumpulanBarangBelanja.add(temp);
                        kumpulanBarang.get(nomorBarang - 1).setStock(kumpulanBarang.get(nomorBarang - 1).getStock() - jumlahBarang);
                        System.out.println("Barang belanja berhasil ditambahkan!");
                        try {
                            write.writeFile();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    } else{
                        for (int i = 0; i < kumpulanBarangBelanja.size(); i++) {
                            if (kumpulanBarangBelanja.get(i).getId().equals(kumpulanBarang.get(nomorBarang - 1).getId())){
                                kumpulanBarangBelanja.get(i).setJumlahBarang(kumpulanBarangBelanja.get(i).getJumlahBarang() + jumlahBarang);
                                kumpulanBarang.get(nomorBarang - 1).setStock(kumpulanBarang.get(nomorBarang - 1).getStock() - jumlahBarang);
                                break;
                            }
                        }
                        System.out.println("Barang belanja berhasil ditambahkan!");
                        try {
                            write.writeFile();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                } else{
                    System.out.println("\nStock barang tidak mencukupi!");
                    break;
                }
            }
        } else{
            System.out.println("\nBarang tidak ditmeukan!");
        }
    }
    
    static void ubahJumlahBarangBelanja() {
        Scanner input = new Scanner(System.in);
        tampilBarangBelanja();
        System.out.println("UBAH JUMLAH BARANG BELANJA");
        int nomorBarang;
        while (true) {
            try {
                System.out.print("Masukkan nomor barang: ");
                nomorBarang = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("\nNomor barang berupa bilangan bulat!\n");
            }
        }
        if (nomorBarang <= kumpulanBarangBelanja.size() && nomorBarang > 0) {
            for (Toko barang : kumpulanBarang) {
                if (kumpulanBarangBelanja.get(nomorBarang - 1).getId().equals(barang.getId())) {
                    System.out.println("\nStock barang yang tersedia: " + (barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang()) + "\n");
                    int jumlahBarang;
                    while (true) {
                        try {
                            System.out.print("Masukkan jumlah barang baru: ");
                            jumlahBarang = Integer.parseInt(input.nextLine());
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nJumlah barang berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if (jumlahBarang > 0 && jumlahBarang <= (barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang())) {
                        barang.setStock(barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang() - jumlahBarang);
                        kumpulanBarangBelanja.get(nomorBarang - 1).setJumlahBarang(jumlahBarang);
                        System.out.println("Jumlah barang belanja berhasil diubah!");
                        try {
                            write.writeFile();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    } else{
                        System.out.println("Jumlah barang tidak mencukupi!");
                        break;
                    }
                }
            }
        } else {
            System.out.println("\nBarang belanja tidak ditemukan!");
        }
    }
    
    static void hapusBarangBelanja() {
        Scanner input = new Scanner(System.in);
        tampilBarangBelanja();
        System.out.println("HAPUS BARANG");
        int nomorBarang;
        while (true) {
            try {
                System.out.print("Masukkan nomor barang: ");
                nomorBarang = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("\nNomor barang berupa bilangan bulat!\n");
            }
        }
        System.out.println("");
        if (nomorBarang <= kumpulanBarangBelanja.size() && nomorBarang > 0){
            for (Toko barang : kumpulanBarang) {
                if (barang.getId().equals(kumpulanBarangBelanja.get(nomorBarang - 1).getId())) {
                    barang.setStock(barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang());
                    break;
                }
            }
            kumpulanBarangBelanja.remove(nomorBarang - 1);
            System.out.println("Barang berhasil dihapus!");
            try {
                write.writeFile();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            System.out.println("Nomor barang tidak ditemukan!");
        }
    }
    
    static void tampilBadanTransaksi(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.printf("%-5s%-100s%-15s%-20s%-20s%-11s\n", "No", "Nama", "Jumlah Barang", "Harga (Satuan)", "Pajak (Total)", "Subtotal");
        for (int i = 0; i < kumpulanBarangBelanja.size(); i++) {
            if (kumpulanBarangBelanja.get(i).getJumlahBarang() > 1) {
                System.out.printf("%-5s%-100s%-15s%-20s%-20s%-11s\n", String.valueOf(i + 1), kumpulanBarangBelanja.get(i).getNama(), String.valueOf(kumpulanBarangBelanja.get(i).getJumlahBarang()), ("Rp" + String.valueOf((double)kumpulanBarangBelanja.get(i).getHarga())), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).pajakBarang(kumpulanBarangBelanja.get(i).getJumlahBarang()))), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).subtotalBarangBelanja())));
            } else {
                System.out.printf("%-5s%-100s%-15s%-20s%-20s%-11s\n", String.valueOf(i + 1), kumpulanBarangBelanja.get(i).getNama(), String.valueOf(kumpulanBarangBelanja.get(i).getJumlahBarang()), ("Rp" + String.valueOf((double)kumpulanBarangBelanja.get(i).getHarga())), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).pajakBarang())), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).subtotalBarangBelanja())));
            }
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
    
    static double totalTransaksi(){
        double total = 0.0;
        for (Belanja barang : kumpulanBarangBelanja) {
            total += barang.subtotalBarangBelanja();
        }
        return total;
    }
    
    static void transaksi(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tanggal = new Date();
        Scanner input = new Scanner(System.in);
        double uangPembeli = 0.0;
        tampilBadanTransaksi();
        System.out.println("Total\tRp" + totalTransaksi());
        System.out.println("PERHATIKAN!");
        System.out.println("Jika memilih ya, maka transaksi tidak dapat dibatalkan!");
        System.out.print("Konfirmasi transaksi(y/n): ");
        String confirm = input.nextLine();
        if (confirm.equals("y")) {
            System.out.print("Masukkan nama pembeli: ");
            String namaPembeli = input.nextLine();
            System.out.print("Masukkan alamat pembeli: ");
            String alamatPembeli = input.nextLine();
            System.out.print("Masukkan nomor telepon pembeli: ");
            String nomorTeleponPembeli = input.nextLine();
            while (true) {
                while (true) {
                    try {
                        System.out.print("Masukkan uang pembeli: ");
                        uangPembeli = Double.parseDouble(input.nextLine());
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("\nUang berupa bilangan!\n");
                    }
                }
                if (uangPembeli < totalTransaksi()) {
                    System.out.println("Uang pembeli tidak cukup!");
                } else{
                    break;
                }
            }
            System.out.println("\n                                                                              FAKTUR PENJUALAN                                                                              ");
            System.out.println("                                                                                 " + sdf.format(tanggal) + "                                                                                 \n");
            System.out.printf("%-144s", "Akilektronika");
            System.out.print("Kepada Yth: " + namaPembeli + "\n");
            System.out.printf("%-144s", "Jl. Nasi Berantas No. 666");
            System.out.print(alamatPembeli + "\n");
            System.out.printf("%-144s", "Telp. 1234567 Namek");
            System.out.print(nomorTeleponPembeli + "\n\n");
            tampilBadanTransaksi();
            System.out.printf("\n%-144s", "");
            System.out.print("Total         : Rp" + String.valueOf(totalTransaksi()) + "\n");
            System.out.printf("%-144s", "");
            System.out.print("Dibayar       : Rp" + String.valueOf(uangPembeli) + "\n");
            System.out.printf("%-144s", "");
            System.out.print("Kembali       : Rp" + String.valueOf((uangPembeli - totalTransaksi())) + "\n");
            kumpulanBarangBelanja.clear();
        }
    }
    
    static void kasir(){
        
        int menu;
        
        while (true) {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("%            Menu Kasir            %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Tampil Barang                %");
            System.out.println("% <2> Tampil Barang Belanja        %");
            System.out.println("% <3> Tambah Barang Belanja        %");
            System.out.println("% <4> Ubah Jumlah Barang Belanja   %");
            System.out.println("% <5> Hapus Barang Belanja         %");
            System.out.println("% <6> Transaksi                    %");
            System.out.println("% <7> Logout                      %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            while (true) {
                try {
                    System.out.print("Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            if (menu == 1) {
                if (!kumpulanBarang.isEmpty()){
                    Admin.tampilBarang();
                } else{
                    System.out.println("Tidak ada barang toko!");
                }
            } else if (menu == 2) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    tampilBarangBelanja();
                } else{
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 3) {
                if (stockBarang(kumpulanBarang) > 0 && !kumpulanBarang.isEmpty()){
                    tambahBarangBelanja();
                } else{
                    System.out.println("Tidak ada stock barang toko yang tersisa!");
                }
            } else if (menu == 4) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    ubahJumlahBarangBelanja();
                } else {
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 5) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    hapusBarangBelanja();
                } else{
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 6) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    transaksi();
                } else{
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 7) {
                BufferedReader inputHuruf = new BufferedReader(new InputStreamReader(System.in));
                String confirm = "";
                try {
                    System.out.print("Konfirmasi untuk keluar(y/n): ");
                    confirm = inputHuruf.readLine();
                } catch(Exception e){
                }
                if (confirm.equals("y")) {
                    for (int i = 0; i < kumpulanBarangBelanja.size(); i++) {
                        for (int j = 0; j < kumpulanBarang.size(); j++) {
                            if (kumpulanBarangBelanja.get(i).getId().equals(kumpulanBarang.get(j).getId())) {
                                kumpulanBarang.get(j).setStock(kumpulanBarangBelanja.get(i).getJumlahBarang() + kumpulanBarang.get(j).getStock());
                            }
                        }
                    }
                    System.out.println("");
                    try {
                        write.writeFile();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            } else {
                System.out.println("Menu tidak ditemukan!");
            }
            System.out.println("");
        }
    }
}