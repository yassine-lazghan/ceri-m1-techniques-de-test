import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class IPokedexFactoryTest {
    private IPokedexFactory pokedexFactory;

    @BeforeEach
    public void setUp() {
        pokedexFactory = Mockito.mock(IPokedexFactory.class);
    }

    @Test
    public void testCreatePokedex() {
        IPokedex pokedex = pokedexFactory.createPokedex(null, null);
        assertNotNull(pokedex);

    }
}
