package queue;
import java.util.*;

public class queueusingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your size");

		int n=sc.nextInt();
		int [] q=new int[n];
		int rear=-1,front=0;
		do {
			System.out.println("1 Insert");
			System.out.println("2 Delete");
			System.out.println("3 Display");
			System.out.println("enter your chioce");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				if(rear==q.length-1) {
					System.out.print("Queue is full");
					}
				else {
					System.out.print("enter the elements");
					int value=sc.nextInt();
					rear=rear+1;
					q[rear]=value;
				}
				break;
			case 2:
				if((front==0 && rear==-1 )||front==rear+1) {
					System.out.print("queue is empty");
				}
				else {
					int value=q[front];
					front=front+1;
					System.out.print("delete values are"+value);
					
					
				}
				break;
			case 3:
				if((front==0 && rear==-1 )||front==rear+1) {
					System.out.print("queue is empty");
				}
				else {
					for (int i=front;i<=rear;i++) {
						System.out.println( q[i]);
						
					}
				}
				break;
			default:
				System.out.println("enter correct choice");

			}

		} while(true);

	}

}
