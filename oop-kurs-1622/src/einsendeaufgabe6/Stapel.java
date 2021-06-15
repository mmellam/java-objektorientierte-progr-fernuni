package einsendeaufgabe6;

public class Stapel {

	private StapelElement head;
	
	public Stapel() {
		this.head = null;
	}
	
	public void fuegeElementHinzu(String s) {
		StapelElement newStapelEl = new StapelElement(s, this.head);
		this.head = newStapelEl;
	}
	
	public String entferneOberstesElement() {
		if (this.head == null) {
			return null;
		}
		StapelElement oldHead = this.head;
		this.head = oldHead.getNext();
		return oldHead.getEntry();	
	}
	
	public String liefereOberstesElement() {
		if (this.head == null) {
			return null;
		}
		return this.head.getEntry();
	}
	
	public long liefereGroesse() {
		long size = 0;
		StapelElement current = this.head;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}
	
	public boolean istLeer() {
		if (this.head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printStapel() {
		printStapel(this.head);
	}
	
	private void printStapel(StapelElement stapelEl) {
		if (stapelEl == null) {
			return;
		}
		stapelEl.print();
		System.out.println(" ");
		printStapel(stapelEl.getNext());
	}
	
	public static void main(String[] args) {
		Stapel test = new Stapel();
		test.fuegeElementHinzu("El1");
		test.fuegeElementHinzu("El2");
		test.fuegeElementHinzu("El3");
		test.entferneOberstesElement();
		test.fuegeElementHinzu("El4");
		test.printStapel();
		//System.out.println(test.liefereOberstesElement());
		//System.out.println(test.istLeer());
		System.out.println(test.liefereGroesse());
	}
}