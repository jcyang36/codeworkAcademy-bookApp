/**
 * 
 */
package bookencaps;

/**
 * @author Joyce Yang
 * June 1, 2017
 * This makes a book and methods that go with it
 */
public class BookApp {

	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("The Joy Luck Club");
		b.setAuthor("Amy Tan");
		b.setDescription("A classic about four Chinese-American mothers and their daughters");
		
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getDisplayText());
		// TODO Auto-generated method stub

	}

}
