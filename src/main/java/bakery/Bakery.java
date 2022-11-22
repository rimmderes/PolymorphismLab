package bakery;

import cakes.Cakes;

import java.util.ArrayList;

public class Bakery {

    // 'God' class

    private String name;

    private ArrayList<Cakes> cakes;


    public Bakery(String name){
        this.name = name;
        this.cakes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cakes> getCakes() {
        return cakes;
    }

    public void setCakes(ArrayList<Cakes> cakes) {
        this.cakes = cakes;
    }





//    if (this.name.equals("I Hate Vegans bakery.Bakery") && cake.isEggBased == false) {
//        System.out.println("EVERYTHING MUST BE EGG BASED");
//    } else {
//        System.out.println(String.format("%s is egg based, adding to our cakes list", cake.getName()));
//        this.cakes.add(cake);
//    }




}
