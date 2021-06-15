package einsendeaufgabe5;

class UngueltigeKilometerangabeAusnahme extends Exception {
	public UngueltigeKilometerangabeAusnahme(int km) {
		super("Eine negative Kilometeranzahl von " + km + " ist nicht gültig.");
	}
}
