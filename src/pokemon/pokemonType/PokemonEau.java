package pokemon.pokemonType;
import pokemon.Pokemon;
import pokemon.TypePokemon;
public class PokemonEau extends Pokemon {
	public PokemonEau(String nom) {
		super(nom, TypePokemon.EAU);
	}
	public void subir(Pokemon p) {
		switch(p.getType()){
			case PLANTE:{ 
					this.perdreVie(p.getAtk()*2);
					log("Super Efficace");
					break;
			}
			case FEU,EAU :{ 
				int i=(int)(p.getAtk()*0.5);
				this.perdreVie(i);
				log("c'est pas très efficace");
				break;
			}
		}
	}
	@Override
	public void attaquer(Pokemon p) {
		p.subir(this);
		this.log("[Pokemon "+this.getNom()+"]: j'attqaue "+p.getNom()+" : "+this.getNom()+" vs "+p.getNom());
	}
}
