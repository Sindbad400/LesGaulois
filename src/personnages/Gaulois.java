package personnages;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force, int effetPotion) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gauloi " + nom + " : ";
	}
	public void boirePotion(int forcePotion) {
		effetPotion=effetPotion+forcePotion;
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((effetPotion*force)/3);
		effetPotion=effetPotion-1;
	}
	
	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}
	public void sePresenter() {
		if (village==null) {
			parler("Bonjour, je m'appelle "+getNom()+" et je suis sans domicile");
		}
		else if (village.getChef()==this) {
			parler("Bonjour, je m'appelle "+getNom()+" et je suis le chef du village : "+village.getNom());
		}
		else {
			parler("Bonjour, je m'appelle "+getNom()+" et j'habite au village "+village.getNom());
		}
	}

	@Override
	public String toString() {
		return nom;
	}

	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Astérix",8,0);
		System.out.println(asterix);
	}
	
	
}