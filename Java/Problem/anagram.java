package firstprogram;

import java.util.Arrays;
import java.util.Scanner;

public class anagram{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String1");
		String str1=sc.nextLine().toLowerCase().trim();
		System.out.println("Enter a String2");
		String str2=sc.nextLine().toLowerCase().trim();
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
			
		
	}

}
