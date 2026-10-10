package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois{
	public static void main(String[] args) {
		
		Gaulois asterix=new Gaulois("Astérix",8,0);
		
	Gaulois obelix=new Gaulois("Obélix",16,1);
	
	Romain minus=new Romain("Minus",6);
	
	
	asterix.parler("Bonjour Obélix");
	obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
	asterix.parler("Oui très bonne idée.");
	System.out.println("Dans le forêt, "+asterix+" et "+obelix+" tombent nez à nez avec le romain "+minus.getNom()+".");
	while(minus.getForce()>0) {
		asterix.frapper(minus);
	}
	}
}