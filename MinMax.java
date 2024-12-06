import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		
		int size = key.nextInt();
		int [] myArray = new int[size];
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Enter the value of the arry at index " + i + " ");
			myArray[i] = key.nextInt();
		}
		
		double sum = 0;
		int min = myArray[0];
		int max = myArray[0];
		
		for(int i = 0; i < myArray.length; i++) {
			
			if(myArray[i] < min) {
				min = myArray[i];
			}else if(myArray[i] > max) {
				max = myArray[i];
			}
			
			sum += myArray[i];
		}
		
		double avg = sum /size;
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Avg: " + avg);
	}

}
