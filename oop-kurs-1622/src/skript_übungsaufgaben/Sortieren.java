package skript_übungsaufgaben;
import java.util.Arrays;
import java.util.Objects;

public class Sortieren {
	
	public Bank[] banken = {new Bank("richbank", 10), new Bank("poorbank", 9), new Bank("goodbank", 1)};

	
	boolean istEnthalten(int wert, int[] feld) {
		for (int x : feld) {
			if (x == wert) {
				return true;
			}
		}
		return false;
	}
	
	int bestimmeAnzahl(int wert, int[] feld) {
		int counter = 0;
		for (int x : feld) {
			if (x == wert) {
				counter++;
			}
		}
		return counter;
	}
	
	boolean istEnthalten(String wert, String[] feld) {
		for (String s : feld) {
			if (s.equals(wert)) {
				return true;
			}
		}
		return false;
	}
	
	public void liefereBanken() {
		this.banken[0].liefereName();
		System.out.println(this.banken[0]);
		System.out.println(Arrays.toString(banken));
		System.out.println(Objects.toString(this.banken[0]));
	}
	
	int addiereBlz(int id) {
		int sum = 0;
		for (Bank bank : banken) {
			if (id == bank.liefereBLZ()) {
				System.out.println("bank");
				sum += bank.liefereBLZ();
				System.out.println(sum);
			}
		}
		return sum;
	}
	
	Bank findeHöchsteId() {
		int indexHighest = 0;
		int currentIndex = 1;
		while (currentIndex < banken.length) {
/*
			if (this.banken[1] instanceof Bank) {
				System.out.println("1 bank objekt");
				System.out.println(this.banken[1]);
				System.out.println(this.banken[1].liefereBLZ());
			}
			*/
			
			if (this.banken[indexHighest].liefereBLZ() > this.banken[currentIndex].liefereBLZ()) {
				System.out.println("higher");
				currentIndex++;
			} else {
				indexHighest = currentIndex;
				currentIndex++;
			}
			
		}
		System.out.println("Die bank mit der höchsten id hat index " + indexHighest);
		System.out.println("Der name der bank ist " + this.banken[indexHighest].liefereName());
		return this.banken[indexHighest];
	}
	
	int bestimmeAnfangdesWorts(char[] feld, String wort) {
		boolean found = false;
		int i;
		for (i = 0; i < feld.length - wort.length() + 1; i++) {
			for (int j = 0; j < wort.length(); j++) {
				System.out.println("comparing char " + wort.charAt(j) + " to feld " + feld[i+j]);
				if (wort.charAt(j) == feld[i+j]) {
					//System.out.println("comparing char " + wort.charAt(j) + " to feld " + feld[i+j]);
					found = true;
					if (j == wort.length() - 1 && found == true) {

						System.out.println(found);
						System.out.println(i);
						return i;
					}
				} else {
					found = false;
					break;
				}
			}	
		}
		System.out.println(found);
		System.out.println(-1);
		return -1;
	}
	
	// insertion sort
	void sortiereAbsteigend(String[] feld) {
		
		for (int k = 0; k < feld.length - 1; k++) {
			
			for (int i = 0; i < feld.length - 1; i++) {
				System.out.println("comparing char " + feld[i].charAt(0)+ " to feld " + feld[i+1].charAt(0));
				if (feld[i].charAt(0) < feld[i+1].charAt(0)) {
					System.out.println("swapping");
					String temp = feld[i];
					feld[i] = feld[i+1];
					feld[i+1] = temp;		
				} 				
			}
		}
		for (String s : feld) {
				System.out.println(s);
			}
	}
 
	public static void main(String[] args) {
		
		int[] feld1 = {1,2,3,4,5,6,7,7,6,5,4,3,2,1,2,3,4};
		String[] feld2 = {"hi", "aey", "bello", "ciao bella", "hola", "daag", "servus", "griasdi"};
		char[] worte = {'h', 'e', 'l', 'l', 'o','f','r','o','m'};
		
		Sortieren test = new Sortieren();
		boolean bool = test.istEnthalten(2, feld1);
		//System.out.println(bool);
		//System.out.println(test.bestimmeAnzahl(9, feld1));
		//System.out.println(test.istEnthalten("hi", feld2));
		//test.addiereBlz(1);
		//test.findeHöchsteId();
		//test.bestimmeAnfangdesWorts(worte, "of");
		test.sortiereAbsteigend(feld2);
	}
	
	

}
