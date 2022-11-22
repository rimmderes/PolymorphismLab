import cakes.Traybake;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraybakeTest {

    private Traybake traybakes;

    @BeforeEach
    public void setUp() {
        traybakes = new Traybake("Cookies a la Rimm", "Red Velvet", true, "Yes");
    }


}
