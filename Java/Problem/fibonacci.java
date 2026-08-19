/* wap to print fibonacci series of n terms where n is input by user 0,1,1,2,3,5,8,13,24...
 * in fibonacci no series is a no is the sum of two previous 2 number that came before it*/
 
package fuctionprogram;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int n = 10;        // number of Fibonacci terms
		        int[] a = new int[n];

		        a[0] = 0;
		        a[1] = 1;

		        for(int i = 0; i < n-2; i++) {
		            a[i+2] = a[i] + a[i+1];
		        }

		        System.out.println("Fibonacci Series:");

		        for(int i = 0; i < n; i++) {
		            System.out.print(a[i] + " ");
		        }
		    }
		}

	


