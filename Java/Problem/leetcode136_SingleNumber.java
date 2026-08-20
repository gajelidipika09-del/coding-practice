package firstprogram;

public class leetcode136_SingleNumber {
	

	    public static int singleNumber(int[] nums) {

	        int result = 0;

	        for (int num : nums) {
	            result = result ^ num;
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        int[] nums = {4, 1, 2, 1, 2};

	        int result = singleNumber(nums);

	        System.out.println("Single Number: " + result);
	    }
	}


