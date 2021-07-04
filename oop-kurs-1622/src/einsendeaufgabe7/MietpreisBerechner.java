package einsendeaufgabe7;

public class MietpreisBerechner {
	


	public long berechneMietpreis(int tage, int km) /*throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme*/ {
		// Preise in cent 
		int preisProTag = 2000;
		int kmPauschale = 4000;
		int preisProKmKurz = 15;
		int zweiWochenPauschale = 30000;
		int preisProKmLang = 12;
		long gesamtpreis = 0;
		
		// Fehlermeldungen
		if (tage <= 0) {
			//throw new UngueltigeTagesanzahlAusnahme(tage);
		}
		
		if (km < 0) {
			//throw new UngueltigeKilometerangabeAusnahme(km);
		}
		
		// Berechne Preis
		if (tage < 14) {
			if (km <= 200) {
				gesamtpreis += preisProTag * tage + kmPauschale;
			} else {
				gesamtpreis += kmPauschale + preisProKmKurz * (km - 200) + preisProTag * tage;
			}
		} else {
			gesamtpreis += zweiWochenPauschale + preisProKmLang * km;
		}
		System.out.println(gesamtpreis);
		return gesamtpreis;
		
	}
	
	public static void main(String[] args) {
		MietpreisBerechner m = new MietpreisBerechner();
		//try {
			m.berechneMietpreis(20, 250);
		/* } catch (UngueltigeTagesanzahlAusnahme e) {
			e.printStackTrace();
		} catch (UngueltigeKilometerangabeAusnahme e) {
			e.printStackTrace();
		} */
	}
}
