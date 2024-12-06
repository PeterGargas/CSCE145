public class Coffee {

	//Peter Gargas
	
	private String name;
	private double caffeineContent;
	
	public Coffee() {
		this.name = "none";
		this.caffeineContent = 50;
	}
	
	public Coffee(String xName, double xCaffeineContent) {
		this.setName(xName);
		this.setCaffeineContent(xCaffeineContent);
	}
	
	
//Accessor Methods
	
	public String getName() {
		return name;
	}
	
	public double getCaffeineContent() {
		return caffeineContent;
	}

//Mutator Methods
	
	public void setName(String xName) {
		name = xName;
	}
	
	public void setCaffeineContent(double xCaffeineContent) {
		if( xCaffeineContent >= 50 && xCaffeineContent <= 300) {
			caffeineContent = xCaffeineContent;
		}
	}

//Other Methods
	
	public double maxCupsOfCoffee(){
		if (this.caffeineContent == 0) {
            System.out.println("Caffeine content cannot be zero.");
            return 0; // Alternatively, you could throw an exception
        }
		
		double maxCups = (180)/((this.caffeineContent/100)*6);
		return maxCups;
	}
	
	
//Equals Method
	
	public boolean equals(Coffee c) {
		return c.getName().equals(this.name) &&
				c.getCaffeineContent() == this.caffeineContent;
	}
	

//ToString Method
	
	public String toString() {
		return "Name: " + this.name
		+ "\nCaffeine Amount: " + this.caffeineContent;
	}


}
