package pl.seweryn;

public class BuyFood implements Order {
	private int amount = 0;
	private Prison prison;
	
	public BuyFood(int amount, Prison prison) {
		this.amount = amount;
		this.prison = prison;
	}

	@Override
	public void realize() {
		if (amount <= 0) {
			System.out.println("Nothing to do..");
		} else {
			System.out.println("=======================");
			System.out.println("Driving to bakery");
			System.out.println("Selecting cheap bread");
			System.out.println("Buying " + amount + " cheap breads");
			System.out.println("Driving back to prison: " + prison.getName());
			prison.storeCargo(new Cargo("Bread", amount, amount*0.5));
			System.out.println();
		}
	}

	@Override
	public Cargo getCargo() {
		if (amount <= 0) {
			return new Cargo("Empty", 0, 0);
		} else {
			return new Cargo("Bread", amount, amount*0.5);
		}
	}
}
