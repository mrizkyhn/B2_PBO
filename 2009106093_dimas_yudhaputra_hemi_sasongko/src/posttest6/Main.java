package posttest6;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public final class Main {
    static ArrayList<Inventory> inventory = new ArrayList<Inventory>();
    static ArrayList<Character> character = new ArrayList<Character>();
    static ArrayList<Chest> chest = new ArrayList<Chest>();
        
        static String NamaItemcha;
        static String NamaItemche;
        static String rarityItem;
        static String levelItem;
        static int amountItem;
        
    public final static void main(String[] args) throws IOException {
        while (true){
        menu();
            } 
    }   
    
    private final static void menu() throws IOException{
        InputStreamReader menu = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(menu);
        System.out.println("");
        System.out.println("                   =----------=                     ");
        System.out.println("=====================  MENU ========================");
        System.out.println("====================================================");
        System.out.println("[1 > Character");
        System.out.println("[2 > Chest"); 
        System.out.println("[3 > EXIT");
        System.out.println("====================================================");
        System.out.println("Pick = ");
        int p = Integer.valueOf(input.readLine());
        System.out.println("");
        switch(p){
        case 1:
                menucha();
                
                break;
        case 2:
                menuche();
                break;
        case 3:
                System.out.println("Menu Close");
                System.exit(0);
                break;
        default:
            System.out.println("!No Option In the menu!");
            menu(); 
        }
    }
    
    public final static void menucha() throws IOException{
        InputStreamReader menu = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(menu);
        System.out.println("");
        System.out.println("                   =----------=                     ");
        System.out.println("==================== Character =====================");
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
                additem1();
                menucha();
        case 2:
                openivt1();
                menucha();
        case 3:
                change1();
                menucha();
        case 4:
                Trowaway1();
                menucha();
        case 5:
                menu();
                break;
        default:
            System.out.println("!No Option In the menu!");
            menucha(); 
        } 
    }
    
public static void menuche() throws IOException{
        InputStreamReader menu = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(menu);
        System.out.println("");
        System.out.println("                   =----------=                     ");
        System.out.println("=====================  CHEST  ======================");
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
                additem2();
                menuche();
        case 2:
                openivt2();
                menuche();
        case 3:
                change2();
                menuche();
        case 4:
                Trowaway2();
                menuche();
        case 5:
                menu();
                break;
        default:
            System.out.println("!No Option In the menu!");
            menuche(); 
        } 
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void additem1() throws IOException{
        System.out.println("======Pick Up Item!!--------------------------------");
        System.out.println("====================================================");
        InputStreamReader pick = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(pick);

        System.out.println("Item_Name = ");
        String NamaItemcha = input.readLine();
        System.out.println("Item_Rarity = ");
        String rarityItem = input.readLine();
        System.out.println("Item_Amount = ");
        int amountItem = Integer.parseInt(input.readLine());
        System.out.println("Item_Level = ");
        String levelItem = input.readLine();
        System.out.println("--------------------");
        
        Character itempick = new Character (NamaItemcha, rarityItem, levelItem, amountItem) {
            @Override
            public void end(){}
        };

        character.add(itempick);
        itempick.limit(amountItem);
        itempick.itempick();
}
public static void additem2() throws IOException{
        System.out.println("======Add Item!!------------------------------------");
        System.out.println("====================================================");
        InputStreamReader pick = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(pick);

        System.out.println("Item_Name = ");
        String NamaItemche = input.readLine();
        System.out.println("Item_Rarity = ");
        String rarityItem = input.readLine();
        System.out.println("Item_Amount = ");
        int amountItem = Integer.parseInt(input.readLine());
        System.out.println("Item_Level = ");
        String levelItem = input.readLine();
        System.out.println("--------------------");
        
        Chest itempick;
        itempick = new Chest(NamaItemche, rarityItem, levelItem, amountItem) {
            @Override
            public void end() {}
        };
        chest.add(itempick);
        itempick.limit(amountItem);
        itempick.itempick();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void openivt1() throws IOException{
    character.get(0).open();
        System.out.println("===Character Inventory------------------------------");
        System.out.println("====================================================");
        for(int i = 0; i < character.size(); i++){
        System.out.println("Slot" + (i + 1));
        System.out.println("--------------------");
        System.out.println("[Item = " + character.get(i).getNamaItemcha());
        System.out.println("[Rarity = " + character.get(i).getRarityItem());
        System.out.println("[Amount = " + character.get(i).getamountItem());
        System.out.println("[Level = " + character.get(i).getlevelItem());
        System.out.println("--------------------");
    }
    character.get(0).close();
}
public static void openivt2() throws IOException{
    character.get(0).open();
        System.out.println("=== Chest Inventory --------------------------------");
        System.out.println("====================================================");
        for(int i = 0; i < chest.size(); i++){
        System.out.println("Slot" + (i + 1));
        System.out.println("--------------------");
        System.out.println("[Item = " + chest.get(i).getNamaItemche());
        System.out.println("[Rarity = " + chest.get(i).getRarityItem());
        System.out.println("[Amount = " + chest.get(i).getamountItem());
        System.out.println("[Level = " + chest.get(i).getlevelItem());
        System.out.println("--------------------");
    }
    character.get(0).close();
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void change1()throws IOException{
        System.out.println("===Change Item--------------------------------------");
        InputStreamReader change = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(change);
        openivt1();
        
        int amo;
        int u;
        System.out.println("Pick Slot itme To Change = ");
        System.out.println("Item Slot = ");
        u = Integer.parseInt(input.readLine());
        u--;
        System.out.println("Item_Name");
        character.get(u).setNamaItemcha(input.readLine());
        System.out.println("Item_Rarity");
        character.get(u).setrarityItem(input.readLine());
        System.out.println("Item_Amount");
        amo = Integer.parseInt(input.readLine());
        character.get(u).setamountItem(amo);
        System.out.println("Item_Level");
        character.get(u).setlevelItem(input.readLine());
        System.out.println("--------------------");
        character.get(u).itemcha();  
}

public static void change2()throws IOException{
        System.out.println("===Change Item--------------------------------------");
        InputStreamReader change = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(change);
        openivt2();
        
        int amo;
        int u;
        System.out.println("Pick Slot itme To Change = ");
        System.out.println("Item Slot = ");
        u = Integer.parseInt(input.readLine());
        u--;
        System.out.println("Item_Name");
        chest.get(u).setNamaItemche(input.readLine());
        System.out.println("Item_Rarity");
        chest.get(u).setrarityItem(input.readLine());
        System.out.println("Item_Amount");
        amo = Integer.parseInt(input.readLine());
        chest.get(u).setamountItem(amo);
        System.out.println("Item_Level");
        chest.get(u).setlevelItem(input.readLine());
        System.out.println("--------------------");
        chest.get(u).itemcha();      
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void Trowaway1()throws IOException{
        System.out.println("===Trow Out Item------------------------------------");
        openivt1();
        InputStreamReader Delt = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Delt);
            System.out.println("Trow Out Item Slot = ");
        int d;
       d = Integer.parseInt(input.readLine());
        d--;
        System.out.println("--------------------");
        character.get(d).itemdel();
        character.remove(d);
    }
public static void Trowaway2()throws IOException{
        System.out.println("===Trow Out Item------------------------------------");
        openivt2();
        InputStreamReader Delt = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Delt);
            System.out.println("Trow Out Item Slot = ");
        int d;
       d = Integer.parseInt(input.readLine());
        d--;
        System.out.println("--------------------");
        chest.get(d).itemdel();
        chest.remove(d);
    }

}



