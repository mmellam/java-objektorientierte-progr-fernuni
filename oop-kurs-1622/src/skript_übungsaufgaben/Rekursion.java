package skript_übungsaufgaben;

public class Rekursion {
	
	int fakultaetIterativ(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 1;
		}
		int k = 1;
		while (n > 0) {
			k *= n;
			n--;
		}
		return k;
	}
	
	int fakultaetRekursiv(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0) {
			return 1;
		}
		return n * fakultaetRekursiv(n - 1);
	}
	
	double power(int p, int n) {
		if (n <= 0 && p < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 1) {
			return p;
		}
		
		return p * power(p, n - 1);
	}
	
	long zufallszahl(int n ) {
		if (n < 3) {
			return n + 1;
		}
		return (1 + (((zufallszahl(n-1)-zufallszahl(n-2))*zufallszahl(n-3)%100)));
	}
	
	void gebeZufallAus() {
		for (int i = 5; i < 31; i++) {
			System.out.println(this.zufallszahl(i));
		}
	}
	
	boolean istPalindromIterativ(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			} 
		}
		System.out.println("true");
		return true;
	}
	
	boolean istPalindromRekursiv(String s) {
		if (s.length() <= 1) {
			return true;
		}
		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}		
		return istPalindromRekursiv(s.substring(1, s.length() - 1));	
	}
	
	public static void main(String[] args) {
		Rekursion k = new Rekursion();
		//System.out.println(k.fakultaetIterativ(5));
		//System.out.println(k.fakultaetRekursiv(5));
		//System.out.println(k.power(2, 8));
		//System.out.println(k.zufallszahl(5));
		//k.gebeZufallAus();
		//k.istPalindromIterativ("eighyhhyhgie");
		System.out.println(k.istPalindromRekursiv("renhuier"));
	}
}
