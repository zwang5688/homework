package cse360assignment02;

public class AddingMachine {
	private int total;
	private String str = "0";

	/**
	 * This method is the initial constructor of AddingMachine.
	 */
	public AddingMachine() {
		total = 0;  // not needed - included for clarity
	}

	/**
	 * This method is used to get the sum.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * This method is used to add a number to total.
	 */
	public void add(int value) {
		total += value;
		str = str +  " + " + value;
	}

	/**
	 * This method is used to subtract the number from the total.
	 */
	public void subtract(int value) {
		total -= value;
		str = str + " - " + value;
	}

	/**
	 * This method is used to print out the outcome in string format
	 */
	public String toString() {
		return str;
	}

	/**
	 * This method is used to clear and reset the total value.
	 */
	public void clear() {
		total = 0;
	}

}