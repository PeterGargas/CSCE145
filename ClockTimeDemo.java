import java.util.Scanner;

public class ClockTimeDemo {
    public static void main(String[] args) {
    	//Peter Gargas
    	
    	/*
		 * all the empty print statements
		 * are to give speace so everything is not squished togather
		 */
    	
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Convert military time into 12-hour clock time!!!");
            System.out.println();

            try {
                
                System.out.print("Enter the hours on the military clock (0-23): ");
                int hours = scanner.nextInt();
                
                System.out.println();
                
                System.out.print("Enter the minutes on the military clock (0-59): ");
                int minutes = scanner.nextInt();

                System.out.println();
                
                System.out.print("Enter the seconds on the military clock (0-59): ");
                int seconds = scanner.nextInt();
                
                System.out.println();

                //TimeConverter object and changes the time
                TimeConverter timeConverter = new TimeConverter();
                timeConverter.updateTime(hours, minutes, seconds);
            

                System.out.print("12-hour clock time → ");
                timeConverter.displayTime();

                System.out.println();
                
                scanner.nextLine(); 
                System.out.print("Enter 24-hour clock time in the format “hours:minutes:seconds”: ");
                String timeString = scanner.nextLine();
                
                System.out.println();

                //Makes another TimeConverter object and changes the time
                TimeConverter timeConverterString = new TimeConverter();
                timeConverterString.updateTime(timeString);

                System.out.print("12-hour clock time → ");
                timeConverterString.displayTime();
                
                System.out.println();

            } catch (TimeException e) {
                System.out.println(e.getMessage());
            }
            
            System.out.println();
            
            // Ask user if they want to repeat
            System.out.print("Would you like to do this again? Enter “Yes” or “No”: ");
            String response = scanner.nextLine().trim().toLowerCase();
            continueProgram = response.equals("yes");
        }

        System.out.println();
        
        System.out.println("Exiting the program!");
        scanner.close();
    }
}
