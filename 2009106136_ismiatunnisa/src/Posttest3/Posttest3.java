package Posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Posttest3 {
    //study club web 
    static ArrayList <String>namaWeb = new ArrayList();
    static ArrayList <String>nimWeb = new ArrayList();
    static ArrayList <String>prodiWeb = new ArrayList();
    static ArrayList <String>alasanWeb = new ArrayList();
    
    //study club network
    static ArrayList <String>namaNet = new ArrayList();
    static ArrayList <String>nimNet = new ArrayList();
    static ArrayList <String>prodiNet = new ArrayList();
    static ArrayList <String>alasanNet = new ArrayList();
    
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
        System.out.println("[2] NETWORK");
        System.out.println("[3] ROBOTIC");
        System.out.println("[0] Exit");
        System.out.println("Pilih menu>");
        
        int PilihMenu = Integer.valueOf(input.readLine());
        switch(PilihMenu){
            case 1:
                WebProgramming();
                break;
            case 2:
                Network();
                break;
            case 3:
                Robotic();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan anda tidak tersedia");
        }
    }
        static void WebProgramming(){
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
                int i = 0;
                for(String nama : namaWeb){
                    String nim = nimWeb.get(i);
                    String prodi = prodiWeb.get(i);
                    String alasan = alasanWeb.get(i);
                    
                   Studyclub pendaftar = new Studyclub("ismiatunnisa", 2009106136, "informtika", "belajar" );  
                   System.out.println("nim pendaftar web:" + pendaftar.getNim());
                   System.out.println("nama pendaftar web:" + pendaftar.nama);
                   System.out.println("prodi pendaftar web:" + pendaftar.getProdi());
                   System.out.println("alasan pendaftar web:" + pendaftar.getAlasan());
            
                   System.out.println("No |     Nama     |     Nim     |   prodi   |    alasan  |");
                   System.out.println(i+"\t"+nama+"\t\t"+nim+"\t\t"+prodi+"\t\t"+alasan);
                
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
            
            Studyclub studyclubweb = new Studyclub (nama, 0, prodi, alasan);
            studyclubweb.tambah();
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
            namaWeb.set(indexStudyClub, nim);
            namaWeb.set(indexStudyClub, prodi);
            namaWeb.set(indexStudyClub, alasan);
            Studyclub studyclubweb = new Studyclub("nama", 0, "prodi", "alasan" );
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
            Studyclub studyclubweb = new Studyclub("ismiatunnisa", 2009106136, "informatika", "belajar");
            studyclubweb.hapus();
            WebProgramming();
        }
        static void Network(){
            System.out.println("======Menu Network=====");
            System.out.println("[1] Lihat Pendaftar");
            System.out.println("[2] Tambah Pendaftar");
            System.out.println("[3] Edit Pendaftar");
            System.out.println("[4] Hapus Pendaftar");
            System.out.println("[0] Back to Menu Study Club");
            System.out.println("Pilih menu>");
            
            int Pilih = Integer.valueOf(input.readLine());
            switch(Pilih){
                case 1:
                    LihatNet();
                    break;
                case 2:
                    TambahNet();
                    break;
                case 3:
                    EditWeb();
                    break;
                case 4:
                    HapusNet();
                    break;
                case 5:
                    ShowMenu();
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia");
               }
        }
        static void LihatNet() throws IOException{
            if(namaNet.isEmpty()){
                System.out.println("Belum ada data pendaftar network");
            } else {
                int i = 0;
                for(String nama : namaNet){
                    String nim = nimNet.get(i);
                    String prodi = prodiNet.get(i);
                    String alasan = alasanNet.get(i);
                    
                   Studyclub pendaftar = new Studyclub("ismiatunnisa", 2009106136, "informtika", "belajar" );  
                   System.out.println("nama pendaftar network:" + pendaftar.getNim());
                   System.out.println("nim pendaftar network:" + pendaftar.nama);
                   System.out.println("nim pendaftar network:" + pendaftar.getProdi());
                   System.out.println("nim pendaftar network:" + pendaftar.getAlasan());
            
                   System.out.println("No |     Nama     |     Nim     |   prodi   |    alasan  |");
                   System.out.println(i+"\t"+nama+"\t\t"+nim+"\t\t"+prodi+"\t\t"+alasan);
             
                }
            }
            Network();
        }
        static void TambahNet() throws IOException{
            System.out.println("Nama Lengkap:");
            String nama = input.readLine();
            namaNet.add(nama);
            System.out.println("Nim:");
            String nim = input.readLine();
            nimNet.add(nim);
            System.out.println("Prodi:");
            String prodi = input.readLine();
            prodiNet.add(prodi);
            System.out.println("Alasan memilih study club:");
            String alasan = input.readLine();
            alasanNet.add(alasan);
            
            Studyclub studyclubnet = new Studyclub (nama, 0, prodi, alasan);
            studyclubnet.tambah();
            Network();
        }
        static void EditNet() throws IOException{
            LihatWeb();
            System.out.print("Pilih index nama pendaftar Study Club Network:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Pendaftar Baru:");
            String nama = input.readLine();
            System.out.println("Nim Pendaftar Baru:");
            String nim = input.readLine();
            System.out.println("Prodi Pendaftar Baru:");
            String prodi = input.readLine();
            System.out.println("Alasan Pendaftar Baru:");
            String alasan = input.readLine();
            
            namaNet.set(indexStudyClub, nama);
            namaNet.set(indexStudyClub, nim);
            namaNet.set(indexStudyClub, prodi);
            namaNet.set(indexStudyClub, alasan);
            Studyclub studyclubnet = new Studyclub(nama, 0, prodi, alasan );
            studyclubnet.edit();
            Network();
        }
        static void HapusNet() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomer nama pendaftar Yang Ingin dihapus:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            namaNet.remove(indexStudyClub);
            nimNet.remove(indexStudyClub);
            prodiNet.remove(indexStudyClub);
            alasanNet.remove(indexStudyClub);
            Studyclub studyclubnet = new Studyclub("ismiatunnisa", 2009106136, "informatika", "belajar");
            studyclubnet.remove();
            Network();
        }
        
        static void Robotic(){
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
                for(String nama: namaRbt){
                    String nim = nimRbt.get(i);
                    String prodi = prodiRbt.get(i);
                    String alasan = alasanRbt.get(i);
                    
                   Studyclub pendaftar = new Studyclub("ismiatunnisa", 2009106136, "informtika", "belajar" );  
                   System.out.println("nama pendaftar robotic:" + pendaftar.getNim());
                   System.out.println("nim pendaftar robotic:" + pendaftar.nama);
                   System.out.println("nim pendaftar robotic:" + pendaftar.getProdi());
                   System.out.println("nim pendaftar robotic:" + pendaftar.getAlasan());
            
                   System.out.println("No |     Nama     |     Nim     |   prodi   |    alasan  |");
                   System.out.println(i+"\t"+nama+"\t\t"+nim+"\t\t"+prodi+"\t\t"+alasan);
             
                }
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
            
            Studyclub studyclubrbt = new Studyclub (nama, 0, prodi, alasan);
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
            Studyclub studyclubrbt = new Studyclub(nama, 0, prodi, alasan );
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
            Studyclub studyclubrbt = new Studyclub("nama", 0, "prodi", "alasan");
            studyclubrbt.hapus();
            Robotic();
        }
        
        public static void main(String[] args)throws IOException{
            do{
                ShowMenu();
            }while (isRunning);
        }
    }    

