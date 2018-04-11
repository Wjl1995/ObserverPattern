package Observers;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {

	private String name = null;
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
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg1 instanceof String)
		{
			name = (String)arg1;
			System.out.println("NameObserver : "+arg0.toString()+" name changed to "+name);
		}
	}
}
