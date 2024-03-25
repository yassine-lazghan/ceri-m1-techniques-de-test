import fr.univavignon.pokedex.api.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


public class IPokedexFactoryTest {
    private IPokedexFactory pokedexFactory;

    @BeforeEach
    public void setUp() {
        pokedexFactory = Mockito.mock(IPokedexFactory.class);
        IPokedex mockPokedex = Mockito.mock(IPokedex.class);


        Mockito.when(pokedexFactory.createPokedex(null, null)).thenReturn(mockPokedex);
    }

    @Test
    public void testCreatePokedex() {
        IPokedex pokedex = pokedexFactory.createPokedex(null, null);
        assertNotNull(pokedex);
    }
}
