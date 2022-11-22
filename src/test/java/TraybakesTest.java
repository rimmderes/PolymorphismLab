import cakes.Traybakes;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraybakesTest {

    private Traybakes traybakes;

    @BeforeEach
    public void setUp() {
        traybakes = new Traybakes("Cookies a la Rimm", "Red Velvet", true, "Yes");
    }


}
