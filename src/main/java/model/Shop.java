package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {

	@Id 
	@GeneratedValue
	private int id; 
	private String shopName;
	
	
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(int id, String shopName) {
		super();
		this.id = id;
		this.shopName = shopName; 
		// TODO Auto-generated constructor stub
	}
	public Shop(String shopName) {
		super();
		this.shopName = shopName; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public String toString() {
		return "Shopper [id=" + id + ", shopName=" + shopName + "]";
	}
}