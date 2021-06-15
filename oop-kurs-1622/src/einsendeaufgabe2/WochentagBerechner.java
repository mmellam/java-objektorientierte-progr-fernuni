package einsendeaufgabe2;
public class WochentagBerechner {

	/**
	 * es wird der Wochentag zu einem gueltigen Datum bestimmt
	 * 
	 * @param tag der Tag (0 < tag <= 31)
	 * @param monat der Monat (0 < monat <= 12)
	 * @param jahr die vierstellige Jahreszahl (z. B. 2009)
	 */
	public void berechneWochentag(int tag, int monat, int jahr) {
		
		int jahrhundert = jahr / 100;
		int jahreszahl = jahr - (jahrhundert*100);
		
		
		int monatszahl;		
		if (monat == 1) {
			monatszahl = 13;
		} else if (monat == 2) {
			monatszahl = 14;
		} else {
			monatszahl = monat;
		}
		
		int wochentag;
		wochentag = (tag + ((26 * (monatszahl + 1))/10) + ((5 * jahreszahl)/4) + (jahrhundert/4) + (5 * jahrhundert) - 1) % 7;
		
		String name;
		switch (wochentag) {
		case 0:
			name = "Sonntag";
			break;
		case 1: 
			name = "Montag";
			break;
		case 2: 
			name = "Dienstag";
			break;
		case 3: 
			name = "Mittwoch";
			break;
		case 4: 
			name = "Donnerstag";
			break;
		case 5: 
			name = "Freitag";
			break;
		case 6: 
			name = "Samstag";
			break;
		default: 
			name = "Not a valid day";
		}
		System.out.println(name);
		/*
		System.out.println(tag);
		System.out.println(jahrhundert);
		System.out.println(jahreszahl);
		System.out.println(monatszahl);
		*/
	}
	
	public static void main(String[] args) {
		// Diese Variablen veraendern, um
		// Implementierung zu testen
		int t = 23; // der Tag
		int m = 4; // der Monat
		int j = 2021; // das Jahr
		// Erzeuge die Ausgabe
		System.out.print("Der ");
		System.out.print(t);
		System.out.print(".");
		System.out.print(m);
		System.out.print(".");
		System.out.print(j);
		System.out.print(" ist ein ");
		new WochentagBerechner().berechneWochentag(t, m, j);
	}


}
