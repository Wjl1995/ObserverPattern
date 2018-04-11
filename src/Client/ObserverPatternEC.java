package Client;

import Observable.*;
import Observers.*;

public class ObserverPatternEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductInfo product = new ProductInfo("������Ʒ1", 100);
		NameObserver nameObs = new NameObserver();
		PriceObserver priceObs = new PriceObserver();
		
		// ��ӹ�ע
		nameObs.addObservable(product);
		priceObs.addObservable(product);
		
		// �޸���Ϣ
		product.setName("��Ʒ111");
		product.setPrice(100);
	}

}
