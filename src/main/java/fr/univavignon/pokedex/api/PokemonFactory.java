package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory {
    private final IPokemonMetadataProvider metadataProvider;

    public PokemonFactory(IPokemonMetadataProvider metadataProvider) {
        this.metadataProvider = metadataProvider;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        try {
            PokemonMetadata metadata = metadataProvider.getPokemonMetadata(index);
            return new Pokemon(index, metadata.getName(), cp, hp, dust, candy,  metadata.getAttack(), metadata.getDefense(), metadata.getStamina());
        } catch (Exception e) {
            return null;
        }
    }
}
