package fr.univavignon.pokedex.api;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {
    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws Exception {
        if(index == 0) {
            return new PokemonMetadata(0, "Bulbasaur", 126, 126, 90);
        } else if(index == 133) {
            return new PokemonMetadata(133, "Eevee", 186, 168, 260);
        }
        throw new Exception("Metadata not found for index: " + index);
    }
}

