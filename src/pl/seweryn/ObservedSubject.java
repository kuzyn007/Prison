package pl.seweryn;

public interface ObservedSubject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers(Order o);
}
