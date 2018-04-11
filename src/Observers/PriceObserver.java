package Observers;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {

	private float price = 0;
	private ArrayList<Observable> myObservables = new ArrayList<Observable>();
	
	public void addObservable(Observable o)
	{
		if (o == null)
			throw new NullPointerException();
		if (!myObservables.contains(o))
		{
			myObservables.add(o);
			o.addObserver(this);
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (arg instanceof Float)
		{
			price = ((Float)arg).floatValue();
			System.out.println("PriceObserver : "+o.toString()+" price changed to "+price);
		}
		
	}

}
