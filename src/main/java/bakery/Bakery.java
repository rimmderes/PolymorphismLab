package bakery;

import cakes.Cake;

import java.util.ArrayList;

public class Bakery {

    // 'God' class

    private String name;

    private ArrayList<Cake> stock;


    public Bakery(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cake> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Cake> cakes) {
        this.stock = cakes;
    }

    public int countCakes (){
        return this.stock.size();
    }

    public void addCakes(Cake cakes) {
        this.stock.add(cakes);
    }





//    if (this.name.equals("I Hate Vegans bakery.Bakery") && cakes.isEggBased == false) {
//        System.out.println("EVERYTHING MUST BE EGG BASED");
//    } else {
//        System.out.println(String.format("%s is egg based, adding to our cakes list", cakes.getName()));
//        this.cakes.add(cakes);
//    }




}
