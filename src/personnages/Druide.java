package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	public Druide(String nom, int force, Chaudron chaudron) {
		super();
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide" + nom + " : ";
	}
	public void fabriquerPotion(int Quantite,int forcePotion){
		chaudron.remplirChaudron(Quantite,forcePotion);
		parler("J'ai concocté "+Quantite+" does de potion magique. Elle a une force de "+forcePotion+".");
	}
	public void boosterGaulois(Gaulois gaulois) {
		Boolean contientPotion=chaudron.resterPotion();
		String nomGauloi=gaulois.getNom();
		if(contientPotion==true){
			if(nomGauloi=="Obélix") {
				parler("Non Obélix pas toi. Tu est tombé dedans étant petit.");
			}
			else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens "+gaulois.getNom()+" un peu de potion magique.");
			}
		}
		else {
			parler("Désolé "+gaulois.getNom()+" je suis à sec.");
		}
	}
}

