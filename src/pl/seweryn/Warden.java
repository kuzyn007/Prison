package pl.seweryn;

public class Warden implements Observer {

	@Override
	public void newOrder(Order order) {
		Cargo cargo = order.getCargo();

		System.out.println("WARDEN: Price " + cargo.getName() + " = " + cargo.getMonay() + " $");
		System.out.println();

	}

}
