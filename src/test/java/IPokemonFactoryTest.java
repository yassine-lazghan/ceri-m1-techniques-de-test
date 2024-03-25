import fr.univavignon.pokedex.api.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class IPokemonFactoryTest {
    private IPokemonFactory pokemonFactory;

    @BeforeEach
    public void setUp() {
        pokemonFactory = Mockito.mock(IPokemonFactory.class);
        Mockito.when(pokemonFactory.createPokemon(0, 613, 64, 4000, 4)).thenReturn(new Pokemon(0, "TestPokemon", 50, 50, 50, 613, 64, 4000, 4));
    }

    @Test
    public void testCreatePokemon() {
        Pokemon pokemon = pokemonFactory.createPokemon(0, 613, 64, 4000, 4);
        assertNotNull(pokemon, "Le pokemon ne devrait pas être null");
    }
}
