
public class Concert {

	//Peter Gargas
	
	private String bandName;
	private int capacity;
	private int numOfTicketsSoldByPhone;
	private int numOfTicketsSoldAtTheVenue;
	private double priceByPhone;
	private double priceByVenue;
	
	public Concert() {
		 bandName = "unknown";
		 capacity = 0;
		 numOfTicketsSoldByPhone = 0;
		 numOfTicketsSoldAtTheVenue = 0;
		 priceByPhone = 0;
		 priceByVenue = 0;
	}
	
	public Concert(String xbandName, int xCapacity, double xPriceByPhone,  double xPriceByVenue ) {
		this.setBandName(xbandName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceByVenue);
		
	}
	
	public Concert(String xbandName, int xCapacity, int xNumOfTicketsSoldByPhone, int xNumOfTicketsSoldAtTheVenue, double xPriceByPhone,  double xPriceByVenue  ) {
		this.setBandName(xbandName);
		this.setCapacity(xCapacity);
		this.setNumOfTicketsSoldByPhone(xNumOfTicketsSoldByPhone);
		this.setNumOfTicketsSoldAtTheVenue(xNumOfTicketsSoldAtTheVenue);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceByVenue);
	}
	
	//Accosser Methods
	
	
	public String getBandName() {
		return this.bandName;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public double getPriceByPhone() {
		return this.priceByPhone;
	}
	
	public double getPriceByVenue() {
		return this.priceByVenue;
	}
	
	public int getNumTicketsSoldByPhone() {
		return this.numOfTicketsSoldByPhone;
	}
	
	public int getNumTicketsSoldAtVenue() {
		return this.numOfTicketsSoldAtTheVenue; 
	}
	
	//Mutator Methods
	public void setBandName(String xBandName) {
		this.bandName = xBandName;
	}
	
	public void setCapacity(int xCapacity) {
		if(xCapacity > 0) {
			this.capacity = xCapacity;
		}else {
			System.out.println("Wrong value inputed");
		}
		
	}
	
	public void setPriceByPhone(double xPriceByPhone) {
		if(xPriceByPhone >= 0) {
			this.priceByPhone = xPriceByPhone;
		}else {
			System.out.println("Wrong value inputed");
		}
	}
	
	public void setPriceAtVenue(double xPriveAtVenue) {
		if(xPriveAtVenue >= 0) {
			this.priceByVenue = xPriveAtVenue;
		}else {
			System.out.println("Wrong value inputed");
		}
	}
	
	public void setNumOfTicketsSoldByPhone(int XnumOfTicketsSoldByPhone) {
		if(XnumOfTicketsSoldByPhone >= 0) {
			this.numOfTicketsSoldByPhone = XnumOfTicketsSoldByPhone;
		}else {
			System.out.println("Wrong value inputed");
		}
	}
	
	public void setNumOfTicketsSoldAtTheVenue(int XnumOfTicksSoldAtTheVenue) {
		if(XnumOfTicksSoldAtTheVenue >= 0) {
			this.numOfTicketsSoldAtTheVenue = XnumOfTicksSoldAtTheVenue;
		}else {
			System.out.println("Wrong value inputed");
		}
	}

	//Other Methods
	public int totalNumberOfTicketsSold() {
		return this.numOfTicketsSoldAtTheVenue + this.numOfTicketsSoldByPhone;
	}
	
	public int ticketsRemaining() {
		return this.capacity - totalNumberOfTicketsSold();
	}
	
	public void buyTicketsAtVenue(int numTicketsBoughtAtVenue) {
		this.numOfTicketsSoldAtTheVenue += numTicketsBoughtAtVenue;
	}
	
	public void buyTicketsByPhone(int numTicketsBoughtByPhone) {
		this.numOfTicketsSoldByPhone += numTicketsBoughtByPhone;
	}
	
	public double totalSales() {
		return (this.priceByVenue * this.numOfTicketsSoldAtTheVenue) + (this.priceByPhone * this.numOfTicketsSoldByPhone);
	}
	
	
}
