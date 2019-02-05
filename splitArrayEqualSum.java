package codeing;

//java program to split an array 
//into Two equal sum subarrays
import java.io.*;

class splitArrayEqualSum {

	// Returns split point. If not possible, then
	// return -1.
	static int findSplitPoint(int arr[], int n)
	{
	    int leftSum = 0, rightSum = 0;
	    for(int i=0;i<n;i++) {
	        leftSum+= arr[i];
	    }
	    for(int i=n-1;i>=0;i--) {
	        rightSum+= arr[i];
	        leftSum = leftSum - arr[i];
	        if(rightSum == leftSum) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	static void printTwoParts(int[] arr, int n) {
	    int splitPoint = findSplitPoint(arr,n);
	    if( splitPoint == -1 || splitPoint == n) {
	        System.out.println("Cannot split with equal sum");
	        
	   }
	   else {
	       for(int i=0;i<splitPoint;i++) {
	           System.out.print(arr[i]+" ");
	       }
	       
	       System.out.println();
	       for(int i=splitPoint;i<n;i++) {
	           System.out.print(arr[i]+" ");
	       }
	   }
	}

	// Driver program
	public static void main (String[] args) {
	
	int arr[] = {1 , 2 , 3 , 4 , 5 , 5 };
	int n = arr.length;
	
	printTwoParts(arr, n);
		
	}
}

//This code is contributed by vt_m
