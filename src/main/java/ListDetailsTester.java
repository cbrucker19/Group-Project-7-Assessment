import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shop;

public class ListDetailsTester {

	public static void main(String[] args) {
	Shop fiat = new Shop("Fiat");
	
	ShopperHelper sh = new ShopperHelper();
	sh.insertShop(fiat);
	
	ListDetailsHelper ldh = new ListDetailsHelper();
	
	ListItem wheel = new ListItem("4545", "Wheel");
	ListItem rim = new ListItem("4546", "Rim");
	
	List<ListItem> FiatItems = new ArrayList<ListItem>();
	FiatItems.add(wheel);
	FiatItems.add(rim);
	
	ListDetails FiatList = new ListDetails("Fiat's list" ,LocalDate.now(), fiat);
	
	FiatList.setListOfItems(FiatItems);
	
	ldh.insertNewListDetails(FiatList);
	List<ListDetails> allLists = ldh.getLists();
	
	for(ListDetails a: allLists) {
		System.out.println(a.toString());
	}
	
	}
}
