package basicCollections;

import java.util.HashSet;
import java.util.Set;

public class FindDups2 {
	public static void main(String[] args) {
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : args){
			if(!uniques.add(a));
				dups.add(a);
		}
		
		//
		uniques.removeAll(dups);
		
		System.out.println("Palavras Únicas: " + uniques);
		System.out.println("Palavras Repetidas: " + dups);
	}
	

}
