package einsendeaufgabe3;

public class Konto {
	
	//Exemplarvariablen
	
	private long kontostand;
	
	private long nummer;
	
	private Kunde inhaber;
	
	private Bank bank;
	
	// Konstruktor
	
	public Konto(long ktoNr, Bank b, Kunde k) {
		this.nummer = ktoNr;
		this.bank = b;
		this.inhaber = k;
		this.kontostand = 0;
	}
	
	// Exemplarmethoden
	
	public void auszahlen(long cent) {
		this.kontostand -= cent;
	}
	
	public void einzahlen(long cent) {
		this.kontostand += cent;
	}
	
	public String liefereBankname() {
		return this.bank.liefereName();
	}
	
	public long liefereBLZ() {
		return this.bank.liefereBLZ();
	}
	
	public String liefereInhabername() {
		return this.inhaber.liefereName();
	}
	
	public long liefereKontonummer() {
		return this.nummer;
	}
	
	public long liefereKontostand() {
		return this.kontostand;
	}
	
	// main
	
	public static void main(String[] args) {
		Bank richBank = new Bank("Richbank", 99999999);
		Kunde maier = new Kunde("Maier");
		Konto test = new Konto(123456789, richBank, maier);
		System.out.println(test.liefereKontostand());
		test.einzahlen(1000);
		System.out.println(test.liefereKontostand());
		test.auszahlen(400);
		System.out.println(test.liefereKontostand());
		
	}
 
}
