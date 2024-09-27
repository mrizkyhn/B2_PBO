package Posttets5;

import Posttest4.*;

public abstract class Chest extends Inventory {
    private String NamaItemche;
    public Chest(String NamaItemche, String rarityItem, String levelItem, int amountItem) {
        super(rarityItem, levelItem, amountItem);
        this.NamaItemche = NamaItemche;
    }
    
        public final String getNamaItemche() {
        return NamaItemche;
        }
        public final void setNamaItemche(String NamaItemche) {
        this.NamaItemche = NamaItemche;
        }
    void limit(int amountItem) {
        System.out.println("--------------------");
        System.out.println("item amount is " + this.amountItem);
        System.out.println("Item amount limit is " + this.size2);
        if (this.amountItem >= size2) {
            System.out.println("Warning Item amount is over 500");
        } else {
            System.out.println("Item amount under 500");
        }
    }
@Override
public final void itempick() {
System.out.println("Item Is Add to Chest Inventory!!");
}
@Override
public final void itemcha() {
    System.out.println("Item has Change!!");
}
@Override
public final void itemdel() {
    System.out.println("Item Trow Out of Chest Inventory!!");
}
}