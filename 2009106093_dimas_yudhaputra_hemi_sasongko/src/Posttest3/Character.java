package Posttest3;
import Posttest2.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Character {
    static ArrayList<Inventory> inventory = new ArrayList<Inventory>();

        String NamaItem;
        String rarityItem;
        String levelItem;
        int amountItem;


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
        
        String NamaItem;
        String rarityItem;
        String levelItem;
        int amountItem;
        
        System.out.println("Item_Name = ");
        NamaItem = input.readLine();
        System.out.println("Item_Rarity = ");
        rarityItem = input.readLine();
        System.out.println("Item_Amount = ");
        amountItem = Integer.parseInt(input.readLine());
        System.out.println("Item_Level = ");
        levelItem = input.readLine();
        System.out.println("--------------------");

        Inventory itempick = new Inventory(NamaItem, rarityItem, levelItem, amountItem);
        /*itempick.setNamaItem(nama_item);
        itempick.setRarityItem(rarity_item);
        itempick.amount_item = amount_item;
        itempick.level_item = level_item;*/
        inventory.add(itempick);
        itempick.itempick();
}

public static void openivt() throws IOException{
        System.out.println("===Inventory Open-----------------------------------");
        System.out.println("====================================================");
        for(int i = 0; i < inventory.size(); i++){
        System.out.println("Slot" + (i + 1));
        System.out.println("--------------------");
        System.out.println("[Item = " + inventory.get(i).getNamaItem());
        System.out.println("[Rarity = " + inventory.get(i).getRarityItem());
        System.out.println("[Amount = " + inventory.get(i).getamountItem());
        System.out.println("[Level = " + inventory.get(i).getlevelItem());
        System.out.println("--------------------");
        
    }
}

public static void change()throws IOException{
        System.out.println("===Change Item--------------------------------------");
        InputStreamReader change = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(change);
        openivt();
        
        int amo;
        int u;
        System.out.println("Item Slot = ");
        u = Integer.parseInt(input.readLine());
        u--;
        System.out.println("Item_Name");
        inventory.get(u).setNamaItem(input.readLine());
        System.out.println("Item_Rarity");
        inventory.get(u).setrarityItem(input.readLine());
        System.out.println("Item_Amount");
        amo = Integer.parseInt(input.readLine());
        inventory.get(u).setamountItem(amo);
        System.out.println("Item_Level");
        inventory.get(u).setlevelItem(input.readLine());
        System.out.println("--------------------");
        inventory.get(u).itemcha();

        /*inventory.get(u).setNamaItem(namaItem);
        inventory.get(u).setRarityItem(rarityItem);
        inventory.get(u).setAmount_item(amount_item);
        inventory.get(u).setLevel_item(level_item);*/

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





