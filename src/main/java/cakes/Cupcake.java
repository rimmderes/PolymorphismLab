package cakes;

import java.util.ArrayList;

public class Cupcake extends Cake {

    private ArrayList<String> toppings;
    private String filling;

    public Cupcake(String name, String baseFlavour, boolean healthier, String eggsbased, String filling) {
        super(name, baseFlavour, healthier, eggsbased);
        this.toppings = new ArrayList<>();
        this.filling = filling;
    }



    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings (ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    //
    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public String hasCasing() {
        return "This has casing!";
    }


    public String order(String bakeryCupcakeDesignImage) {
        return String.format("Choose bakery cupcake design %s.", bakeryCupcakeDesignImage);
    }

    public String order(String customerCupcakeImage, int waiverNumber) {
        return String.format("inserted customer image %s and your waiver number is %s.", customerCupcakeImage, 289834223);
    }

    public String protectingBakedGoods() {
        return String.format("%s has to be kept in the box provided", this.name);
    }


}
