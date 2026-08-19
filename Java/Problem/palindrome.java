package firstprogram;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String reversed="";
		for(int i=str.length() -1;i>=0;i--) {
			reversed=reversed + str.charAt(i);
			
		}
		if(str.equals(reversed)) {
			System.out.println("Palindrome");
		
	    }
		else {
			System.out.println(" Not Palindrome");
			
		}
	  }	
	

}
