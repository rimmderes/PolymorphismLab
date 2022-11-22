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

//    @Test
//    public void canAddTopping() {
//    ArrayList addTopping = cupcakes.getToppings();
//        assertThat(addTopping).isEqualTo("Fairy Dust");
//    }

    @Test
    public void hasCasing() {
        String expected = "This has casing!";
        String actual = cupcakes.hasCasing();
        assertEquals(expected, actual);
    }

    // overload testing
    @Test
    public void customerChoosesBakeryImage() {
        String expected = "Choose bakery cupcake design .";
        String actual = cupcakes.order("");
        assertThat(expected).isEqualTo(actual);
    }

    public void customerHasOwnDesign() {
        String expected = "inserted customer image Mum's face and your waiver number is 289834223.";
        String actual = cupcakes.order("Mum's face", 289834223);
        assertThat(expected).isEqualTo(actual);
    }


    // abstract method test
    @Test
    public void protectGoods() {
        String expected = "Victoria's Secret has to be kept in the box provided";
        String actual = cupcakes.protectingBakedGoods();
        assertThat(expected).isEqualTo(actual);
    }



}
