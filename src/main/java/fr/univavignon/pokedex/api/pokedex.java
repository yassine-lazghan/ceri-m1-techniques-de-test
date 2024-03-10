package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.List;

public class Pokedex implements IPokedex {
    private List<Pokemon> pokemons = new ArrayList<>();

    private IPokemonFactory pokemonFactory;
    private IPokemonMetadataProvider metadataProvider;

    public Pokedex(IPokemonFactory pokemonFactory, IPokemonMetadataProvider metadataProvider) {
        this.pokemonFactory = pokemonFactory;
        this.metadataProvider = metadataProvider;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws Exception {
        return metadataProvider.getPokemonMetadata(index);
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return pokemonFactory.createPokemon(index, cp, hp, dust, candy);
    }

    @Override
    public int size() {
        return pokemons.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
        return pokemons.size() - 1;
    }

    @Override
    public Pokemon getPokemon(int id) throws Exception {
        if(id < 0 || id >= pokemons.size()) {
            throw new Exception("Pokemon not found with id: " + id);
        }
        return pokemons.get(id);
    }

    @Override
    public List<Pokemon> getPokemons() {
        return new ArrayList<>(pokemons);
    }
}
