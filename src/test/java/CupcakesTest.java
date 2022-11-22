import cakes.Cupcakes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


public class CupcakesTest {

    private Cupcakes cupcakes;

    @BeforeEach
    public void setUp() {
        cupcakes = new Cupcakes("Victoria's Secret", "Victoria Sponge", true, "Yes", "Strawberry Jam");
            cupcakes.addTopping("Fairy Dust");
    }

    @Test
    public void canAddTopping() {
    ArrayList addTopping = cupcakes.getToppings();
        assertThat(addTopping).isEqualTo("Fairy Dust");
    }

    @Test
    public void hasCasing() {
        String expected = "This has casing!";
        String actual = cupcakes.hasCasing();
        assertEquals(expected, actual);
    }




}
