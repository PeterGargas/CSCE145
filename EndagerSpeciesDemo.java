
public class EndagerSpeciesDemo {

	public static void main(String[] args) {

		EndagerdSpeciesOne sp1 = new EndagerdSpeciesOne();
		
		sp1.readInput();
		
		sp1.writeOutput();
		
		int output = sp1.getPopulationIn10();
		
		System.out.println("THe population of the species in the next 10 year will be " + output);
		
		EndagerdSpeciesOne sp2 = new EndagerdSpeciesOne();
		
		sp2.name = "Eagle";
		sp2.population = 1000;
		sp2.growthRate = 5;
		
		sp2.writeOutput();
	}

}
