
public class Apple {
	
	//Peter Gargas

	private String type;
	private double weight;
	private double price;
	
	public Apple() {
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.88;
	}
	
	public Apple(String xType, double xWeight, double xPrice ) {
		
		this.setType(xType);
		this.setWeight(xWeight);
		this.setPrice(xPrice);	
	}
	
	//Accessor Methods
	public String getType() {
		return this.type;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double gtPrice() {
		return this.price;
	}
	
	
	//Mutator Methods
	public void setType(String xType) {
		if(xType.equalsIgnoreCase("Red Delicious") || xType.equalsIgnoreCase("Golden Delicious") || xType.equalsIgnoreCase("Gala") || xType.equalsIgnoreCase("Granny Smith")) {
			this.type = xType;
		}else {
			System.out.println("Invailed type inputed");
			this.type = null;
		}
	}
	
	public void setWeight(double xWeight) {
		if(xWeight > 0 && xWeight < 2) {
			this.weight = xWeight;
		}else {
			System.out.println("Invaidled value inputed");
			this.weight = 0;
		}
	}
	
	public void setPrice(double xPrice) {
		if(xPrice > 0) {
			this.price = xPrice;
		}else {
			System.out.println("Invaidled value inputed");
			this.price = 0;
		}
	}
	
	//Other methods
	public void writeOutput() {
		System.out.println("Type: " + this.type + "\nWeight: " + this.weight + " kg" + "\nPrice: " + " $" + this.price ); 
	}
}
