package pl.seweryn;

public class Police implements Observer {

	@Override
	public void newOrder(Order order) {
		Cargo cargo = order.getCargo();
		if(cargo.getName() == "Cigarette") {
			System.out.println("POLICE: Illegal product detected: " + cargo.getName());
			System.out.println();
		}
		else {
			System.out.println("POLICE: Product accepted: " + cargo.getName());
			System.out.println();
		}
	}

}
