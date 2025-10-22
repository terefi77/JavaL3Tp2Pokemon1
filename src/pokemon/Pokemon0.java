package pokemon;
import java.util.Random;
public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	public Pokemon0(String nom) {
		Random r=new Random();
		this.nom=nom;
		this.niveau=r.nextInt(1,11);
		this.hp=2*niveau;
		this.atk=(niveau/2)+1;
	}
	public Boolean isKO() {
			return hp==0;
	}
	public void soigner() {
			this.hp=2*this.niveau;
	}
	public void attaquer(Pokemon0 p) {
		p.hp=p.hp-this.atk;
		System.out.println(this.prefixe()+" j'attaque "+p.nom);
	}
	public String toString() {
		return this.prefixe()+ " m'appelle "+this.nom+"\n"+"je suis de niveau "+this.niveau+"\n"+"j'ai "+this.hp+" vie"+"\n"+"mon attaque de base est de "+this.atk;
	}
	public void log(String texte) {
		System.out.println(texte);
	}
	private String prefixe() {
		return "[Pokemon "+this.nom+"]:";
	}
}
