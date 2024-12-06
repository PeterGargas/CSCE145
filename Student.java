
public class Student extends Person {

	private int studentID;
	private double gpa;
	private String major;
	
	//default constructor
	public Student() {
		super();     // calls the Person's default constructor
		this.studentID = 0;
		this.gpa = 0.0;
		this.major= "unkown";
	}
	
	public Student(String xName, int xAge, int xID, double xGPA, String XMajor) {
		super(xName,xAge);
		this.setID(xID);
		this.setGPA(xGPA);
		this.setMajor(XMajor);
	}
	
	//accouser methods
	public int getID() {
		return this.studentID;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	//Mutater methods
	
	public void setID(int xID) {
		if(xID >= 0) {
			this.studentID = xID;
		}else {
			System.out.println("Invalid value for Student ID!");
		}
	}
	
	public void setGPA(double xGPA) {
		if(xGPA >=1 && xGPA <= 4) {
			this.gpa = xGPA;
		}else {
			System.out.println("Invalid value for Student GPA!");
		}
	}
	
	public void setMajor(String xMajor) {
		if(xMajor.equalsIgnoreCase("Compuet Science") ||xMajor.equalsIgnoreCase("Compuet Iformation Systems") || xMajor.equalsIgnoreCase("Compuet Engineering") || xMajor.equalsIgnoreCase("Nusing") || xMajor.equalsIgnoreCase("Psychology")) {
			this.major = xMajor;
		}else {
			System.out.println("INvalid major selected!");
		}
		
	}
	
	
	//method overriding - same method signature but different methodality
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student ID: "+this.studentID + "\nGPA: "+this.gpa + "\nMajor: "+this.major);
	}
	
}
