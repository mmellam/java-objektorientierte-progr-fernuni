package einsendeaufgabe5;

public class MeinMietpreisBerechner {
	
	public long berechneMietpreis(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
		// Preise in cent 
		int preisProTag = 2000;
		int kmPauschale = 4000;
		int preisProKmKurz = 15;
		int zweiWochenPauschale = 30000;
		int preisProKmLang = 12;
		long gesamtpreis = 0;
		
		// Fehlermeldungen
		if (tage <= 0) {
			throw new UngueltigeTagesanzahlAusnahme(tage);
		}
		
		if (km < 0) {
			throw new UngueltigeKilometerangabeAusnahme(km);
		}
		
		// Berechne Preis
		if (tage <= 14) {
			gesamtpreis += preisProTag * tage + kmPauschale;
			if (km > 200) {
				gesamtpreis += preisProKmKurz * (km - 200);
			}
		} else {
			gesamtpreis += zweiWochenPauschale + preisProKmLang * km;
		}
		System.out.println(gesamtpreis);
		return gesamtpreis;
		
	}
	
	public static void main(String[] args) {
		MeinMietpreisBerechner m = new MeinMietpreisBerechner();
		try {
			m.berechneMietpreis(5, 1000);
		} catch (UngueltigeTagesanzahlAusnahme e) {
			e.printStackTrace();
		} catch (UngueltigeKilometerangabeAusnahme e) {
			e.printStackTrace();
		}
	}
}
