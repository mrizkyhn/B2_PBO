package Posttest2;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Character {
    static ArrayList<Inventory> inventory = new ArrayList<Inventory>();

        String nama_item;
        String rarity_item;
        int amount_item;
        String level_item;

    public static void main(String[] args) throws IOException {
        while (true){
        menu();
            } 
}    
    private static void menu() throws IOException{
        InputStreamReader menu = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(menu);
        System.out.println("");
        System.out.println("                   =----------=                     ");
        System.out.println("=====================  MENU  =======================");
        System.out.println("====================================================");
        System.out.println("[1 > Pick Up Item");
        System.out.println("[2 > Open Inventory"); 
        System.out.println("[3 > Change Item");
        System.out.println("[4 > Trow Out Item");
        System.out.println("[5 > EXIT");
        System.out.println("====================================================");
        System.out.println("Pick = ");
        int p = Integer.valueOf(input.readLine());
        System.out.println("");
        switch(p){
        case 1:
                additem();
                break;
        case 2:
                openivt();
                break;
        case 3:
                change();
                break;
        case 4:
                Trowaway();
                break;
        case 5:
                System.out.println("Inventory Menu Close");
                System.exit(0);
                break;
        default:
            System.out.println("!No Option In the menu!");
            menu(); 
        } 
    }

public static void additem() throws IOException{

        System.out.println("======Pick Up Item!!--------------------------------");
        System.out.println("====================================================");
        InputStreamReader pick = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(pick);
        
        String nama_item;
        String rarity_item;
        int amount_item;
        String level_item;
        System.out.println("--------------------");
        System.out.println("Item_Name = ");
        nama_item = input.readLine();
        System.out.println("Item_Rarity = ");
        rarity_item = input.readLine();
        System.out.println("Item_Amount = ");
        amount_item = Integer.parseInt(input.readLine());
        System.out.println("Item_Level = ");
        level_item = input.readLine();
        System.out.println("--------------------");

        Inventory itempick = new Inventory(nama_item, rarity_item, amount_item, level_item);
        itempick.nama_item = nama_item;
        itempick.rarity_item = rarity_item;
        itempick.amount_item = amount_item;
        itempick.level_item = level_item;
        inventory.add(itempick);
        itempick.itempick();
}

public static void openivt() throws IOException{
        System.out.println("===Inventory Open-----------------------------------");
        System.out.println("====================================================");
        for(int i = 0; i < inventory.size(); i++){
        System.out.println("Slot" + (i + 1));
        System.out.println("--------------------");
        System.out.println("[Item = " + inventory.get(i).nama_item);
        System.out.println("[Rarity = " + inventory.get(i).rarity_item);
        System.out.println("[Amount = " + inventory.get(i).amount_item);
        System.out.println("[Level = " + inventory.get(i).level_item);
        System.out.println("--------------------");
        
    }
}

public static void change()throws IOException{
        System.out.println("===Change Item--------------------------------------");
        InputStreamReader change = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(change);
        openivt();
        String nama_item;
        String rarity_item;
        int amount_item;
        String level_item;
        int u;
        System.out.println("Item Slot = ");
        u = Integer.parseInt(input.readLine());
        u--;
        System.out.println("Item_Name");
        nama_item = input.readLine();
        System.out.println("Item_Rarity");
        rarity_item = input.readLine();
        System.out.println("Item_Amount");
        amount_item = Integer.parseInt(input.readLine());
        System.out.println("Item_Level");
        level_item = input.readLine();
        System.out.println("--------------------");
        inventory.get(u).itemcha();

        inventory.get(u).nama_item = nama_item;
        inventory.get(u).rarity_item = rarity_item;
        inventory.get(u).amount_item = amount_item;
        inventory.get(u).level_item = level_item;

}

public static void Trowaway()throws IOException{
        System.out.println("===Trow Out Item------------------------------------");
        openivt();
        InputStreamReader Delt = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Delt);
            System.out.println("Trow Out Item Slot = ");
        int d;
       d = Integer.parseInt(input.readLine());
        d--;
        System.out.println("--------------------");
        inventory.get(d).itemdel();
        inventory.remove(d);
    }
}





