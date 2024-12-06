import java.util.Scanner;
public class EndagerdSpeciesOne {
	
		public String name;
		public int population;
		public double growthRate;
		
		public void readInput() {
			Scanner key = new Scanner(System.in);
			
			System.out.println("Enter the name of the species: ");
			name = key.nextLine();
			
			System.out.println("Enter the population: ");
			population = key.nextInt();
			
			System.out.println("What is its growth rate? ");
			growthRate = key.nextDouble();
		}
		
		public void writeOutput() {
			System.out.println("Species: " + name + "\nPopulation:  " + population + "\nGrowth Rate: " + growthRate+ "%'");
		}
		
		public int getPopulationIn10() {
			int count = 10;
			double populationAmount = population;
			int result = 0;
			
			while(count > 0 && populationAmount > 0) {
				populationAmount += populationAmount * (growthRate/100);
				count--;
			}
			
			
			if(populationAmount > 0) {
				result = (int)populationAmount;
			}
			
			return result;
			
		}

}
