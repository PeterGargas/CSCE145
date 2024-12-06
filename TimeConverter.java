
public class TimeConverter {
   
	//Peter Gargas
	
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM; // true for AM, false for PM

    // Default constructor
    public TimeConverter() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true; // Assume AM by default
    }

    // Parameterized constructor
    public TimeConverter(int xHoura, int xMinutes, int xSeconds) throws TimeException {
        setHours(xHoura);
        setMinutes(xMinutes);
        setSeconds(xSeconds);
        this.notPM = xHoura < 12; 
    }

    // Accessor methods
    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public boolean isNotPM() {
        return this.notPM;
    }

    // Mutator methods 
    public void setHours(int xHours) {
        if (xHours >= 0 && xHours <= 23) {
            this.hours = xHours;
            this.notPM = xHours < 12;
        } else {
            System.out.println("Invalid value iputed");
        }
    }

    public void setMinutes(int xMinutes) throws TimeException {
        if (xMinutes >= 0 && xMinutes <= 59) {
            this.minutes = xMinutes;
        } else {
        	 System.out.println("Invalid value iputed");        }
    }

    public void setSeconds(int xSeconds) throws TimeException {
        if (xSeconds >= 0 && xSeconds <= 59) {
            this.seconds = xSeconds;
        } else {
        	 System.out.println("Invalid value iputed");        }
    }

    // updateTime method to convert to 12 format
    public void updateTime(int xHours, int xMinutes, int xSeconds) throws TimeException {
        setHours(xHours);
        setMinutes(xMinutes);
        setSeconds(xSeconds);

        // Convert 24-hour to 12-hour format
        if (this.hours == 0) {
            this.hours = 12; // Midnight is 12 AM
            this.notPM = true;
        } else if (this.hours == 12) {
            this.notPM = false; // Noon is 12 PM
        } else if (this.hours > 12) {
            this.hours -= 12;
            this.notPM = false;
        }
    }

    // updateTime with String 
    public void updateTime(String time) throws TimeException {
        try {
            // Split the input string into hours, minutes, and seconds
            String[] parts = time.split(":");
            if (parts.length != 3) {
            	 System.out.println("EXCEPTION: Invalid time entered!");            }

            // Parse the string values to integers
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            // Call the other updateTime method to set the time and handle validation
            updateTime(hours, minutes, seconds);
        } catch (NumberFormatException e) {
        	 System.out.println("EXCEPTION: Invalid time entered!");        }
    }

    // Method to display time in 12 format
    public void displayTime() {
        String period = notPM ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s\n", hours, minutes, seconds, period);
    }

    
}
