
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
	
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < qtyOrder; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
}
