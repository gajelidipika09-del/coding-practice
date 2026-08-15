package librarypack;

import java.time.LocalDate;

public class Library {
	private LocalDate issuedate;
	private LocalDate returndate;
	
	// HAS-A relationship
    private Book book;
    private Student student;
    
    
    public Library(LocalDate issuedate,LocalDate returndate,Book book,Student student) {
    	this.issuedate=issuedate;
    	this.returndate=returndate;
    	this.book=book;
    	this.student=student;
    	
    }
	public LocalDate getIssuedate() {
		return issuedate;
	}


	public void setIssuedate(LocalDate issuedate) {
		this.issuedate = issuedate;
	}


	public LocalDate getReturndate() {
		return returndate;
	}


	public void setReturndate(LocalDate returndate) {
		this.returndate = returndate;
	}
 
	public void IsssueBook() {
		System.out.println("book get issue on " +issuedate );
	}
	
	public void returnBook() {
		System.out.println("returnBook date is" +returndate);
	}
	
	public void diaplayBook() {
		
		System.out.println("Book Detail are");
		book.display();
		System.out.println("----------------------------------------------------------");
		System.out.println("student Detail are");
		student.display();
		System.out.println("-----------------------------------------------------------");
		
	}
	public Book getBook() {
		return book;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public static void main(String args[]) {
		//book constructor
		Book b1=new Book(
				23,
				"peer-e-kamil",
				"umeer ahmehd",
				250);
		Student s1=new Student(
				453,
				"Dipika");
		Library l1=new Library(LocalDate.of(2024, 1, 12),
			    LocalDate.of(2024, 5, 13),
				b1,
				s1);
	
		l1.IsssueBook();
		l1.returnBook();
		System.out.println("-----------------------------------------------------------");
		l1.diaplayBook();
		l1.getBook();
		
		
		//runtime polymorphism
		
		
	}
	
}
