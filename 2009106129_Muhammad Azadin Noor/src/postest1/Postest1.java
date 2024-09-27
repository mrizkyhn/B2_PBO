import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Postest2 {
    //mengdeklarasikan variabael Global
    static String fileName;
    static String FileWriter;
    static ArrayList<String> Ecraft;
    static boolean isEditing = false;
    static Scanner input;
    private static Object e;
    
    public static void main(String[] args){
        String filePath = System.console() == null ? "/src/Ecraft.txt" : "/Ecraft.txt";
        fileName = System.getProperty("user.dir") + filePath;
        
        while (true) {
            showMenu();
            
        }
        
    }
    
    static void clearScreen(){
       try{
           final String os = System.getProperty("os.name");
           if (os.contains("windowa")){
               new ProcessBuilder("cmd","/c", "cls")
                       .inheritIO()
                       .start()
                       .waitFor();
                     
           } else {
               Runtime.getRuntime().exec("Clear");
               System.out.print("\033[H\033[2j");
               System.out.flush();
               
           }
           
       } catch (final IOException | InterruptedException e){
           System.out.println("Eror Karena:" + e.getMessage());
           
       }
    }
    
    static void showMenu() {
       System.out.println("=== Ecraft ===");
       System.out.println("[1] Menu utama");
       System.out.println("[2] Crud");
       System.out.println("[3] Exit");
       System.out.println("================");
       System.out.print("pilih menu:");
       
       String selectedMenu = input.nextLine();
       
       if (selectedMenu.equals("1")){
           System.out.println("===== Menu Utama =====");
           System.out.println("[1] Tas");
           System.out.println("[2] Accesoris");
           System.out.println("[3] Baju");
           System.out.println("[4] Back");
           System.out.println("==================");
           System.out.print("pilih menu:");
           
           String selectedMenutama = input.nextLine();
           
           if (selectedMenutama.equals("1"))
               System.out.print("Buy/not:");
           switch (selectedMenutama) {
              case "Buy":
                   System.out.print(" Terima Kasih Telah Bertransaksi");
                   break;
               case "not":
                   System.out.print("Back Menu");
                   backMenu();
                   break;
             
           }
            if (selectedMenutama.equals("2"))
               System.out.print("Buy/not:");
            switch (selectedMenutama){
               case "Buy":
                     System.out.print("Terima Kasih Telah Bertransaksi");
                     break;
               case "not":
                   System.out.print("Back Menu");
                   backMenu();
                   break;
                   
            }
             if (selectedMenu.equals("3"))
                 System.out.print("Buy/not:");
             switch (selectedMenutama){
                 case "Buy":
                     System.out.print("Terima Kasih Telah Bertransaksi");
                     break;
                 case "not":
                     System.out.print("Back Menu");
                     backMenu();
                     break;
                     
             }
              if (selectedMenu.equals("4"))
                  System.out.print ("Silahkan kembali ke menu sebelumnya");
                  
        
        } else if (selectedMenu.equals("2"))
            System.out.println("===== Crud =====");
            System.out.println("[1] Lihat Menu");
            System.out.println("[2] Tambah Menu");
            System.out.println("[3] Edit Menu");
            System.out.println("[4] Hapus Menu");
            System.out.println("[0] Keluar");
            System.out.println("==================");
            System.out.print("Pilih Menu:");
            
            String selectedCrud = input.nextLine();
            
        switch (selectedCrud) {
            case "1":
                showMenu();
                break;
            case "2":
                addEcraft();
                break;
            case "3":
                editEcraft();
                break;
            case "4":
                deleteEcraft();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Kamu salah Pilih Menu");
                backMenu();
                break;
        }
    }
            

    static void backMenu(){
        System.out.println("");
        System.out.print("Tekna enter untuk kembali...");
        input.nextLine();
        clearScreen(); 
    }
       
    
    
    static void showEcraft(){
        clearScreen();
        readEcraft();
        if (Ecraft.size() > 0) {
            System.out.println("Ecraft");
            int index = 0;
            Iterable<String> Ecraft = null;
            for (String data : Ecraft){
                System.out.println(String.format("[%d] %s", index, data));
                index++;
                
            }
            
        } else {
            System.out.println("Tidak ada data");
        }
        if (!isEditing){
            backMenu();
        }
    
    
  }
    
    static void readEcraft(){
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            
            Ecraft.clear();
            while (fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                Ecraft.add(data);
                
            }
        } catch (FileNotFoundException e){
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    static void addEcraft(String filename){
        clearScreen();
        
        System.out.println("Data yang di tambahkan");
        System.out.print("Input:");
        String newEcraft = input.nextLine();
        
        try{
            try (FileWriter fileWriter = new FileWriter(filename, true)) {
                fileWriter.append(String.format("%s%n", newEcraft));
            }
            System.out.println("Berhasil ditambahkan");
            
            
        } catch (IOException e){
            System.out.println("Terjadi Kesalahan");
        }
        backMenu();
    }
    
    static void editEcraft(){
        isEditing = true;
        showEcraft();
        
        try {
            System.out.println("===============");
            System.out.print("Pilih Indeks :");
            int index = Integer.parseInt(input.nextLine());
            
            if (index > Ecraft.size()){
                throw new IndexOutOfBoundsException("Anda Memasukan data yang salah!");
                
            } else{
                
                System.out.print("Data baru:");
                String newData = input.nextLine();
                
                Ecraft.set(index, newData);
                
                System.out.println(Ecraft.toString());
                
                try{
                    try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                        Iterable<String> Ecraft = null;
                        for (String data : Ecraft){
                            fileWriter.append(String.format("%s%n", data));
                            
                        }
                    }
                    
                    System.out.println("Berhasil diubah!");
                    
                } catch (IOException e){
                    System.out.println("Terjadi Kesalahan");
                }
                        
            }
        } catch (Exception e) {
        System.out.println(e.getMessage());
    
     isEditing = false;
    backMenu();
        }
    }
            
        
        
        
  


    
    
    static void deleteEcraft(){
        isEditing = true;
        showEcraft();
        
        System.out.println("=================");
        System.out.print("Pilih Indeks :");
        int index = Integer.parseInt(input.nextLine());
        
        try{
            if (index > Ecraft.size()){
                try {
                    throw new IndexOutOfBoundException("Data Anda Salah");
                } catch (IndexOutOfBoundException ex) {
                    Logger.getLogger(Postest2.class.getName()).log(Level.SEVERE, null, ex);
                } 
                        
                                
                        }else {
                    System.out.println("Kamu akan Menghapus:");
                   
                    System.out.println("Apa anda Yakin?");
                    System.out.print("jawab(y/t)");
                    String jawab = input.nextLine();
                    
                    if (jawab.equalsIgnoreCase("y")){
                           Ecraft.remove(index);
                           
                           fileWriter fileWriter = new fileWriter(fileName, false);
                           Iterable<String> Ecraft = null;
                           for (String data : Ecraft){
                               fileWriter.append(String.format("%s%n",data));
                               
                           }
                           System.out.println("Berhasil dihapus!"); 
                    }
                    
                    }
                    
                    
        } catch (Exception e){
                System.out.println(e.getMessage());
                
                }
           isEditing = false;
           backMenu();
    }

    private static void addEcraft() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class isEditing {

        public isEditing() {
        }
    }

    
    

  
    
 }

   

