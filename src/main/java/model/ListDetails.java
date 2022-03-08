package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ListDetails {

	@Id
	@GeneratedValue
	private int id;
	private String listName;
	private LocalDate tripDate;
	
	
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Shop shop;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<ListItem> listOfItems;
	
	public ListDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListDetails(int id, String listName, LocalDate tripDate, Shop shop, List<ListItem> listOfItems) {
		super();
		this.id = id;
		this.listName = listName;
		this.tripDate = tripDate;
		this.shop = shop;
		this.listOfItems = listOfItems;
	}

	public ListDetails(String listName, LocalDate tripDate, Shop shop, List<ListItem> listOfItems) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shop = shop;
		this.listOfItems = listOfItems;
	}

	public ListDetails(String listName, LocalDate tripDate, Shop shop) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shop = shop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public LocalDate getTripDate() {
		return tripDate;
	}

	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public List<ListItem> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List<ListItem> listOfItems) {
		this.listOfItems = listOfItems;
	}
	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", tripDate=" + tripDate + ", shop=" + shop
				+ ", listOfItems=" + listOfItems + "]";
	} 
}
