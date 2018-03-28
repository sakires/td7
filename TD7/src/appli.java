import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class appli {

	public static void main(String[] args) {
		final HashSet<Integer> enssemble =  new HashSet<Integer>();		
		final int valeur_verif = 50;
		int i;
		int max = 100;
		int pos= 1 ;
		boolean estDedans;
		
			for(i=0;i<20;i++){
				enssemble.add((int) (Math.random()*max));

			}
			enssemble.add(42);
		while (!enssemble.contains(max))
				max--;	
		
		estDedans = enssemble.contains(valeur_verif);
		if(estDedans)
			System.out.println(valeur_verif + " est dedans ");
		else
			System.out.println(valeur_verif + " est pas dedans ");
		
		for(Integer s : enssemble){
		        System.out.print(s + " ");				
		}
		
		for (Integer a : enssemble){
			if (a != max)
				pos++;
			else
				break;
		}
		System.out.println(" ");


		System.out.println("la valeur maximum est : " + max + " a la position " + pos);
		
		int post= 0;
		int[] test = new int[enssemble.size()];
		for(i=0;i<100;i++){
			if(enssemble.contains(i)){
				test[post]=i;
				post++;
			}			
		}
		for(i=0;i<test.length;i++){
			System.out.print(test[i] + " ");
		}
	}
}
