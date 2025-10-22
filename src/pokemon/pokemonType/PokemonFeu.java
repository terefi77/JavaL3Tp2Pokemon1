package pokemon.pokemonType;

import pokemon.Pokemon;
import pokemon.TypePokemon;

public class PokemonFeu extends Pokemon {
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
	}

	public void subir(Pokemon p) {
		TypePokemon type = p.getType();
		if (type == TypePokemon.PLANTE) {
			p.hp = p.hp - 2 * this.getAtk();
		}
	}

	@Override
	public void attaquer(Pokemon p) {
		// TODO Auto-generated method stub
		
	}
	
}
