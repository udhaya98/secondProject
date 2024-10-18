package com.vechicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="carDetails")
public class Car {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String brand;
		private String colour;
		private int price;
		private String warrenty;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getWarrenty() {
			return warrenty;
		}
		public void setWarrenty(String warrenty) {
			this.warrenty = warrenty;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
}

