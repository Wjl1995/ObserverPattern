package Observable;

import java.util.Observable;

public class ProductInfo extends Observable {

	private String pName;
	private float pPrice;
	
	public ProductInfo(String pName, float pPrice)
	{
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public String getName() {
		return pName;
	}
	
	public void setName(String pName) {
		if (pName == this.pName)
			return;
		this.pName = pName;
		this.setChanged();
		this.notifyObservers(pName);
	}
	
	public float getPrice() {
		return pPrice;
	}
	
	public void setPrice(float pPrice) {
		if (pPrice == this.pPrice)
			return;
		this.pPrice = pPrice;
		this.setChanged();
		this.notifyObservers(pPrice);
	}
	
	public String toString()
	{
		return "Product ID = 100001";
	}
}
