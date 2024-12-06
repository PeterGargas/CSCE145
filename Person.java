
public class Person {

	private String name;
	private int age;
	
	public Person() {
		this.name = "unKnown";
		this.age = 1;
	}
	
	//patameterrized constructor
	public Person(String xName, int xAge) {
		this.setName(xName);
		this.setAge(xAge);
	}
	
	//accessors
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	//mutaters
	
	public void setName(String xName) {
		this.name = xName;
	}
	
	public void setAge(int xAge) {
		if(age > 0) {
			this.age = xAge;
		}else {
			this.age = 0;
		}
	}
	

	//equal method
	public boolean equals(Person p) {
		return this.name.equals(p.getName()) &&
				p.getAge() == this.age;
	}
	
	public void writeOutput() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age + " years");
	}
	/*
	//toString method
	public String toSting() {
		return "Name: " + this.name +
				"\nAge: " + this.age + " years";	
		}
	*/
}
