package posttest6;

public abstract class Character extends Inventory {
    private String NamaItemcha;
    public Character(String NamaItemcha, String rarityItem, String levelItem, int amountItem) {
        super(rarityItem, levelItem, amountItem);
        this.NamaItemcha = NamaItemcha;
    }

        public final String getNamaItemcha() {
        return NamaItemcha;
        }
        public final void setNamaItemcha(String NamaItemcha) {
        this.NamaItemcha = NamaItemcha;
        }
    void limit(int amountItem) {
        System.out.println("--------------------");
        System.out.println("item amount is " + this.amountItem);
        System.out.println("Item amount limit is " + this.size);
        if (this.amountItem >= size) {
            System.out.println("Warning Item amount is over 100");
        } else {
            System.out.println("Item amount under 100");
        }
    }
@Override
public final void itempick() {
System.out.println("Item Is Add to Character Inventory!!");
}
@Override
public final void itemcha() {
    System.out.println("Item has Change!!");
}
@Override
public final void itemdel() {
    System.out.println("Item Trow Out of Character Inventory!!");
}



}