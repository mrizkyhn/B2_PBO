package Posttest1_132;
import java.util.ArrayList;
import java.util.Scanner;


public class manajemen_toko_pakaian{
    static ArrayList<String> StokPakaian = new ArrayList<String>();
        static Scanner input = new Scanner(System.in);
        public static void main(String[] args){
        showMenu();
        }
        
        static void showMenu(){    
            boolean ulang = true;
            while (ulang) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("==========================");
            System.out.println("===TOKO PAKAIAN RHIANNA===");
            System.out.println("==========================");
            System.out.println("1. Masukan Stok Pakaian");
            System.out.println("2. Tampilkan Stok Pakaian");
            System.out.println("3. Edit Stok Pakaian");
            System.out.println("4. Hapus Stok Pakaian");
            System.out.println("5. Keluar");
            System.out.println("--------------------------\n");
            System.out.print("Silahkan Pilih >>> ");
            int pilih = input.nextInt();
            
            if (pilih == 1){
                TambahStokPakaian();
                // break;
            }
            else if (pilih == 2){
                TampilkanStokPakaian();
                // break;
            }
            else if (pilih == 3){
                UbahStokPakaian();
                // break;
            }
            else if (pilih == 4){
                HapusStokPakaian();
                
            }
            else if (pilih == 5){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("========================");
                System.out.println(">>>>> Terima Kasih <<<<<");
                System.out.println("========================\n");
                System.exit(0);
            }

        }
    }
        static void TambahStokPakaian(){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("=====================================");  
            System.out.print(">>> Masukkan Jumlah Stok Pakaian : ");
            String jmlh = input.next();
            StokPakaian.add(jmlh);
            System.out.println("\n=====================================");
            System.out.println(">>> Stok Telah Berhasil Di Tambah <<<");
            System.out.println("=====================================\n\n");
            backMenu();
        }

        static void TampilkanStokPakaian(){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("=========================");
            System.out.println(">>> Data Stok Pakaian <<<");
            System.out.println("=========================\n");
            if(StokPakaian.isEmpty()){
                System.out.println(">>> Stok Pakaian Belum Ada \n");
            }
            for(int i = 0 ; i < StokPakaian.size();i++){
                System.out.println("-"+" Stok Pakaian ["+i+"] = "+StokPakaian.get(i));
            }
            
            // if ()
            backMenu();
        } 
        static void UbahStokPakaian(){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("=========================");
            System.out.println(">>> Ubah Stok Pakaian <<<");
            System.out.println("=========================\n");
            if(StokPakaian.isEmpty()){
                System.out.println(">>> Stok Pakaian Belum Ada \n");
                backMenu();
            }

            for(int i = 0 ; i < StokPakaian.size(); i++){
            System.out.println("-"+" Stok Pakaian ["+i+"] = "+StokPakaian.get(i));
        }
            System.out.print("\n>>> Pilih Index = ");
            int pilih = input.nextInt();
            System.out.print("\n>>> Ubah Menjadi = ");
            System.out.print("");
            String ubah = input.next();
            StokPakaian.set(pilih, ubah);
            System.out.println("\n===================================");
            System.out.println(">>> Stok Telah Berhasil Di Ubah <<<");
            System.out.println("===================================\n");
            backMenu();   
        }
        static void HapusStokPakaian(){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("==============================");
            System.out.println(">>>>> Hapus Stok Pakaian <<<<<");
            System.out.println("==============================\n");
            if(StokPakaian.isEmpty()){
                System.out.println(">>> Stok Pakaian Belum Ada \n");
                backMenu();
            }
            for(int i = 0 ; i < StokPakaian.size();i++){
                System.out.println("-"+" Stok Pakaian ["+i+"] = "+StokPakaian.get(i));
            }
            System.out.print("\n>>> Pilih Index = ");
            int t = input.nextInt();
            StokPakaian.remove(t);
            System.out.println("\n====================================");
            System.out.println(">>> Stok Telah Berhasil Di Hapus <<<");
            System.out.println("====================================\n");
            backMenu();
            
        }
        static void backMenu(){
            Scanner a = new Scanner(System.in);
            System.out.print("Tekan Enter Untuk Kembali ke Menu Utama >>>");
            String x = a.nextLine();
            showMenu();
        }
}

