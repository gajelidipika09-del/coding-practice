package sorting;

public class bubblesort {
	public static void sort(int a[]) {
	    for (int i=0;i<a.length;i++) {
		    System.out.println(a[i]+" ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {2,6,8,3,6,1};
		for (int i=0;i<a.length-1;i++) {
			for (int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			}
		sort(a);


}
}
