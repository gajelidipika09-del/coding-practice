package librarypack;

public class Book {
	private int bookid;
	private String bname;
	private String author;
	private int price;
	
	Book(int bookid,String bname,String author,int price) {
		this.bookid=bookid;
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
	public void setbookid(int bookid) {
		this.bookid=bookid;
	}
	public int getbookid() {
		return bookid;
	}
	public void setbname(String bname) {
		this.bname=bname;
	}
	public String getbname() {
		return bname;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public String getauthor() {
		return author;
		
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
public void display() {
		
		System.out.println("Book id is" +bookid);
		System.out.println("Book Name is" +bname);
		System.out.println("author name is" +author);
		System.out.println("price of book is" +price);
		
	}

}
