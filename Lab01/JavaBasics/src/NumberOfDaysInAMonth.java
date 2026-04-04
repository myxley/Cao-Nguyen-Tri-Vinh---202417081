import java.util.Scanner;
public class NumberOfDaysInAMonth {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int year; int month;
		
		while(true) {
			System.out.print("Enter year: ");
			year = keyboard.nextInt();
			System.out.print("Enter month: ");
			month = keyboard.nextInt();
			
			if (year > 0 && month >= 1 && month <= 12) break;
			else {
				System.out.println("Invalid, enter again!\n");
			}
		}
		
		int days;
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days = 31;
				break;
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
			case 2:
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					days = 29;
				}else days = 28;
			break;
			default: days = 0;
		}
		
		System.out.println("This month has " + days + " days!");
	} 

}
