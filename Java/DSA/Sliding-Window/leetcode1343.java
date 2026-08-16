package SlidingWindows1;
import java.util.Scanner;
public class leetcode1343 {
     public void countSubarrays(int[] arr, int k, int threshold) {

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            if (right - left + 1 == k) {

                if (sum >= threshold * k) {
                    count++;
                }

                sum -= arr[left];
                left++;
            }
        }

        System.out.println("Number of valid subarrays: " + count);
    }

    public static void main(String args[]) {

        leetcode1343 n1 = new leetcode1343();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter window size:");
        int k = sc.nextInt();

        System.out.println("Enter threshold:");
        int threshold = sc.nextInt();

        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};

        n1.countSubarrays(arr, k, threshold);

        sc.close();
    }
}


