
public class Truck extends Vehicle {
	
	//Peter Gargas
	
    private double loadCapacity; 
    private double towingCapacity; 

    // Default Constructor
    public Truck() {
        super();
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized Constructor
    public Truck(String xManufacturerName, int xNumOfCylinders, String xOwnerName,double xLoadCapacity, double xTowingCapacity) {
        super(xManufacturerName, xNumOfCylinders, xOwnerName);
        if (xLoadCapacity < 0 || xTowingCapacity < 0) {
          System.out.println("Load and towing capacities must be nonnegative");
        }
       this.setLoadCapacity(xLoadCapacity);
       this.setTowingCapacity(xTowingCapacity);
    }

    // Accessors 
    public double getLoadCapacity() {
        return this.loadCapacity;
    }

    public double getTowingCapacity() {
        return this.towingCapacity;
    }
    
    
    //Mutator
    public void setLoadCapacity(double xLoadCapacity) {
        if (xLoadCapacity > 0) {
            this.loadCapacity = xLoadCapacity;
        }else {
            System.out.println("Load capacity must be nonnegative");

        }
    }

    public void setTowingCapacity(double xTowingCapacity) {
        if (xTowingCapacity > 0) {
        	this.towingCapacity = xTowingCapacity;
        }else {
       	 System.out.println("Towing capacity must be nonnegative");
        }
        
    }

    // equals Method
    public boolean equals(Object p) {
        if (!super.equals(p)) return false;
        Truck truck = (Truck) p;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0 &&
                Double.compare(truck.towingCapacity, towingCapacity) == 0;
    }

    // toString Method
    public String toString() {
        return super.toString() + "\n" +
                "Load Capacity: " + this.loadCapacity + "\n" +
                "Towing Capacity: " + this.towingCapacity;
    }
}
