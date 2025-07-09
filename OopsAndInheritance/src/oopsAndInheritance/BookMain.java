package oopsAndInheritance;

class Author {
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
	}
	
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String toString() {
		return "Book Name: " + name +
            "\n" + author.toString() +
            "\nPrice: ₹" + price +
            "\nQuantity in Stock: " + qtyInStock;
	}
	
}
public class BookMain{
	public static void main(String[] args) {
		Author author=new Author("Dileep","dileep@gmail.com",'m');
		Book book=new Book("life of pie",author,599,50);
		System.out.println(book);
	}
}