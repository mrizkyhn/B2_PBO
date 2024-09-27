
package postest2;


import java.util.ArrayList;
import java.util.Scanner;

public class rillo {
    public static void main(String[] args) {
        ArrayList<String> ListNamaPeserta = new ArrayList<>();
        ArrayList<String> ListJenisPeserta = new ArrayList<>();
        Scanner input_int = new Scanner(System.in);
        Scanner input_str = new Scanner(System.in);
        int menu;
        
        do {
            System.out.println("===== Menu Kursus Bahasa Inggris =====");
            System.out.println("[1] Tambah Peserta");
            System.out.println("[2] Lihat Peserta");
            System.out.println("[3] Edit Peserta");
            System.out.println("[4] Hapus Peserta");
            System.out.println("[5] Keluar");
            System.out.print("Input Menu : ");
            menu = input_int.nextInt();
            if(menu == 1) {
                System.out.println("===== Tambah Peserta =====");
                System.out.print("Masukkan Nama Peserta  : ");
                ListNamaPeserta.add(input_str.nextLine());
                System.out.print("Masukkan Jenis Peserta (Regular/Private) : ");
                ListJenisPeserta.add(input_str.nextLine());
                System.out.println("Peserta telah ditambahkan!");
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
                
                peserta pesertabaru = new peserta("","","","");
                pesertabaru.addDataPeserta();
            } else if(menu == 2) {
                System.out.println("===== Lihat Peserta =====");
                if(ListNamaPeserta.isEmpty()) System.out.println("Data Kosong!");
                else {
                    System.out.println("===============================================");
                    for(int i = 0; i < ListNamaPeserta.size(); i++) {
                        System.out.println("No Peserta    : " + (i+1));
                        System.out.println("Nama Peserta  : " + ListNamaPeserta.get(i));
                        System.out.println("Jenis Peserta : " + ListJenisPeserta.get(i));
                        System.out.println("===============================================");                    
                    }
                }
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            } else if(menu == 3) {                
                System.out.println("===== Edit Peserta =====");
                if(ListNamaPeserta.isEmpty()) System.out.println("Data Kosong!");
                else {
                    System.out.println("===============================================");
                    for(int i = 0; i < ListNamaPeserta.size(); i++) {
                        System.out.println("No Peserta    : " + (i+1));
                        System.out.println("Nama Peserta  : " + ListNamaPeserta.get(i));
                        System.out.println("Jenis Peserta : " + ListJenisPeserta.get(i));
                        System.out.println("===============================================");                    
                    }
                    System.out.print("Masukkan Nomor Instansi yang ingin diubah: ");
                    int no = input_int.nextInt();
                    System.out.print("Masukkan Nama Peserta                    : ");
                    ListNamaPeserta.set(no-1, input_str.nextLine());
                    System.out.print("Masukkan Jenis Peserta (Regular/Private) : ");
                    ListJenisPeserta.set(no-1, input_str.nextLine());
                    System.out.println("Peserta telah diperbaharui!");
                }
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            } else if(menu == 4) {                
                System.out.println("===== Hapus Peserta =====");
                if(ListNamaPeserta.isEmpty()) System.out.println("Data Kosong!");
                else {
                    System.out.println("===============================================");
                    for(int i = 0; i < ListNamaPeserta.size(); i++) {
                        System.out.println("No Peserta    : " + (i+1));
                        System.out.println("Nama Peserta  : " + ListNamaPeserta.get(i));
                        System.out.println("Jenis Peserta : " + ListJenisPeserta.get(i));
                        System.out.println("===============================================");                    
                    }
                    System.out.print("Masukkan No Peserta yang ingin dihapus: ");
                    int no = input_int.nextInt();
                    ListNamaPeserta.remove(no-1);
                    ListJenisPeserta.remove(no-1);
                    System.out.println("Peserta telah dihapus!");
                }
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            } else if(menu == 5) {                
                System.out.println("Terima Kasih!");
            } else {                
                System.out.println("Menu Salah!");
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            }
        } while(menu != 5);
    }    
}