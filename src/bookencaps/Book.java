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
	public boolean isIsinStock() {
		return isinStock;
	}
	public void setIsinStock(boolean isinStock) {
		this.isinStock = isinStock;
	}
	public String getDisplayText(){
		return title+ " by "+ author+ " : "+description;
	}
}
