package Posttest1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> inventory = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
inventory.add("gun");
menu();
}    
    static void menu(){
        System.out.println("");
        System.out.println("========Inventory========");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Put_in_Item");
        System.out.println("2. Open_Inventory"); 
        System.out.println("3. Change_Item");
        System.out.println("4. Trow_Out_Item");
        System.out.println("5. EXIT");
        System.out.println("----------------------------------------------------");
        System.out.println("Pick[1-5] = ");
        int p = input.nextInt();
        switch (p){
        case 1:
                pickitem();
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
                System.out.println("Inventory Close");
                break;
        default:
            menu(); 
        } 
    }

static void pickitem(){
            System.out.println("Item_Name = ");
            String pick = input.next();
            inventory.add(pick);
            backmenu();
        }

static void openivt(){
            for(int i = 0 ; i < inventory.size();i++){
            System.out.println("inventory["+ i +"] : "+ inventory.get(i));
            }
            backmenu();
}

static void change(){
            for(int i = 0 ; i < inventory.size();i++){
            System.out.println("inventory["+ i +"] : "+ inventory.get(i));}
            System.out.println("input Slot index = ");
            int a = input.nextInt();
            System.out.println("Change to = ");
            String iv = input.next();
            inventory.set(a, iv);
            backmenu();
}

static void Trowaway(){
            System.out.println("input Slot index = ");
            int t = input.nextInt();
            inventory.remove(t);
            backmenu();
}

static void backmenu(){
            System.out.println("input Y & Enter to Continue");
            input.next();
            menu();
}



} 