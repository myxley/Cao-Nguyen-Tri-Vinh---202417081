package hust.soict.ite6.aims.store;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Store {
	
	public static final int MAX_NUMBERED_STORE = 3000;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERED_STORE];
	private int qtyInStore = 0;
		
	public void addDVD(DigitalVideoDisc dvd) {
		if(qtyInStore < itemsInStore.length) {
			itemsInStore[qtyInStore] = dvd;
			qtyInStore++;
			System.out.println("The DVD has been added to store!");
		} else {
			System.out.println("The store is already full.");
		}
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		for(int i = 0; i < qtyInStore; i++) {
			if(itemsInStore[i] == dvd) {
				for(int j = i + 1; j < qtyInStore; j++) {
					itemsInStore[j - 1] = itemsInStore[j];
				}
				qtyInStore--;
				System.out.println("The disc has been removed.");
				return;
			}
		}
	}
}

