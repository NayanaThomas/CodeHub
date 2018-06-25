package codeing;

import java.util.Arrays;

class longestIncreasingSubSeq
{
	public int LongestIncreasingSubsequenceLength(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		int n = arr.length;
		int[] count = new int[n];
		int max = 1;
		for(int i=0;i<n;i++) {
			count[i] = 1;
		    	for(int j=0;j<i;j++) {
		    		if(arr[j] < arr[i]) {
		    			count[i] = Math.max(count[i], count[j] + 1);
		    			max = Math.max(max, count[i]);
		    		}
		    	}
		}
		int finMax = max;
		for(int it=0;it<n;it++) {
			System.out.print(" "+count[it]);
		}
		System.out.println();
		//print array
		int k =n-1;
		
		for(int it=n-1;it>0;it--) {
			while(count[k]!=max && max>= 0) {
				if(k > 0)
					k--;
			}
			System.out.print(" "+arr[k]);
			
			it=k;
    			max--;
    	}
		System.out.println();
		return finMax;			    	
	}/*
	 public int LongestIncreasingSubsequenceLength(int[] nums) {
		 int[] dp = new int[nums.length];
		 int len = 0;
		 for (int num : nums) {
			 int i = Arrays.binarySearch(dp, 0, len, num);
			 if (i < 0) {
				 i = -(i + 1);
			 }
			 dp[i] = num;
			 if (i == len) {
				 len++;
			 }
		 }
		 for(int i=0;i<len;i++) {
			 System.out.println(dp[i]);
		 }
		 return len;
		 
	/*AMAL BRO APPROACH
	 * if(nums.length == 0) {
		return 0;
	}
	int n = nums.length;
	int[] count = new int[n];
    int cn = 0;
    count[0] = nums[0];
    for(int i=1;i<n;i++) {
        if((nums[i] > count[cn]) && (cn < n))
        {
            count[++cn] = nums[i];
        }
        else if(nums[i] < count[cn]) {
            if(cn > 0) {
                if (count[cn-1] < nums[i]) {
                    count[cn] = nums[i];
                }
            }
            if(cn == 0) {
                count[cn] = nums[i];
            }
            
        }
    }
    return ++cn;*/
	// }
	
		 
	// Driver program to test above function
	public static void main(String[] args)
	{
		longestIncreasingSubSeq ss = new longestIncreasingSubSeq();
		int A[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		for(int it=0;it<A.length;it++) {
			System.out.print(" "+A[it]);
			
		}
		System.out.println();
		//p
		System.out.println("Length of Longest Increasing Subsequence is "+
		                            ss.LongestIncreasingSubsequenceLength(A));
	}
}
