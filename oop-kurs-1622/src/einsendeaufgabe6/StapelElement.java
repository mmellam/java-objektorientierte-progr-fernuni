package einsendeaufgabe6;

public class StapelElement {
	
	private String entry;
	private StapelElement next;
	
	public StapelElement(String value) {
		this(value, null);
	}
	
	public StapelElement(String value, StapelElement nextStapelEl) {
		this.entry = value;
		this.next = nextStapelEl;
	}
	
	public void setEntry(String value) {
		this.entry = value;
	}
	
	public void setNext(StapelElement nextStapelEl) {
		this.next = nextStapelEl;
	}
	
	public String getEntry() {
		return this.entry;
	}
	
	public StapelElement getNext() {
		return this.next;
	}
	
	public void print() {
		System.out.println(this.getEntry());
	}
	
}