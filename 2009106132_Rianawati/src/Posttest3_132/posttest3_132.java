package Posttest3_132;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class posttest3_132{
    static ArrayList<Pakaian> StokPakaian = new ArrayList<>();
        static int harga, jumlah, index;
        static String nama, bahan, warna;
        static BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
        
        public static void main(String[] args) throws IOException{
        showMenu();
        }
        static void backMenu() throws IOException{
            
            System.out.print("Tekan Enter Untuk Kembali ke Menu Utama >>>");
            String x = input.readLine();
            showMenu();
        }
        static void showMenu() throws IOException{    
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
            int pilih = Integer.parseInt(input.readLine());
            
            if (pilih == 1){
                TambahStokPakaian();
                // break;
            }
            else if (pilih == 2){
                TampilkanStokPakaian();
                backMenu();
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
        static void TambahStokPakaian() throws IOException{  
            System.out.println("=====================================");  
            System.out.println(">>> Masukkan Nama Pakaian  : ");
            nama = input.readLine();
            System.out.println(">>> Masukkan Bahan Pakaian : ");
            bahan = input.readLine();
            System.out.println(">>> Masukkan Warna Pakaian : ");
            warna = input.readLine();
            System.out.println(">>> Masukkan Harga Pakaian : ");
            harga = Integer.parseInt(input.readLine());
            System.out.println(">>> Masukkan Jumlah Pakaian : ");
            jumlah = Integer.parseInt(input.readLine());
            
            
            if("".equals(nama) || "".equals(nama) || "".equals(bahan) || "".equals(warna) || "".equals(harga) || "".equals(jumlah)){
            System.out.println("\n*================================*");
            System.out.println("|     Data Gagal Ditambahkan     |");
            System.out.println("================================\n");
            return;
            }
            
            Pakaian PakaianMasuk = new Pakaian(nama, bahan, warna, harga, jumlah);
//            PakaianMasuk.nama = nama;
//            PakaianMasuk.bahan = bahan;
//            PakaianMasuk.warna = warna;
//            PakaianMasuk.harga = harga;
//            PakaianMasuk.jumlah = jumlah;
            StokPakaian.add(PakaianMasuk);
            PakaianMasuk.BerhasilDitambah();
            backMenu();
            
        }

        static void TampilkanStokPakaian() throws IOException{ 
            System.out.println("=========================");
            System.out.println(">>> Data Stok Pakaian <<<");
            System.out.println("=========================\n");
            if(StokPakaian.isEmpty()==true){
                System.out.println(">>> Stok Pakaian Belum Ada \n");
            }
            else {
               for(int i = 0 ; i < StokPakaian.size();i++){
                System.out.println("-"+" Nomor ["+(i+1)+"]  ");
                System.out.println("- Nama  : "+ StokPakaian.get(i).getNama());
                System.out.println("- Bahan : "+ StokPakaian.get(i).getBahan());
                System.out.println("- Warna : "+ StokPakaian.get(i).getWarna());
                System.out.println("- Harga : "+ StokPakaian.get(i).getHarga());
                System.out.println("- Jumlah: "+ StokPakaian.get(i).getJumlah());
            }
            }
            
            

        } 
        static void UbahStokPakaian() throws IOException{
            System.out.println("=========================");
            System.out.println(">>> Ubah Stok Pakaian <<<");
            System.out.println("=========================\n");
            if(StokPakaian.isEmpty()==true){
                System.out.println(">>> Stok Pakaian Belum Ada \n");
                backMenu();
            }
            TampilkanStokPakaian();
        
            System.out.print("\n>>> Pilih Nomor = ");
            index = Integer.parseInt(input.readLine());
            index--;
            System.out.println(">>> Masukkan Nama Pakaian Baru   : ");
            nama = input.readLine();
            System.out.println(">>> Masukkan Bahan Pakaian Baru  : ");
            bahan = input.readLine();
            System.out.println(">>> Masukkan Warna Pakaian Baru  : ");
            warna = input.readLine();
            System.out.println(">>> Masukkan Harga Pakaian Baru  : ");
            harga = Integer.parseInt(input.readLine());
            System.out.println(">>> Masukkan Jumlah Pakaian Baru : ");
            jumlah = Integer.parseInt(input.readLine());
            
            StokPakaian.get(index).setNama (nama);
            StokPakaian.get(index).setBahan(bahan);
            StokPakaian.get(index).setWarna(warna);
            StokPakaian.get(index).setHarga(harga);
            StokPakaian.get(index).setJumlah(jumlah);
            StokPakaian.get(index).BerhasilDiubah();

            backMenu();   
        }
        static void HapusStokPakaian() throws IOException{
            System.out.println("==============================");
            System.out.println(">>>>> Hapus Stok Pakaian <<<<<");
            System.out.println("==============================\n");
            if(StokPakaian.isEmpty()==true){
                System.out.println(">>> Stok Pakaian Belum Ada \n");
                backMenu();
            }
            TampilkanStokPakaian();
        
            System.out.print("\n>>> Pilih Nomor = ");
            index = Integer.parseInt(input.readLine());
            index--;
            StokPakaian.get(index).BerhasilDihapus();
            StokPakaian.remove(index);

            backMenu();
            
        }
        
}

