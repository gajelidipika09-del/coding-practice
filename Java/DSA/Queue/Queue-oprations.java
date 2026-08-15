package queue;

import java.util.*;


public class oprations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q =new LinkedList<>();
		int n=sc.nextInt();
		System.out.println("enter size");

		for(int i =0;i<n;i++) {
			int type=sc.nextInt();
			if(type==1) {
				int x=sc.nextInt();
				q.add(x);
			}
			else if (type==2) {
				if(q.isEmpty()) {
					System.out.println("Queue is Empty");
				}
				else {
					System.out.println(q.peek());
				}
			}
			else if(type==3) {
				if(q.isEmpty()) {
					System.out.println("Queue is Empty");
				}
				else {
					for(int val:q) {
						System.out.print(val+ " ");
						}
					System.out.println();
					}
				}
			else if(type==3) {
				if(q.isEmpty()) {
					System.out.println("Queue is Empty");
				}
				else {
					System.out.println("Queue is NOT Empty");

				}
		}
		
		
		

	}

}
}
