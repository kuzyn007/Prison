package pl.seweryn;

public class BuyCigarettes implements Order {
	private int amount = 0;
	private Prison prison;
	
	public BuyCigarettes(int amount, Prison prison) {
		this.amount = amount;
		this.prison = prison;
	}

	@Override
	public void realize() {
		if (amount <= 0) {
			System.out.println("Nothing to do..");
		} else {
			System.out.println("=======================");
			System.out.println("Driving to shop");
			System.out.println("Selecting Malboro cigarette");
			System.out.println("Buying " + amount + " Malboro cigarettes");
			System.out.println("Driving back to prison: " + prison.getName());
			prison.storeCargo(new Cargo("Cigarette", amount, amount*4));
			System.out.println();
		}
	}

	@Override
	public Cargo getCargo() {
		if (amount <= 0) {
			return new Cargo("Empty", 0, 0);
		} else {
			return new Cargo("Cigarette", amount, amount*4);
		}
	}
}
