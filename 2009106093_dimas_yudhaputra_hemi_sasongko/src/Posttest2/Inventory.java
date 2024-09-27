package Posttest2;

class Inventory {
    String nama_item,rarity_item, level_item;
    int amount_item;

public Inventory(String nama_item, String rarity_item, int amount_item,String level_item) {
this.nama_item = nama_item;
this.rarity_item = rarity_item;
this.amount_item = amount_item;
this.level_item = level_item;
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
