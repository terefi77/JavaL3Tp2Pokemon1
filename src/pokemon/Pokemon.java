package pokemon;

import java.util.Random;

public abstract class Pokemon {
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private static int niveauMax = 10;
	private TypePokemon type;

	public Pokemon(String nom, TypePokemon type) {
		Random r = new Random();
		this.nom = nom;
		this.niveau = r.nextInt(1, 11);
		this.hp = 2 * niveau;
		this.atk = (niveau / 2) + 1;
	}

	public Boolean isKO() {
		return hp == 0;
	}

	public void soigner() {
		this.hp = 2 * this.niveau;
	}

	public abstract void attaquer(Pokemon p);

	public String toString() {
		return "[Pokemon" + this.nom + "]: je m'appelle " + this.nom + "\n" + "je suis de niveau " + this.niveau + "\n"
				+ "j'ai " + this.hp + " vie" + "\n" + "mon attaque de base est de " + this.atk;
	}

	public void log(String texte) {
		System.out.println(texte);
	}

	public abstract void subir(Pokemon p);

	private String prefixe() {
		return "[Pokemon " + this.nom + "]:";
	}

	public String getNom() {
		return this.nom;
	}

	public int getHp() {
		return this.hp;
	}

	public int getNiveau() {
		return this.niveau;
	}

	public int getAtk() {
		return this.atk;
	}

	public TypePokemon getType() {
		return this.type;
	}
}
