package pl.seweryn;

public class Main {

	public static void main(String[] args) {
		Prison prisonS = new Prison("Shawshank");
		Prison prisonA = new Prison("Alcatraz");
		
		Order buyPillowsS = new BuyPillows(10, prisonS);
		Order buyFoodS = new BuyFood(7, prisonS);
		Order buyFoodA = new BuyFood(3, prisonA);
		Order buyCigarettesA = new BuyCigarettes(21, prisonA);
		
		Storehouse storehouse = new Storehouse();
		
		Police police = new Police();
		Warden warden = new Warden();
		storehouse.addObserver(police);
		storehouse.addObserver(warden);
		
		System.out.println("---- First day: Orders are realized. ----");
		storehouse.takeOrder(buyPillowsS);
		storehouse.takeOrder(buyFoodS);
		storehouse.takeOrder(buyFoodA);
		storehouse.takeOrder(buyCigarettesA);
		storehouse.realizeOrders();
		
		System.out.println("---- Second day: Orders are realized. ----");
		storehouse.takeOrder(buyFoodS);
		storehouse.takeOrder(buyFoodA);
		storehouse.takeOrder(buyCigarettesA);
		storehouse.realizeOrders();
	}

}
