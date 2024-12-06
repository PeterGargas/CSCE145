import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		//Peter Gargas
		
		/*
		 * All empty print statements 
		 * are for specing so the user can 
		 * have better understand of how to use the 
		 * program
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		Apple a1 = new Apple();
		Apple a2 = new Apple("Granny Smith", 0.7,1.45);
		
		//first apple printing 
		System.out.println("Welcome to the Apple tester!!!");
		System.out.println();
		System.out.println("Creating the first apple object!");
		System.out.println();
		System.out.println("Default values of the first appple object");
		a1.writeOutput();
		
		System.out.println();
		
		//asking the user for the information about the second apple and storing it 
		System.out.println("Enter the type of the second apple object:");
		String type = sc.nextLine();
		a2.setType(type);
		System.out.println("Enter the weight of the second apple object:");
		double weight = sc.nextDouble();
		a2.setWeight(weight);
		System.out.println("Enter the price of the second apple object:");
		double price = sc.nextDouble();
		a2.setPrice(price);
		
		System.out.println();
		
		//Printing the second apple
		System.out.println("Creating the Second apple object!");
		System.out.println();
		System.out.println("values of the second appple object");
		a2.writeOutput();
		
	}
}
