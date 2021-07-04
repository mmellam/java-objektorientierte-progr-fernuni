package einsendeaufgabe7;

public class MietpreisBerechnerTest extends junit.framework.TestCase {
	
	protected MietpreisBerechner m;
	
	public void setUp() {
		m = new MietpreisBerechner();
	}
	
	public void testA() {
		assertEquals("Preis bei weniger als 14 Tagen und weniger als 200km fehlerhaft", 6000, m.berechneMietpreis(1, 10));
	}

	public void testB() {
		assertEquals("Preis bei weniger als 14 Tagen und weniger als 200km fehlerhaft", 8000, m.berechneMietpreis(2, 0));
	}

	public void testC() {
		assertEquals("Preis bei weniger als 14 Tagen und gleich 200km fehlerhaft", 12000, m.berechneMietpreis(4, 200));
	}

	public void testD() {
		assertEquals("Preis bei weniger als 14 Tagen und mehr als 200km fehlerhaft", 20750, m.berechneMietpreis(8, 250));
	}

	public void testE() {
		assertEquals("Preis bei weniger als 14 Tagen und weniger als 200km fehlerhaft", 26000, m.berechneMietpreis(11, 199));
	}

	public void testF() {
		assertEquals("Preis bei weniger als 14 Tagen und weniger als 200km fehlerhaft", 30000, m.berechneMietpreis(13, 150));
	}

	public void testG() {
		assertEquals("Preis bei 14 Tagen und weniger als 200km fehlerhaft", 31800, m.berechneMietpreis(14, 150));
	}

	public void testH() {
		assertEquals("Preis bei mehr als 14 Tagen und mehr als 200km fehlerhaft", 33000, m.berechneMietpreis(20, 250));
	}
}