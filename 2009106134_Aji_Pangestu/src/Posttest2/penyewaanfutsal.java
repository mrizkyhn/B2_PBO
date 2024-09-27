package Posttest2;
import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class penyewaanfutsal {
    static ArrayList<Data> data = new ArrayList<Data>(); 
    public static void main(String[] args) throws IOException {
        
        System.out.println("Nama    : Aji Pangestu");
        System.out.println("Nim     : 2009106134\n"); 
        
        data.add(new Data());
        data.get(0).nomorlapangan = "-1";
        data.get(0).jenislapangan = "Matras";
        data.get(0).harga = 80000;
        data.add(new Data());
        data.get(1).nomorlapangan = "-2";
        data.get(1).jenislapangan = "sintetis";
        data.get(1).harga = 100000;

        while (true) {
            menu();
             }
    }
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("||**** MENU ****||");
        System.out.println("||1.Mengisi data      ****||");
        System.out.println("||2.Melihat data      ****||");
        System.out.println("||3.Merubah data      ****||");
        System.out.println("||4.Menghapus data    ****||");
        System.out.println("||5.Exit              ****||");
        System.out.println("||**********||");
        String inputan_m;
        System.out.print("Masukan Menu :");
        inputan_m = br.readLine();
        if(inputan_m.equals("1")){
            createData();
        } else if (inputan_m.equals("2")){
            readData();
        } else if (inputan_m.equals("3")){
            updateData();
        } else if (inputan_m.equals("4")){
            deleteData();
        } else if (inputan_m.equals("5")){
            System.exit(0);
        } else {
            System.out.println("SALAH MEMILIH MENU");
        }    
    }
    public static void readData()throws IOException{
        for (int i = 0; i < data.size(); i++){
            System.out.println("data ke-" + (i + 1));
            System.out.println("nomorlapangan : " + data.get(i).nomorlapangan);
            System.out.println("jenislapangan: " + data.get(i).jenislapangan);
            System.out.println("harga : " + data.get(i).harga);
        }
        System.out.println(" ");
    }
    public static void createData()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1;
        String input2;
        int input3;
        
        System.out.print("Masukan nomor lapangan : ");
        input1 = br.readLine();
        System.out.print("Masukan jenis lapangan : ");
        input2 = (br.readLine());
        System.out.print("Masukan harga : ");
        input3 = Integer.parseInt (br.readLine());
        
        Data buatdata = new Data();
        buatdata.nomorlapangan = input1;
        buatdata.jenislapangan = input2;
        buatdata.harga = input3;
        data.add(buatdata);
    }
    public static void updateData()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputind;
        String input1;
        String input2;
        int input3;
        
        readData();
        
        System.out.print("Masukan data ke-");
        inputind = Integer.parseInt(br.readLine());
        int indexe = inputind-1;
        
        System.out.print("Masukan nomorlapangan : ");
        input1 = br.readLine();
        System.out.print("Masukan jenis lapangan : ");
        input2 = (br.readLine());
        System.out.print("Masukan harga : ");
        input3 = Integer.parseInt (br.readLine());
        
        data.get(indexe).nomorlapangan = input1;
        data.get(indexe).jenislapangan = input2;
        data.get(indexe).harga = input3;
    }
    public static void deleteData()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;
        
        readData();
        
        System.out.println("Data yang ingin di hapus");
        System.out.print("Masukan Data ke-");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        
        data.remove(indexd);
    }

    private static class Data {

        private String nomorlapangan;
        private String jenislapangan;
        private int harga;

        public Data() {
        }
    }
    
    public class Data {

        public String nomorlapangan;
        public String jenislapangan;
        public int harga;

        public Data(String nomorlapangan, String jenislapangan, int harga) {
            this.nomorlapangan = nomorlapangan;
            this.jenislapangan = jenislapangan;
            this.harga = harga;
        }
    }
}
