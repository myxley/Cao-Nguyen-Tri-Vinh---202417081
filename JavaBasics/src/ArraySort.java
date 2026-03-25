import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = keyboard.nextInt();
		
		int[] arr = new int[n];	
		for(int i = 0; i < n; i++) {
			arr[i] = keyboard.nextInt(); 
		}
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		double avg = (double) sum/n;
		
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + avg);
	}
}
