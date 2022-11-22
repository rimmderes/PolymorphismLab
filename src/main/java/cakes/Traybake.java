package cakes;

import java.util.ArrayList;

public class Traybake extends Cake {

    private ArrayList<String> types;

    public Traybake(String name, String baseFlavour, boolean healthier, String eggbased) {
        super(name, baseFlavour, healthier, eggbased);
        this.types = new ArrayList<>();
    }
    public ArrayList<String> getTypes() {
        return types;
    }

    public void getTypes(ArrayList<String> types) {
        this.types = types;
    }

    public String isVeganFriendly() {

        if (eggsBased == "Yes") {
            return "This is not Vegan friendly";
        }
        return "This is Vegan friendly";
    }

    public String protectingBakedGoods() {
        return String.format("%s has to be placed in the fridge immediately", this.name);
    }




}
