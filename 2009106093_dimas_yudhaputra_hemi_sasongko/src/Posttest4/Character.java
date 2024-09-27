package Posttest4;

public class Character extends Inventory {
    private String NamaItemcha;
    public Character(String NamaItemcha, String rarityItem, String levelItem, int amountItem) {
        super(rarityItem, levelItem, amountItem);
        this.NamaItemcha = NamaItemcha;
    }

        public String getNamaItemcha() {
        return NamaItemcha;
        }
        public void setNamaItemcha(String NamaItemcha) {
        this.NamaItemcha = NamaItemcha;
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