
import java.util.List;

import controller.ShopperHelper;
import model.Shop;

public class ShopperTester {

	public static void main(String[] args) {
		Shop ford = new Shop("Ford");
		Shop GMC = new Shop("GMC");
		
		ShopperHelper sh = new ShopperHelper();
		
		sh.insertShop(ford);
		sh.insertShop(GMC);
		List<Shop> allShops = sh.showAllShops();
		for(Shop a: allShops) {
			System.out.println(a.toString());
		}
	}
}
