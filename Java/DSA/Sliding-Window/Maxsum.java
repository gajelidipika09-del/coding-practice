package SlidingWindows1;
import java.util.*;


import java.util.Scanner;

public class Maxsum {

	public void sum1(int[] arr,int k) {
		// TODO Auto-generated method stub
		int left=0;
		int sum=0;
		int max=0;
		
		
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			
			if(right-left+1==k) {
				max=Math.max(max, sum);
				
				sum-=arr[left];
				left++;
				
			}
			
		}
		System.out.println(max); 

	}
	
	public static void main(String args[]) {
		Maxsum m1=new Maxsum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter window size");
				
		int k=sc.nextInt();
		
		int[] arr= {1,12,-5,-6,50,3};
		sc.close();
		m1.sum1(arr, k);
		
		
	}

	

}
