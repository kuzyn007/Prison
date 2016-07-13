package pl.seweryn;

public class BuyPillows implements Order {
	private int amount = 0;
	private Prison prison;
	
	public BuyPillows(int amount, Prison prison) {
		this.amount = amount;
		this.prison = prison;
	}

	@Override
	public void realize() {
		if (amount <= 0) {
			System.out.println("Nothing to do..");
		} else {
			System.out.println("=======================");
			System.out.println("Driving to sewing");
			System.out.println("Selecting cheap gray pillow");
			System.out.println("Buying " + amount + " cheap gray pillows");
			System.out.println("Driving back to prison: " + prison.getName());
			prison.storeCargo(new Cargo("Pillow", amount, amount*2));
			System.out.println();
		}
	}

	@Override
	public Cargo getCargo() {
		if (amount <= 0) {
			return new Cargo("Empty", 0, 0);
		} else {
			return new Cargo("Pillow", amount, amount*2);
		}
	}
}
