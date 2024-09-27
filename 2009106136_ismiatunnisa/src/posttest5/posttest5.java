package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class posttest5 {
    abstract void setNamalomba();
    abstract void setTgllomba();
    //study club web 
    static ArrayList <String>namaWeb = new ArrayList();
    static ArrayList <String>nimWeb = new ArrayList();
    static ArrayList <String>prodiWeb = new ArrayList();
    static ArrayList <String>alasanWeb = new ArrayList();
    
    //study club robotic
    static ArrayList <String>namaRbt = new ArrayList();
    static ArrayList <String>nimRbt = new ArrayList();
    static ArrayList <String>prodiRbt = new ArrayList();
    static ArrayList <String>alasanRbt = new ArrayList();
    
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void ShowMenu() throws IOException{
        System.out.println("======Menu Study Club=====");
        System.out.println("[1] WEB PROGRAMMING");
        System.out.println("[2] ROBOTIC");
        System.out.println("[0] Exit");
        System.out.println("Pilih menu>");
        
        int PilihMenu = Integer.valueOf(input.readLine());
        switch(PilihMenu){
            case 1:
                WebProgramming();
                break;
            case 2:
                Robotic();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan anda tidak tersedia");
        }
    }
        static void WebProgramming() throws IOException{
            System.out.println("======Menu WEB PROGRAMMING=====");
            System.out.println("[1] Lihat Pendaftar");
            System.out.println("[2] Tambah Pendaftar");
            System.out.println("[3] Edit Pendaftar");
            System.out.println("[4] Hapus Pendaftar");
            System.out.println("[0] Back to Menu Study Club");
            System.out.println("Pilih menu>");
            int Pilih = Integer.valueOf(input.readLine());
            switch(Pilih){
                case 1:
                    LihatWeb();
                    break;
                case 2:
                    TambahWeb();
                    break;
                case 3:
                    EditWeb();
                    break;
                case 4:
                    HapusWeb();
                    break;
                case 5:
                    ShowMenu();
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia");
               }
        }
        static void LihatWeb() throws IOException{
            if(namaWeb.isEmpty()){
                System.out.println("Belum ada data pendaftar study club web");
            } else {
                int i=0;
                System.out.println("No |     Nama     |     Nim     |   prodi   |    alasan  |");
                for(String nama : namaWeb){
                    String nim = nimWeb.get(i);
                    String prodi = prodiWeb.get(i);
                    String alasan = alasanWeb.get(i);
      
                   System.out.println(i+"\t"+nama+"\t\t"+nim+"\t\t"+prodi+"\t\t"+alasan);
                 i++;
                }
                
            WebProgramming();
        }
        }
        static void TambahWeb() throws IOException{
            System.out.println("Nama Lengkap:");
            String nama = input.readLine();
            namaWeb.add(nama);
            System.out.println("Nim:");
            String nim = input.readLine();
            nimWeb.add(nim);
            System.out.println("Prodi:");
            String prodi = input.readLine();
            prodiWeb.add(prodi);
            System.out.println("Alasan memilih study club:");
            String alasan = input.readLine();
            alasanWeb.add(alasan);
            
       
            WebProgramming() ;
        }
        
            
        static void EditWeb() throws IOException{
            LihatWeb();
            System.out.print("Pilih index nama pendaftar Study Club Web:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Pendaftar Baru:");
            String nama = input.readLine();
            System.out.println("Nim Pendaftar Baru:");
            String nim = input.readLine();
            System.out.println("Prodi Pendaftar Baru:");
            String prodi = input.readLine();
            System.out.println("Alasan Pendaftar Baru:");
            String alasan = input.readLine();
            
            namaWeb.set(indexStudyClub, nama);
            nimWeb.set(indexStudyClub, nim);
            prodiWeb.set(indexStudyClub, prodi);
            alasanWeb.set(indexStudyClub, alasan);
            pendaftaran studyclubweb = new pendaftaran("nama", 0, "prodi", "alasan" );
            studyclubweb.edit();
            WebProgramming();
        }
        static void HapusWeb() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomer nama pendaftar Yang Ingin dihapus:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            namaWeb.remove(indexStudyClub);
            nimWeb.remove(indexStudyClub);
            prodiWeb.remove(indexStudyClub);
            alasanWeb.remove(indexStudyClub);
            pendaftaran studyclubweb = new pendaftaran("ismiatunnisa", 2009106136, "informatika", "belajar");
            studyclubweb.hapus();
            WebProgramming();
        }
        static void Robotic() throws IOException{
            System.out.println("======Menu Robotic=====");
            System.out.println("[1] Lihat Pendaftar");
            System.out.println("[2] Tambah Pendaftar");
            System.out.println("[3] Edit Pendaftar");
            System.out.println("[4] Hapus Pendaftar");
            System.out.println("[0] Back to Menu Study Club");
            System.out.println("Pilih menu>");
            
            int Pilih = Integer.valueOf(input.readLine());
            switch(Pilih){
                case 1:
                    LihatRbt();
                    break;
                case 2:
                    TambahRbt();
                    break;
                case 3:
                    EditRbt();
                    break;
                case 4:
                    HapusRbt();
                    break;
                case 5:
                    ShowMenu();
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia");
               }
        }
        static void LihatRbt() throws IOException{
            if(namaRbt.isEmpty()){
                System.out.println("Belum ada data pendaftar robotic");
            } else {
                int i = 0;
                namaRbt.forEach(nama -> {
                    String nim = nimRbt.get(i);
                    String prodi = prodiRbt.get(i);
                    String alasan = alasanRbt.get(i);
                    
                    pendaftaran pendaftar = new pendaftaran("ismiatunnisa", 2009106136, "informtika", "belajar" );
                    System.out.println("nama pendaftar robotic:" + pendaftar.getNim());
                    System.out.println("nim pendaftar robotic:" + pendaftar.nama);
                    System.out.println("nim pendaftar robotic:" + pendaftar.getProdi());
                    System.out.println("nim pendaftar robotic:" + pendaftar.getAlasan());
                    
                    System.out.println("No |     Nama     |     Nim     |   prodi   |    alasan  |");
                    System.out.println(i+"\t"+nama+"\t\t"+nim+"\t\t"+prodi+"\t\t"+alasan);
                });
            }
            Robotic();
        }
        static void TambahRbt() throws IOException{
            System.out.println("Nama Lengkap:");
            String nama = input.readLine();
            namaRbt.add(nama);
            System.out.println("Nim:");
            String nim = input.readLine();
            nimRbt.add(nim);
            System.out.println("Prodi:");
            String prodi = input.readLine();
            prodiRbt.add(prodi);
            System.out.println("Alasan memilih study club:");
            String alasan = input.readLine();
            alasanRbt.add(alasan);
            
            pendaftaran studyclubrbt = new pendaftaran (nama, 0, prodi, alasan);
            studyclubrbt.tambah();
            Robotic();
        }
        static void EditRbt() throws IOException{
            LihatWeb();
            System.out.print("Pilih index nama pendaftar Study Club Robotic:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Pendaftar Baru:");
            String nama = input.readLine();
            System.out.println("Nim Pendaftar Baru:");
            String nim = input.readLine();
            System.out.println("Prodi Pendaftar Baru:");
            String prodi = input.readLine();
            System.out.println("Alasan Pendaftar Baru:");
            String alasan = input.readLine();
            
            namaRbt.set(indexStudyClub, nama);
            namaRbt.set(indexStudyClub, nim);
            namaRbt.set(indexStudyClub, prodi);
            namaRbt.set(indexStudyClub, alasan);
            pendaftaran studyclubrbt = new pendaftaran(nama, 0, prodi, alasan );
            studyclubrbt.edit();
            Robotic();
        }
        static void HapusRbt() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomer nama pendaftar Yang Ingin dihapus:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            namaWeb.remove(indexStudyClub);
            nimWeb.remove(indexStudyClub);
            prodiWeb.remove(indexStudyClub);
            alasanWeb.remove(indexStudyClub);
            pendaftaran studyclubrbt = new pendaftaran("nama", 0, "prodi", "alasan");
            studyclubrbt.hapus();
            Robotic();
        }
        
        public static void main(String[] args)throws IOException{
            perlombaan lomba = new perlombaan("lomba pemprograman web",19062022);
            System.out.println("Nama Lomba:");
            String namalomba = input.readLine();
            namaRbt.add(namalomba);
            System.out.println("Tanggal lomba:");
            String tgllomba = input.readLine();
           
            Robotic();
        
            do{
                ShowMenu();
                
            }while (isRunning);
        }
    }    

