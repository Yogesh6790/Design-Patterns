package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<>();
	private int state;
	
	public void setState(int val){
		this.state = val;
		notifyObservers();
	}
	
	public void attachObserver(Observer o){
		observers.add(o);
		System.out.println("Obserever has been added");
	}
	
	public void removeObserver(Observer o){
		int index = observers.indexOf(o);
		observers.remove(index);
		System.out.println("Obserever "+(index+1)+" has been removed");
	}
	
	public void notifyObservers(){
		System.out.println("Notifying observers");
		observers.forEach(x->x.update(state));
	}
	

}
