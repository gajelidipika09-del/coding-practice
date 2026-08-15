package librarypack;

public class Student {
	private int studentid;
	private String studentName;
	
	Student(int studentid,String studentName){
		this.studentid=studentid;
		this.studentName=studentName;
		
	}
	
	public void setstudentid(int studentid) {
		this.studentid=studentid;
	}
	public int getstudentid() {
		return studentid;
	}
	public void setstudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getstudentName() {
		return studentName;
	}
	
	
	public void display() {
		
		System.out.println("studentid is" +studentid);
		System.out.println("student Name is" +studentName);
		
	}

}
