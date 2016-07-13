package pl.seweryn;

public class Cargo {
	private String name;
	private int quantity;
	private double monay;
	
	public Cargo(String name, int quantity, double monay) {
		this.name = name;
		this.quantity = quantity;
		this.monay = monay;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getMonay() {
		return monay;
	}
}
