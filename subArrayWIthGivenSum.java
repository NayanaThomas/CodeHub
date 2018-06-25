package codeing;
/*
 *Find subarray with given sum | Set 1 (Nonnegative Numbers)
Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.

Examples :

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Ouptut: Sum found between indexes 1 and 4

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
There may be more than one subarrays with sum as the given sum. The following solutions print first such subarray.

Source: Google Interview Question


 */

public class SubArrayWIthGivenSum {
	/*
	 * Method 1
	 * Time Complexity : O(n^2) in worst case.
	 */
	/*public int[] subArraySum(int[] arr, int expSum) {
		int curr_sum = 0;
		int[] res = new int[2];
		for(int i=0;i<arr.length;i++) {
			curr_sum = arr[i];
			for(int j=i+1;j<=arr.length;j++) {
				if(curr_sum == expSum) {
					res[0] = i;
					res[1] = j-1;
				}
				if( curr_sum > expSum || j==arr.length)
					break;
				curr_sum = curr_sum+arr[j];
			}	
		}
		return res;	
	}*/
	
	public int[] subArraySum(int[] arr, int expSum) {
		int[] res = new int[2];
		int curr_sum = 0, start = 0;
		
		for(int i=0;i<arr.length;i++) {
			while(curr_sum>expSum && start<i-1) {
				curr_sum = curr_sum-arr[start];
				start++;
			}
			
			if(curr_sum == expSum) {
					res[0] = start;
					res[1] = i-1;
			}
			if(i<arr.length)
				curr_sum = curr_sum+arr[i];
		}
		return res;	
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 20, 3, 10, 5};
		int num = 33;
		SubArrayWIthGivenSum sas = new SubArrayWIthGivenSum();
		int[] resArray=sas.subArraySum(arr,num);
		System.out.println("subarray found between indexes: "+resArray[0]+" "+resArray[1]);
	}
}

