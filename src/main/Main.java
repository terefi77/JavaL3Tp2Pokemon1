package main;
import pokemon.Pokemon0;
import pokemon.pokemonType.PokemonFeu;
import pokemon.pokemonType.PokemonEau;
import pokemon.pokemonType.PokemonPlante;
import pokemon.Pokemon;
public class Main {
 public static void main(String[] args) {
	/* System.out.println("\nTEST POKEMON \n");
	 Pokemon0 p1=new Pokemon0("Rhinolove");
	 Pokemon0 p2=new Pokemon0("Chovsourir");
	 p1.log(p1.toString());
	 p2.log(p2.toString());
	 p1.attaquer(p2);
	 p2.log(p2.toString());*/
	 PokemonFeu feu=new PokemonFeu("PokéFeu");
	 PokemonEau eau=new PokemonEau("PokéEau");
	 PokemonPlante plante=new PokemonPlante("PokéPlante");
	 eau.log(eau.toString());
	 feu.log(feu.toString());
	 eau.attaquer(feu);
	 feu.attaquer(eau);
	 eau.log(eau.toString());
	 feu.log(feu.toString());
	 System.out.println("\n");
	 plante.log(plante.toString());
	 plante.attaquer(eau);
	 eau.attaquer(plante);
	 plante.log(plante.toString());
	 eau.log(eau.toString());
	 
 }
}
