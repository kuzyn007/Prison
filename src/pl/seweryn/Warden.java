package pl.seweryn;

public class Warden implements Observer {
	private double totalExpences;
	
	@Override
	public void newOrder(Order order) {
		Cargo cargo = order.getCargo();
		totalExpences += cargo.getMonay();	
	}
	
	public void getRaport() {
		System.out.println("WARDEN: Total  Expences until now: " + totalExpences + " $");
	}

}
