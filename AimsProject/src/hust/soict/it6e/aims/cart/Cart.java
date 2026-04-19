package hust.soict.it6e.aims.cart;

import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrder = 0;
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrder >= MAX_NUMBERS_ORDERED) {
			System.out.println("Cart is full");
			return;
		}
		
		itemsOrdered[qtyOrder] = disc;
		qtyOrder++;
		System.out.println("The disc has been added!");
		if(qtyOrder == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full!");
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrder; i++) {
			if(itemsOrdered[i] == disc) {
				for(int j = i + 1; j < qtyOrder; j++) {
					itemsOrdered[j - 1] = itemsOrdered[j];
				}
				qtyOrder--;
				System.out.println("The disc has been removed!");
				return;
			}
		}
		
		System.out.println("The disc is not in the cart!");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for(int i = 0; i < dvdList.length; i++) {
			if(qtyOrder >= MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is already full!");
				return;
			}
			
			itemsOrdered[qtyOrder] = dvdList[i];
			qtyOrder++;
			System.out.println("The disc has been added");
			if(qtyOrder == MAX_NUMBERS_ORDERED) System.out.println("The cart is full!");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(qtyOrder >= MAX_NUMBERS_ORDERED) System.out.println("The cart is already full!");
		itemsOrdered[qtyOrder] = dvd1;
		qtyOrder++;
		itemsOrdered[qtyOrder] = dvd2;
		qtyOrder++;
		if(qtyOrder == MAX_NUMBERS_ORDERED) System.out.println("The cart is full!");
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < qtyOrder; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 1; i < qtyOrder; i++) {
			String s = itemsOrdered[i].toString();
			System.out.println(i + 1 + ". " + s);
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public void SearchById(int id) {
		boolean found  = false;
		for(int i = 0; i < qtyOrder; i++) {
			if(itemsOrdered[i].getId() == id) {
				System.out.println("Found match: " + itemsOrdered[i].toString());
				found = true;
				break;
			}
		}
		if(!found) System.out.println("No DVD found with ID " + id);
	}
}
