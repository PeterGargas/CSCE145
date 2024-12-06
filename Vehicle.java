
public class Vehicle {
	
	//Peter Gargas
	
	private String ManufacturersName;
	private int numOfCylinders;
	private String ownersName;
	
	// Default Constructor
	public Vehicle() {	
		this.ManufacturersName = "unKnown";
		this.numOfCylinders = 0;
		this.ownersName = "unKnown";
	}
	
	
	// Parameterized Constructor
	public Vehicle(String xManufactrurersName, int xNumOfCylinders, String xOwnersName) {
		if (xNumOfCylinders <= 0) {
            System.out.println("Number of cylinders must be greater than 0");
        }
		this.setManufacturerName(xManufactrurersName);
		this.setNumOfCylinders(xNumOfCylinders);
		this.setOwnersName(xOwnersName);
	}
	
	//Accosser 
	public String getManufacturerName() {
		return this.ManufacturersName;
	}
	
	public int getNumOfCylinders() {
		return this.numOfCylinders;
	}
	
	public String getOwnersName() {
		return this.ownersName;
	}
	
	//mutators 
	public void setManufacturerName(String xManufactrurersName) {
		this.ManufacturersName = xManufactrurersName;
	}
	
	public void setNumOfCylinders(int xNumOfCylinders) {
		if(xNumOfCylinders > 0) {
			this.numOfCylinders = xNumOfCylinders;
		}else {
			System.out.println("Wrong value inputed");
		}
	}
	
	public void setOwnersName(String xOwnersName) {
		this.ownersName = xOwnersName;
	}
	
	//Equals method
	public boolean equals(Vehicle p) {
		return this.ManufacturersName.equals(p.getManufacturerName()) &&
				this.numOfCylinders == p.getNumOfCylinders() && this.ownersName.equals(p.getOwnersName());
	}
	
	//toString Methods 
	public String toString() {
		return "Manufacturer's name: " + this.ManufacturersName +
				"\nNumber of cylinders: " + this.numOfCylinders +
				"\nOwners name: " + this.ownersName;
	}
	
	
}

