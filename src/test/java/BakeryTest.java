import bakery.Bakery;
import cakes.Cakes;
import cakes.Cupcakes;
import cakes.Traybakes;
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
        Cakes cupcake1 = new Cupcakes("Victoria's Secret", "Vanilla", true,"Yes", "Strawberry Jam");
        Cakes cupcake2 = new Cupcakes("Red Velvet", "Red Velvet", false,"No", "Milk Chocolate");
        Cakes traybakes1 = new Traybakes("Dark squares", "chocolate", true, "No");
        bakery.addCakes(cupcake1);
        bakery.addCakes(cupcake2);
        bakery.addCakes(traybakes1);
        int expected = 3;
        int actual = bakery.countCakes();
        assertEquals(expected, actual);
    }



}
