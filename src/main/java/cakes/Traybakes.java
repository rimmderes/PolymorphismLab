package cakes;

import cakes.Cakes;

import java.util.ArrayList;

public class Traybakes extends Cakes {

    private ArrayList<String> types;

    public Traybakes(String name, String baseFlavour, boolean healthier, String eggbased) {
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





}
