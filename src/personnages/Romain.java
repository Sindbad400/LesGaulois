package personnages;

import Objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement=0;
	private Equipement equipement[]=new Equipement[2];
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		
		assert IsInvariantVerified();
	}

	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert forceCoup>0;
		int forceIni=force;
		force=force-forceCoup;
		assert IsInvariantVerified();
		if(force<1) {
			parler("J'abandonne !");
		}
		else {
			parler("Aïe");
		}
		assert force<forceIni;
	}
	private boolean IsInvariantVerified() {
		return force>=0;
	}
	public void sEquiper(Equipement arme) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+getNom()+" est déjà bien protégé !");
			break;
		case 1:
			if (arme==equipement[0]) {
				System.out.println("Le soldat "+getNom()+" possède déjà cet équipement !");
			}
			else {
				equipement[1]=arme;
				nbEquipement++;
				System.out.println("Le soldat "+getNom()+" s'équipe avec un "+arme.getNom());
			}
			break;
		default:
			equipement[0]=arme;
			nbEquipement++;
			System.out.println("Le soldat "+getNom()+" s'équipe avec un "+arme.getNom());
			break;
		}
	}
	public static void main(String[] args) {
		Romain minus=new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}