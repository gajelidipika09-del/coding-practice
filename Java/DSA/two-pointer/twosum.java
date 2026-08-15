package twoPointer;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,5,4,2,3,7};
		int sum=6;
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum)
					System.out.printf("{%d,%d}",i,j);
			}
			
		}

	}

}
