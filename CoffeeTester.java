import java.util.Scanner;
public class CoffeeTester {
	
	public static void main(String[] args) {
		//Peter Gargas
		
		/*
		 * all the empty print statements
		 * are to give speace so everything is not squished togather
		 */
		
		Scanner sc = new Scanner(System.in);
		String restart = "";
		Boolean same = false;
		
		// Using do loop so we can run the program agine if the user wants to restart the program.
		do {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee();
		
		/*
		 * This block of code askes the user for the information for coffee one
		 * it also sets the name and the caffeine content for the coffee
		 * it also prints the coffee information 
		 * it also prints the max cups you can have in hour
		 */
		System.out.println("what is the coffeine content in the first coffee");
		double caffeineContent1 = sc.nextDouble();
		System.out.println("What is the name of the coffee for the first coffee ");
		String name1 = sc.next();
		c1.setCaffeineContent(caffeineContent1);
		c1.setName(name1);
		System.out.println();
		System.out.println(c1.toString());
		System.out.println("It would take: " + c1.maxCupsOfCoffee() + " cups of " + c1.getName() + " before it’s dangerous to drink more.");
		
		System.out.println();
		
		/*
		 * This block of code askes the user for the information for coffee two
		 * it also sets the name and the caffeine content for the coffee
		 * it also prints the coffee information 
		 * it also prints the max cups you can have in hour
		 */
		System.out.println("what is the coffeine content in the second coffee");
		double caffeineContent2 = sc.nextDouble();
		System.out.println("What is the name of the coffee for the Second coffee ");
		String name2 = sc.next();
		c2.setCaffeineContent(caffeineContent2);
		c2.setName(name2);
		System.out.println();
		System.out.println(c2.toString());
		System.out.println("It would take: " + c2.maxCupsOfCoffee() + " cups of " + c2.getName() + " before it’s dangerous to drink more.");
	
		System.out.println();
		
		//this is checking if the two coffees are the same
		if(c1.equals(c2)) {
			same = true;
			System.out.println("Are both coffees's the same? " + same);
		}else {
			same = false;
			System.out.println("Are both coffees's the same? " + same);
		}
		
	
		System.out.println();
		
		
		//asking if the user want to run this program agine.
		System.out.println(" Do you want to create more coffee objects? Enter Yes or No");
		restart = sc.next();
		
		if(restart.equalsIgnoreCase("no")) {
			System.out.println("thank you for using the program. Exting program!!!");
			System.exit(0);
		}
		
		}while(restart.equalsIgnoreCase("yes"));
		
		sc.close();
	}
	
	
	
	
	
	
}
