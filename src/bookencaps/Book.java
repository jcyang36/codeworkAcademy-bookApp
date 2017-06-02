package bookencaps;



public class Book {

	
	private String author;
	private String title;
	private String description;
	private double price;
	private boolean isinStock;
	
	public Book(){
		
	};
	
	public Book(String author, String title, String description, Double price, Boolean isinStock){
		
	};
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return isinStock;
	}
	public void setisInStock(boolean isinStock) {
		this.isinStock = isinStock;
	}
	public String getDisplayText(){
		return title+ " by "+ author+ " : "+description;
	}
	public String booksPrice(int numbooks){
		if( isInStock()){
			return "Price for " + numbooks+" books is "+numbooks* getPrice();
		}
		else{
			return "No books have been found";
		}
					
	}    
}