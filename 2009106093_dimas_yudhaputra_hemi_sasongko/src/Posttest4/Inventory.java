package Posttest4;

import Posttest2.*;

class Inventory { 
    private String rarityItem;
    private String levelItem;
    private int amountItem;
    int size;
    
    public Inventory(String rarityItem, String levelItem, int amountItem) {
        this.rarityItem = rarityItem;
        this.levelItem = levelItem;
        this.amountItem = amountItem;
    }


    public String getRarityItem() {
        return rarityItem;
    }
    public String getlevelItem() {
        return levelItem;
    }
    public int getamountItem() {
        return amountItem;
    }
    
    
    public void setrarityItem(String rarityItem) {
        this.rarityItem = rarityItem;
    }
    public void setlevelItem(String levelItem) {
        this.levelItem = levelItem;
    }
    public void setamountItem(int amountItem) {
        this.amountItem = amountItem;
    }

    
void itempick() {
    System.out.println("Item Is Add to Inventory!!");
}
void itemcha() {
    System.out.println("Item has Change!!");
}
void itemdel() {
    System.out.println("Item Trow Out of Inventory!!");
}


}