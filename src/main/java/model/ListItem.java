 /* @author CyrusBrucker - cbrucker19
 * CIS175 - Spring 2022
 * ${date}
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ListItem {
		@Id
		@GeneratedValue
		@Column(name = "ID")
		private int id;
		@Column(name = "ITEMNUMBER")
		private String itemNumber;
		@Column(name = "ITEM")
		private String item;

		//Default no argument Contrustor
		public ListItem() {

		}
		//Constructor
		public ListItem(String itemNumber, String item) {
			this.itemNumber = itemNumber;
			this.item = item;
		}
		//Getters and Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getItemNumber() {
			return itemNumber;
		}
		public void setItemNumber(String itemNumber) {
			this.itemNumber = itemNumber;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		@Override
		public String toString() {
			return "ListItem [id=" + id + ", itemNumber=" + itemNumber + ", item=" + item + "]";
		}
		//Printing method
		public String returnItemDetails() {
			return this.itemNumber + ":" + this.item;
		}
}