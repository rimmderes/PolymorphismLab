package bakingEquipment;

import interfaces.ISell;

public class BakingKit implements ISell {

    private String name;

    public BakingKit(String name) {
        this.name = name;
    }

    public String scanBarcode(int price) {
        return this.name + "costs £" + price;
    }



}
