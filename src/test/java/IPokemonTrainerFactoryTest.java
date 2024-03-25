import fr.univavignon.pokedex.api.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
public class IPokemonTrainerFactoryTest {
    private IPokemonTrainerFactory trainerFactory;

    @BeforeEach
    public void setUp() {
        trainerFactory = Mockito.mock(IPokemonTrainerFactory.class);
    }

    @Test
    public void testCreateTrainer() {
        PokemonTrainer trainer1 = new PokemonTrainer("Ash", Team.MYSTIC, null);
        when(trainerFactory.createTrainer("Ash", Team.MYSTIC, null)).thenReturn(trainer1);
        PokemonTrainer trainer = trainerFactory.createTrainer("Ash", Team.MYSTIC, null);

        assertNotNull(trainer);
        assertEquals("Ash", trainer.getName());
    }
}

