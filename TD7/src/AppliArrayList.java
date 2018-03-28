import java.util.ArrayList;

public class AppliArrayList {

	public static void main(String[] args) {
		ArrayList liste = new ArrayList();
		int i;
		boolean estDedans;
		final int valeur_verif = 50;
		int max = 100;
		int pos;
		
		for(i=0;i<20;i++){
			liste.add(((int) (Math.random()*max)));
		}
		
		estDedans = liste.contains(valeur_verif);
		if(estDedans)
			System.out.println(valeur_verif + " est dedans ");
		else
			System.out.println(valeur_verif + " est pas dedans ");
		
		for(i=0;i<liste.size();i++){
			System.out.println(liste.get(i) + " ");
		}
		
		while (!liste.contains(max))		
			max--;
		System.out.println("la valeur maximum est : " + max + " a la position " + pos);
	}

}
