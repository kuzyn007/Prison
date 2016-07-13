package pl.seweryn;

import java.util.ArrayList;
import java.util.List;

public class Storehouse implements ObservedSubject {
	private List<Order> orderList = new ArrayList<Order>();
	private List<Observer> observerList = new ArrayList<Observer>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void realizeOrders() {

		for (Order order : orderList) {
			order.realize();
			notifyObservers(order);
		}
		orderList.clear();
	}

	@Override
	public void addObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers(Order o) {
		for(Observer observer : observerList) {
			observer.newOrder(o);
		}

	}
}