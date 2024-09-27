package Posttest4;

public class Chest extends Inventory {
    private String NamaItemche;
    public Chest(String NamaItemche, String rarityItem, String levelItem, int amountItem) {
        super(rarityItem, levelItem, amountItem);
        this.NamaItemche = NamaItemche;
    }
    
        public String getNamaItemche() {
        return NamaItemche;
        }
        public void setNamaItemche(String NamaItemche) {
        this.NamaItemche = NamaItemche;
        }

@Override
public void itempick() {
System.out.println("Item Is Add to Inventory!!");
}
@Override
public void itemcha() {
    System.out.println("Item has Change!!");
}
@Override
public void itemdel() {
    System.out.println("Item Trow Out of Inventory!!");
}
}