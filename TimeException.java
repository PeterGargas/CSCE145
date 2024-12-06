
public class TimeException extends Exception {
	
	//Peter Gargas
	
    // Default constructor
    public TimeException() {
        super("EXCEPTION: Invalid time entered");
        System.out.println("EXCEPTION: Invalid time entered");
    }

    // Parameterized constructor
    public TimeException(String message) {
        super(message);
    }
}