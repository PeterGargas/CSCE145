
public class Undergradute extends Student {
	
	private String minor;
	private int level;
	
	//default constructor
	public Undergradute() {
		super();
		this.minor = "unknown";
		this.level = 1;
	}
	
	public Undergradute(String xName, int xAge, int xID, double xGPA, String xMajor, String xMinor, int xLevel) {
		super(xName, xAge, xID, xGPA, xMajor);
		this.setMinor(xMinor);
		this.setLevel(xLevel);
	}
	
	//accessors
	public String getMinor() {
		return this.minor;
	}
	
	public int getLevel() {
		return this.level;
	}

	//mutators
	public void setMinor(String xMinor) {
		if(xMinor.equalsIgnoreCase("business") || xMinor.equalsIgnoreCase("Dance") || xMinor.equalsIgnoreCase("English") || xMinor.equalsIgnoreCase("History")) {
			this.minor = xMinor;
		}else {
			System.out.println("Invalide minor!");
		}
	}
	
	public void setLevel(int xLevel) {
		if(xLevel >= 1 && xLevel <= 4) {
			this.level = xLevel;
		}else {
			System.out.println("Invalid value entered for student level");
		}
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Minor: "+this.minor + "\nStudent Level: "+this.level);
	}
	
}
