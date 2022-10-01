package sec05.verify.exam03;

public class ShopService {
	//static field
	private static ShopService shopService = new ShopService();
	
	//constructor
	private ShopService() {
		
	}
	
	//static method
	static ShopService getInstance() {
		return shopService;
	}

}
