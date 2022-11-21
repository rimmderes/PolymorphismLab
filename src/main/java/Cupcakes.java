import java.util.ArrayList;

public class Cupcakes extends Cakes {

    private ArrayList<String> toppings;
    private String filling;

    public Cupcakes(String name, String baseFlavour, boolean healthier, boolean eggsbased, String toppings, String filling) {
        super(name, baseFlavour, healthier, eggsbased);
        this.toppings = new ArrayList<>();
        this.filling = filling;

    }



}
