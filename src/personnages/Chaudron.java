package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	public void remplirChaudron(int quantite,int forcePotion) {
		quantitePotion=quantitePotion+quantite;
		this.forcePotion=forcePotion;
	}
	public Boolean resterPotion() {
		if(quantitePotion==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public int prendreLouche() {
		quantitePotion=quantitePotion-1;
		if(quantitePotion==0) {
			forcePotion=0;
		}
		return forcePotion;
	}
}
