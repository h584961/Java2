
import java.util.*;

public class oppg1 {
	
	//int[] tab1 = {1, 2, 3};

	public static void main(String[] args) {
		
		int tab1[] = {42, 67, 89};
		
		
		skrivUt(tab1);
		
		toString(tab1);
		
		
		
		
		finnesTall(tab1, 2);
		
		System.out.println("\n" + summer(tab1));
		
		
		
		System.out.println("\n" + summerWhile(tab1));
		
		System.out.println(posisjonTall(tab1, 89));
		
		int[] reversTab1 = reverser(tab1);
		
		skrivUt(reversTab1);
		
		
		
		
		
		
		

	}
	
	public static void skrivUt(int[] tab) {
		
		for(int i = 0; i<tab.length; i++) {
			System.out.println(tab[i]);
			
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	public static String toString(int[] tabell){
		
		System.out.print("[" + tabell[0]);
		
		for(int i = 1; i < tabell.length; i++) {
			System.out.print(", " + tabell[i]);
			
		}
		System.out.print("]");
		return null;
		
		
	}
	
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
		
	}
	
	public static int summerWhile(int[] tabell) {
		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
			
			
		}
	
	public static int summerUtvidet(int [] tabell) {
		int sum = 0;
		for (int verdi : tabell) {
			sum += verdi;
		}
		return sum;
	}
	
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		
		for(int i = 0; i<tabell.length; i++) {
			if(tall != tabell[i]) {
				finnes = false;
			}
			
		}
		return finnes;
		
	}
	
	
	public static int posisjonTall (int[] tabell, int tall) {
		int x = -1;
		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				x = i;
			}
			
		}
		return x;
	}
	
	public static int[] reverser(int[] tabell) {
		
		int[] reversTabell = {};
		for(int i = tabell.length-1; i >= 0; i--) {
			reversTabell[i] = tabell[i];
		}
		return reversTabell;
	}
	
	public static boolean erSortert(int[] tabell);
}
	
	
	
	
	
        

