package einsendeaufgabe2;

public class PrimzahlTester {

	/**
	 * prueft ob die uebergebene nichtnegative Zahl eine Primzahl ist
	 * wenn die uebergebene Zahl eine Primzahl ist, wir JA ausgegeben
	 * ansonsten NEIN
	 * 
	 * @param n die zu testende nichtnegative Zahl
	 */
	public void istPrimzahl(long n) {
		boolean antwort = true;
		// Eingabe auf 0 und 1 überprüfen
		if (n == 0 || n == 1) {
			antwort = false;
		} else {
			// Eingabe auf Teilbarkeit überprüfen
			int i = 2;
			while (i < n) {
				if (n % i == 0) {
					antwort = false;
					break;
				}
				i++;
			}
		}
		// Antwort ausgeben
		if (antwort == false) {
			System.out.println("NEIN");
		} else {
			System.out.println("JA");
		}
	}
	
	public static void main(String[] args) {
		// Variable x veraendern, um die
		// Implementierung zu testen
		int x = 5;
		// Erzeuge die Ausgabe
		System.out.print("Ist ");
		System.out.print(x);
		System.out.println(" eine Primzahl?");
		new PrimzahlTester().istPrimzahl(x);
	}
}
