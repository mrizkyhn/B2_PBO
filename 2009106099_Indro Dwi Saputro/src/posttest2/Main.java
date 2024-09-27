package posttest2;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Main{
    static ArrayList<Martabak> martabak = new ArrayList<Martabak>();
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
   public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("========Data Menu Martabak========");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Masukkan Data Martabak");
            System.out.println("2. Lihat Data Martabak"); 
            System.out.println("3. Ubah Data Martabak");
            System.out.println("4. Hapus Data Martabak");
            System.out.println("5. EXIT");
            System.out.println("----------------------------------------------------");
            System.out.println("Pilih[1-5] = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    idata();
                    break;
            case 2:
                    ldaftar();
                    break;
            case 3:
                    udata();
                    break;
            case 4:
                    hdata();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }

public static void idata() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            
    System.out.println("Masukkan nama martabak : ");
    nama = input.readLine();
    System.out.println("Masukkan harga martabak : ");
    harga = Integer.parseInt(input.readLine());
    
    if("".equals(nama) || "".equals(harga)){
        System.out.println("Data gagal ditambah");
        return;
    }
        Martabak Abaru = new Martabak (nama, harga);
        Abaru.nama = nama;
        Abaru.harga = harga;
        martabak.add(Abaru);
        Abaru.idata();
}           

public static void ldaftar()throws IOException{
            for(int i = 0 ; i < martabak.size();i++){
                System.out.println(i+1);
                System.out.println("Nama Martabak    : " + martabak.get(i).nama);
                System.out.println("Harga Martabak    : " + martabak.get(i).harga);
            }
}

public static void udata()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    ldaftar();
    System.out.println("Ubah Data Martabak");
    String nama;
    int harga;
    int index;
    System.out.println("Masukkan nomor data yang ingin di ubah");
    index = Integer.parseInt(input.readLine());
    index--;
    
    System.out.println("Masukkan nama martabak : ");
    nama = input.readLine();
    System.out.println("Masukkan harga martabak : ");
    harga = Integer.parseInt(input.readLine());
    
    martabak.get(index).nama = nama;
    martabak.get(index).harga = harga;
}

public static void hdata() throws IOException{
    ldaftar();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int t;
    System.out.println("input Slot index = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    martabak.get(t).hdata();
    martabak.remove(t);
    }

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("Terimakasih");
    System.out.println("Tekan 1 lalu Tekan ENTER untuk melanjutkan");
    a = Integer.parseInt(input.readLine());
    menu();
    }



} 