package hust.soict.ite6.test.store;

import hust.soict.ite6.aims.store.Store;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class StoreTest {

	public static void main(String[] args) {
		
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("");
		store.addDVD(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("");
		store.addDVD(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store.removeDVD(dvd3);
		
	}

}
