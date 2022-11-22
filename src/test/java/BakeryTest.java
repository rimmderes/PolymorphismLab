import bakery.Bakery;
import cakes.Cake;
import cakes.Cupcake;
import cakes.Traybake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BakeryTest {

    private Bakery bakery;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery("Rimm's Cakes");
    }

    @Test
    public void canCountCakes(){
        int expected = 0;
        int actual = bakery.countCakes();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddCakes() {
        Cake cupcake1 = new Cupcake("Victoria's Secret", "Vanilla", true,"Yes", "Strawberry Jam");
        Cake cupcake2 = new Cupcake("Red Velvet", "Red Velvet", false,"No", "Milk Chocolate");
        Cake traybakes1 = new Traybake("Dark squares", "chocolate", true, "No");
        bakery.addCakes(cupcake1);
        bakery.addCakes(cupcake2);
        bakery.addCakes(traybakes1);
        int expected = 3;
        int actual = bakery.countCakes();
        assertEquals(expected, actual);
    }



}
