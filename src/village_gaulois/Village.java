package village_gaulois;
import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois;
	private Gaulois chef;
	private Gaulois[] villageois;
	public Village(String nom, int nbVillageois) {
		super();
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.villageois=new Gaulois[nbVillageois];
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbVillageois() {
		return nbVillageois;
	}
	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}
	public Gaulois getChef() {
		return chef;
	}
	public void setChef(Gaulois chef) {
		this.chef = chef;
		chef.setVillage(this);
	}
	public void ajouterVillageois(Gaulois gaulois){
		for (int i = 0; i < villageois.length; i++) {
			if (villageois[i]==null) {
				villageois[i]=gaulois;
				gaulois.setVillage(this);
				return;
			}
			
		}
	}
	public Gaulois trouverVillageois(int num) {
		if (villageois[num-1]==null) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		return villageois[num-1];
	}
	public void afficherVillageois() {
		System.out.println("Dans le village "+this.getNom()+"du chef "+this.getChef()+" vivant les gaulois:");
		for (Gaulois gaulois : villageois) {
			if (gaulois!=null) {
				System.out.println("-"+gaulois);
			}
		}
	}
	public static void main(String[] args) {
		Gaulois abraracourcix=new Gaulois("Abraracourcix",6,0);
		Village village_des_irreductibles=new Village("Village des irréductibles ",30);
		village_des_irreductibles.setChef(abraracourcix);
		Gaulois asterix=new Gaulois("Astérix",8,0);
		village_des_irreductibles.ajouterVillageois(asterix);
		Gaulois gaulois = village_des_irreductibles.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village_des_irreductibles.trouverVillageois(2);
		System.out.println(gaulois);
		Gaulois obelix=new Gaulois("Obélix",25,10);
		village_des_irreductibles.ajouterVillageois(obelix);
		Gaulois sansabrix=new Gaulois("Sansabrix",4,0);
		village_des_irreductibles.afficherVillageois();
		abraracourcix.sePresenter();
		asterix.sePresenter();
		sansabrix.sePresenter();
		
	}
}
