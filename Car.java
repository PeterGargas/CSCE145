
public class Car extends Vehicle {
	
	//Peter Gargas
	
    private double gasMileage; 
    private int numberOfPassengers;

    // Default Constructor
    public Car() {
        super();
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized Constructor
    public Car(String xManufactrurersName, int xNumOfCylinders, String xOwnersName,double xGasMileage, int xNumberOfPassengers) {
        super(xManufactrurersName, xNumOfCylinders, xOwnersName);
        if (xGasMileage < 0 || xNumberOfPassengers < 0) {
        	System.out.println("Gas mileage and number of passengers must be nonnegative");
        }
        this.setGasMileage(xGasMileage);
        this.setNumberOfPassengers(xNumberOfPassengers);
        
    }

    // Accessors 
    public double getGasMileage() {
        return this.gasMileage;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    
    //Mutators
    public void setGasMileage(double xGasMileage) {
        if (xGasMileage > 0) {
        	this.gasMileage = xGasMileage;
        }else {
        	System.out.println("Gas mileage must be nonnegative");
        }
        
    }
    
    public void setNumberOfPassengers(int xNumberOfPassengers) {
        if (xNumberOfPassengers > 0) {
        	this.numberOfPassengers = xNumberOfPassengers;
        }else {
            System.out.println("Number of passengers must be nonnegative");
        }
        
    }

    // equals Method
    public boolean equals(Object p) {
        if (!super.equals(p)) return false;
        Car car = (Car) p;
        return Double.compare(car.gasMileage, gasMileage) == 0 &&
                numberOfPassengers == car.numberOfPassengers;
    }

    // toString Method
    public String toString() {
        return super.toString() + "\n" +
                "Gas Mileage: " + this.gasMileage + " gallons\n" +
                "Number of Passengers: " + this.numberOfPassengers;
    }
}
