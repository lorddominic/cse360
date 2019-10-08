package cse360assign2;

public class AddingMachine {

	private int total;
	private String str;
	private int secretInt=7;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		str = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		str = str + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		str = str + " - " + value;
	}
		
	public String toString () {
		return str;
	}

	public void clear() {
	
	}
}
