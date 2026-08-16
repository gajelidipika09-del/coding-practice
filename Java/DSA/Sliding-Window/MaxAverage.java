package SlidingWindows1;

import java.util.*;


import java.util.Scanner;

public class MaxAverage {

	public void sum1(int[] arr,int k) {
		// TODO Auto-generated method stub
		int left=0;
		int sum=0;
		int max1=0;
		double max2=0;
		double avg=0;
		
		
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			
			
			if(right-left+1==k) {
				max1=Math.max(max1, sum);
				avg=(double)sum/k;
				max2=Math.max(max2,avg);
				
				sum-=arr[left];
				left++;
				
			}
			
		}
		System.out.println(max1); 
		System.out.println(max2); 

		

	}
	
	public static void main(String args[]) {
		MaxAverage m1=new MaxAverage();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter window size");
				
		int k=sc.nextInt();
		
		int[] arr= {1,12,-5,-6,50,3};
		sc.close();
		m1.sum1(arr, k);
		
		
	}

	

}

