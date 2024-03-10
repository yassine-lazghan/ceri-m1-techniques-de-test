import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class IPokedexTest {
    private IPokedex pokedex;

    @BeforeEach
    public void setUp() {
        pokedex = Mockito.mock(IPokedex.class);
    }

    @Test
    public void testAddPokemon() {
        Pokemon pokemon = new Pokemon(...);
        pokedex.addPokemon(pokemon);
        verify(pokedex, times(1)).addPokemon(pokemon);
    }
}

