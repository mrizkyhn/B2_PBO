package posttest6;

public abstract class  Inventory implements Openable{ 
    private String rarityItem;
    private String levelItem;
     int amountItem;
    final int size = 100; 
    final int size2 = 500;
    
    public Inventory(String rarityItem, String levelItem, int amountItem) {
        this.rarityItem = rarityItem;
        this.levelItem = levelItem;
        this.amountItem = amountItem;
    }

    public final String getRarityItem() {
        return rarityItem;
    }
    public final String getlevelItem() {
        return levelItem;
    }
    public final int getamountItem() {
        return amountItem;
    }
    
    
    public final void setrarityItem(String rarityItem) {
        this.rarityItem = rarityItem;
    }
    public final void setlevelItem(String levelItem) {
        this.levelItem = levelItem;
    }
    public final void setamountItem(int amountItem) {
        this.amountItem = amountItem;
    }
    
    void limit(int amountItem) {
        System.out.println("Item limit is " + this.size);
        if (this.amountItem >= size) {
            System.out.println("Warning Item amount is over 100");
        } else {
            System.out.println("Item fit");
        }
    }

public abstract void end();
void itempick() {
    System.out.println("Item Is Add to Inventory!!");
}
void itemcha() {
    System.out.println("Item has Change!!");
}
void itemdel() {
    System.out.println("Item Trow Out of Inventory!!");
}

@Override
public void open(){
    System.out.println("Inventory Open");
}

@Override
public void close(){
    System.out.println("Inventory Close");
}

}


