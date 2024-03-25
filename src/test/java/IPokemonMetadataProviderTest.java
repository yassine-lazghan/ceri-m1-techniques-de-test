import fr.univavignon.pokedex.api.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import fr.univavignon.pokedex.api.*;

public class IPokemonMetadataProviderTest {
    private IPokemonMetadataProvider metadataProvider;

    @BeforeEach
    public void setUp() {
        metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
    }

    @Test
    public void testGetPokemonMetadata() throws Exception {
        PokemonMetadata expectedMetadata = new PokemonMetadata(0, "Bulbasaur", 118, 111, 128);
        when(metadataProvider.getPokemonMetadata(0)).thenReturn(expectedMetadata);

        PokemonMetadata metadata = metadataProvider.getPokemonMetadata(0);
        assertNotNull(metadata);
        assertEquals("Bulbasaur", metadata.getName());
    }
}

