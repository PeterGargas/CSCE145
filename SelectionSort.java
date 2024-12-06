import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("How many number would you like to sort? ");
		
		int size = key.nextInt();
		
		//creating an array
		int [] myArray = new int[size];
		
		//Storing user input
		for ( int i = 0; i < myArray.length; i ++) {
			System.out.println("Enter the value of the array at index " + i + ":");
			
			myArray[i] = key.nextInt();		
		}
		
		//Selection sort
		for(int i = 0; i < myArray.length; i++) {
			int minIndex = i;
			int smallest = myArray[i];
			
			for (int j = i+1 ; j < myArray.length; j++) {
				if(myArray[j] < smallest) {
					smallest = myArray[j];
					minIndex = j;
					
				}
			}
			
			if(smallest < myArray[i]) {
				int temp = myArray[i];
				myArray[i] = myArray[minIndex];
				myArray[minIndex] = temp;
			}
		}
		
		//print the contents of my array
		
		for(int i =0; i < myArray.length; i ++) {
			System.out.print(myArray[i] + " ");
		}
		
		
		
		
	}

}
