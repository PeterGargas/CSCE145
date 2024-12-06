
public class Book {

	private String title;
	private String author;
	private double price;
	
	public Book() {
		this.title = "unKnown";
		this.author = "anonymous";
		this.price = 0;
	}
	
	public Book(String xTItle, String xAuthor, double xPrice) {
		//to do 
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setTitle(String xTitle) {
		this.title = xTitle;
	}
	
	public void setAuthor(String xAuthor) {
		this.author = xAuthor;
	}
	
	public void setPrice(double xPrice) {
		if(xPrice > 0) {
			this.price = xPrice;
		}	
	}
	
	public boolean equals(Book bk) {
		
		return this.title.equalsIgnoreCase(bk.getTitle()) &&
				this.author.equalsIgnoreCase(bk.getAuthor()) &&
				this.price == bk.getPrice();
	}
	
	public String toString() {
		
		return "Book TItle: "+this.title
				+"\nAuthor: "+this.author
				+"\nPrince: "+this.price;
	}
	
}
