package einsendeaufgabe3;
import java.util.Arrays;

/**
 * Programm zur Berechnung des Durschnittes aus einem Array von int-Zahlen.
 */
public class Durchschnitt {

	/**
	 * Methode zur Berechnung des Durchschnittes eines Arrays 
	 * von nichtnegativen int-Zahlen.
	 * 
	 * @param feld ein Array von int-Zahlen.
	 * @return Der berechnete Durchschnitt der Zahlen im Array.
	 */
	public double berechneDurchschnitt(int[] feld) {
		if (feld.length == 0) {
			return 0;
		} 
		double sum = 0;
		for (int i = 0; i < feld.length; i++) {
			sum += feld[i];
		}
		double durchschnitt = sum / feld.length;
		System.out.println(durchschnitt);
		return durchschnitt;
	}
	
	public static void main(String[] args) {
		int[] test = {4,5,6,6,9};
		System.out.println(Arrays.toString(test));
		new Durchschnitt().berechneDurchschnitt(test);
	}
	
	
	
	
}




