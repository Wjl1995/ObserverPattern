package Client;

import Observable.*;
import Observers.*;

public class ObserverPatternEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductInfo product = new ProductInfo("我是商品1", 100);
		NameObserver nameObs = new NameObserver();
		PriceObserver priceObs = new PriceObserver();
		
		// 添加关注
		nameObs.addObservable(product);
		priceObs.addObservable(product);
		
		// 修改信息
		product.setName("产品111");
		product.setPrice(100);
	}

}
