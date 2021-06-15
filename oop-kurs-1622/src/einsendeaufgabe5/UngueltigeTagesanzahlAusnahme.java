package einsendeaufgabe5;

class UngueltigeTagesanzahlAusnahme extends Exception {
	public UngueltigeTagesanzahlAusnahme(int tageszahl) {
		// setze Fehlermeldung
		super("Eine Tageszahl von " + tageszahl + " ist nicht g�ltig. Bitte geben Sie eine positive Zahl ein.");
	}

}
