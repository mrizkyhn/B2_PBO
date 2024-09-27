package Posttest3;
import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<sewa> datasewa = new ArrayList<>();
    
        while (true) {
        System.out.println("||**** MENU ****||");
        System.out.println("||1.Mengisi data      ****||");
        System.out.println("||2.Melihat data      ****||");
        System.out.println("||3.Merubah data      ****||");
        System.out.println("||4.Menghapus data    ****||");
        System.out.println("||5.Exit              ****||");
        System.out.println("||**********||");
        System.out.println("Pilih Menu :                   ");
            int menu = Integer.parseInt(input.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("|****Mengisi Data****|");
                    System.out.print("| Nama Penyewa    : ");
                    String namapenyewa  = input.readLine();
                    System.out.print("| Nomor lapangan  : ");
                    String nomorlapangan  = input.readLine();
                    System.out.print("| Jenis lapangan  : ");
                    String jenislapangan = input.readLine();
                    System.out.print("| Harga           : ");
                    int harga = Integer.parseInt(input.readLine());
                  
                    
                    sewa dataBaru = new sewa(namapenyewa, nomorlapangan, jenislapangan, harga);
                    datasewa.add(dataBaru);
                    break;
                    
                case 2:
                    System.out.println("|****Melihat Data****|");
                    for (int i = 0; i < datasewa.size(); i += 1) {
                        System.out.println("| Data ke-" + (i + 1));
                        datasewa.get(i).display();
                    }
                    break;
                case 3:
                    System.out.println("|****Merubah Data****|");
                    System.out.print("| Masukkan Nomor lapangan : ");
                    String nomor = input.readLine();
                    for (sewa sewa : datasewa) {
                        if (sewa.getnamapenyewa().equals(nomor)) {
                            System.out.print("| Nama penyewa    : ");
                            sewa.setnamapenyewa(input.readLine());
                            System.out.print("| Nomor lapangan  : ");
                            sewa.setnomorlapangan(input.readLine());
                            System.out.print("| Jenis Lapangan  : ");
                            sewa.setjenislapangan   (input.readLine());
                            System.out.print("| Harga           : ");
                            sewa.setharga (Integer.parseInt(input.readLine()));
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("|****Menghapus Data****|");
                    System.out.print("| Masukan Nomor Lapangan  : ");
                    String namasewa = input.readLine();
                    for (int i = 0; i < datasewa.size(); i++) {
                        if (datasewa.get(i).getnomorlapangan().equals(namasewa)) {
                            datasewa.remove(i);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("|****Menghapus Data****|");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
    
}
