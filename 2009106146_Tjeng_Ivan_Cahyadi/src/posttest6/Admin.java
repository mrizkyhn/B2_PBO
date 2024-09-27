package posttest6;

import java.util.UUID;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static posttest6.Main.input;
import static posttest6.Main.write;
import static posttest6.Main.kumpulanBarang;

class Admin extends User {
    
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
        for (int i = 0; i < Main.kumpulanAdmin.size(); i++) {
            if(username.equals(Main.kumpulanAdmin.get(i).getUsername()) && password.equals(Main.kumpulanAdmin.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    static void tampilBarang(){
        System.out.println("DATA BARANG TOKO");
        System.out.println("");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.printf("%-5s%-100s%-20s%-40s%-11s%s\n", "No", "Nama", "Merk", "Jenis", "Harga", "Stock");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i = 0; i < kumpulanBarang.size(); i++){
            kumpulanBarang.get(i).printData(i + 1);
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
    }
    
    static void tambahBarang(){
        Scanner input = new Scanner(System.in);
        int harga, stock;
        String id = UUID.randomUUID().toString();
        System.out.print("Masukkan nama     : ");
        String nama = input.nextLine();
        System.out.print("Masukkan merk     : ");
        String merk = input.nextLine();
        System.out.print("Masukkan jenis    : ");
        String jenis = input.nextLine();
        while (true) {
            try {
                System.out.print("Masukkan harga    : ");
                harga = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("\nHarga berupa bilangan bulat!\n");
            }
        }
        while (true){
            try {
                System.out.print("Masukkan stock    : ");
                stock = Integer.parseInt(input.nextLine());
                if (stock >= 0){
                    break;
                } else{
                    System.out.println("Stock barang tidak bisa kurang dari 0!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("\nStock berupa bilangan bulat!\n");
            }
        }
        Toko temp = new Toko(id, nama, merk, jenis, harga, stock);
        kumpulanBarang.add(temp);
        System.out.println("\nBarang berhasil ditambahkan!\n");
        try {
            write.writeFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void editBarang() {
        Scanner input = new Scanner(System.in);
        int nomorBarang;
        tampilBarang();
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
        if ((nomorBarang - 1) < kumpulanBarang.size()) {
            String namaBaru = "", merkBaru = "", jenisBaru = "";
            int menu;
            do {
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("%            Edit Barang            %");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("% <1> Nama                          %");
                System.out.println("% <2> Merk                          %");
                System.out.println("% <3> Jenis                         %");
                System.out.println("% <4> Harga                         %");
                System.out.println("% <5> Stock                         %");
                System.out.println("% <6> Kembali                       %");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                while (true) {
                    try {
                        System.out.print(" Masukkan pilihan edit: ");
                        menu = Integer.parseInt(input.nextLine());
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("\nMasukkan menu berupa bilangan bulat!\n");
                    }
                }
                System.out.println("");
                switch (menu) {
                    case 1:
                        System.out.print("Masukkan nama baru: ");
                        namaBaru = input.nextLine();
                        kumpulanBarang.get(nomorBarang - 1).setNama(namaBaru);
                        System.out.println("\nNama barang berhasil diubah!\n");
                        try {
                            write.writeFile();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan merk baru: ");
                        merkBaru = input.nextLine();
                        kumpulanBarang.get(nomorBarang - 1).setMerk(merkBaru);
                        System.out.println("\nMerk barang berhasil diubah!\n");
                        try {
                            write.writeFile();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan jenis baru: ");
                        jenisBaru = input.nextLine();
                        kumpulanBarang.get(nomorBarang - 1).setJenis(jenisBaru);
                        System.out.println("\nJenis barang berhasil diubah!\n");
                        try {
                            write.writeFile();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 4:
                        int hargaBaru;
                        while (true) {
                            try {
                                System.out.print("Masukkan harga baru: ");
                                hargaBaru = Integer.parseInt(input.nextLine());
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nHarga berupa bilangan bulat!\n");
                            }
                        }
                        kumpulanBarang.get(nomorBarang - 1).setHarga(hargaBaru);
                        System.out.println("\nHarga barang berhasil diubah!\n");
                        try {
                            write.writeFile();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 5:
                        int stockBaru;
                        while (true) {
                            try {
                                System.out.print("Masukkan stock baru: ");
                                stockBaru = Integer.parseInt(input.nextLine());
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nHarga berupa bilangan bulat!\n");
                            }
                        }
                        if (stockBaru >= 0){
                            kumpulanBarang.get(nomorBarang - 1).setStock(stockBaru);
                            System.out.println("\nStock barang berhasil diubah!\n");
                            try {
                                write.writeFile();
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else{
                            System.out.println("Stock barang tidak bisa kurang dari 0!");
                        }
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Pilihan tidak ditemukan!");
                }
            } while(menu != 6);
        } else{
            System.out.println("Barang tidak ditemukan!\n");
        }
    }
    
    static void hapusBarang(){
        int nomorBarang;
        Scanner input = new Scanner(System.in);
        tampilBarang();
        System.out.println("HAPUS BARANG\n");
        while (true) {
            try {
                System.out.print("Masukkan nomor barang: ");
                nomorBarang = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("\nNomor barang berupa bilangan bulat!\n");
            }
        }
        if ((nomorBarang - 1) < kumpulanBarang.size()){
            kumpulanBarang.remove(nomorBarang - 1);
            System.out.println("\nBarang berhasil dihapus!\n");
            try {
                write.writeFile();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            System.out.println("\nNomor barang tidak ditemukan!\n");
        }
    }
    
    public static void admin() {
        
        int menu;

        do {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("%            Menu Admin            %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Tampil Barang                %");
            System.out.println("% <2> Tambah Barang                %");
            System.out.println("% <3> Edit Barang                  %");
            System.out.println("% <4> Hapus Barang                 %");
            System.out.println("% <5> Tampil Kasir (not done)      %");
            System.out.println("% <6> Tambah Kasir (not done)      %");
            System.out.println("% <7> Ubah  Kasir (not done)       %");
            System.out.println("% <8> Hapus  Kasir (not done)      %");
            System.out.println("% <9> Logout                       %");
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
            switch (menu) {
                case 1:
                    if (!Main.kumpulanBarang.isEmpty()){
                        tampilBarang();
                    } else{
                        System.out.println("Tidak ada barang!");
                    }
                    break;
                case 2:
                    tambahBarang();
                    break;
                case 3:
                    if (!kumpulanBarang.isEmpty()){
                        editBarang();
                    } else{
                        System.out.println("Tidak ada barang!");
                    }
                    break;
                case 4:
                    if (!kumpulanBarang.isEmpty()){
                        hapusBarang();
                    } else{
                        System.out.println("Tidak ada barang!");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 5);
    }
}