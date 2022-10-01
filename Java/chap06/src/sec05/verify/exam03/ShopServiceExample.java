package sec05.verify.exam03;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("They are same object, ShopService");
		} else {
			System.out.println("They are different object, ShopService");
		}
		

	}

}
