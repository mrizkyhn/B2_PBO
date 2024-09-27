package Posttest4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private static int harga;
    private static String jenislapangan;
    public static void main(String[] args) throws IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Sintetis> dataSintetis = new ArrayList<>();
        ArrayList<Matras> dataMatras = new ArrayList<>();
        int pilihan;
        String namapenyewa;
         
        
        while (true) {   
        System.out.println("|*********MENU************|");
        System.out.println("|1. Tambah Data           |");
        System.out.println("|2. Lihat Data            |");
        System.out.println("|3. Edit Data             |");
        System.out.println("|4. Hapus Data            |");
        System.out.println("|5. Exit                  |");
        System.out.println("|*************************|");
            System.out.print("Input Menu : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1. Sintetis");
                    System.out.println("2. Matras");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan Nama Penyewa : ");
                        namapenyewa = input.readLine();
                        System.out.println("Masukan Nomor Lapangan : ");
                        String nomorlapangan = input.readLine();
                        System.out.println("Masukan Harga : ");
                        Integer.parseInt(input.readLine());
                        dataSintetis.add(new Sintetis(namapenyewa, nomorlapangan, jenislapangan, harga));
                    } 
                    if (pilihan == 2) {
                        System.out.println("Masukan Nama Penyewa : ");
                        namapenyewa = input.readLine();
                        System.out.println("Masukan Nomor Lapangan : ");
                        String nomorlapangan = input.readLine();
                        System.out.println("Masukan Harga : ");
                        Integer.parseInt(input.readLine());
                        dataMatras.add(new Matras(namapenyewa, nomorlapangan, jenislapangan, harga));   
                    }
                    
                    break;
                case 2:
                    System.out.println("1. Sintetis");
                    System.out.println("2. Matras");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        for (int i = 0; i < dataSintetis.size(); i++) {
                            System.out.println("Nomor Lapangan ke - " + (i + 1));
                            dataSintetis.get(i).display();
                        }
                    }
                    
                    if (pilihan == 2) {
                        for (int i = 0; i < dataMatras.size(); i++) {
                            System.out.println("Nomor Lapangan ke - " + (i + 1));
                            dataMatras.get(i).display();
                        }
                    }
                   
                    break;
                case 3:
                    System.out.println("1. Sintetis");
                    System.out.println("2. Matras");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan Nomor Lapangan : ");
                        String jelap = input.readLine();
                        for (Sewa i : dataSintetis) {
                            if (i.getJenislapangan().equals(jelap)) {
                                System.out.println("Masukan Nama Penyewa: ");
                                i.setNamapenyewa(input.readLine());
                                System.out.println("Masukan Nomor Lapangan: ");
                                i.setNomorlapangan(input.readLine());
                                System.out.println("Masukan Jenis Lapangan: ");
                                i.setJenislapangan(input.readLine());
                                System.out.println("Masukan Harga: ");
                                i.setHarga(input.readLine());
                            }
                        }
                    }
                    if (pilihan == 2) {
                        System.out.println("Masukan Nomor Lapangan : ");
                        String jelap = input.readLine();
                        for (Sewa i : dataMatras) {
                            if (i.getJenislapangan().equals(jelap)) {
                                System.out.println("Masukan Nama Penyewa: ");
                                i.setNamapenyewa(input.readLine());
                                System.out.println("Masukan Nomor Lapangan: ");
                                i.setNomorlapangan(input.readLine());
                                System.out.println("Masukan Jenis Lapangan: ");
                                i.setJenislapangan(input.readLine());
                                System.out.println("Masukan Harga: ");
                                i.setHarga(input.readLine());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("1. Sintetis");
                    System.out.println("2. Matras");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan Jenis Lapangan : ");
                        String jelap = input.readLine();
                        for (int i = 0; i < dataSintetis.size(); i++) {
                            if (dataSintetis.get(i).getJenislapangan().equals(jelap)) {
                                dataSintetis.remove(i);
                            }
                        }
                    }
                    
                    if (pilihan == 2) {
                        System.out.println("Masukan Jenis Lapangan : ");
                        String jelap = input.readLine();
                        for (int i = 0; i < dataMatras.size(); i++) {
                            if (dataMatras.get(i).getJenislapangan().equals(jelap)) {
                                dataMatras.remove(i);
                            }
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}
