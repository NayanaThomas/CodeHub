package codeing;

import java.util.Arrays;
import java.util.HashSet;

public class tripletSum {
	// program to find triplets in a given
	// array whose sum is zero
	 
	//with sorting
	// function to print triplets with 0 sum 
	/*void findTriplets(int arr[], int n) {
	    boolean found = false;
	    Arrays.sort(arr);
	    for (int i=0; i<n-1; i++) {
	        int l = i + 1;
	        int r = n - 1;
	        int x = arr[i];
	        while (l < r) {
	            if (x + arr[l] + arr[r] == 0) {
	                System.out.println(x+" "+ arr[l]+" "+ arr[r]);
	                l++;
	                r--;
	                found = true;
	            }
	            	else if (x + arr[l] + arr[r] < 0)
	                l++;
	            	else
	                r--;
	        }
	    }
	    if (found == false)
	        System.out.println( " No Triplet Found" );
	}
	 */
	void findTriplets(int arr[], int n) {
		HashSet<Integer> map = new HashSet<Integer>();
		boolean found = false;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1; j<n;j++) {
				if(map.contains(-(arr[i]+arr[j])) && i!=j) {
					System.out.println(-(arr[i]+arr[j])+" "+ arr[i]+" "+ arr[j]);
					found = true;
				}
				else {
					map.add(arr[j]);
				}
			}
		}
		if(found == false) {
			System.out.println("No triplets found");
		}
	}
	// Driven source
	public static void main(String[] args) {
		tripletSum t = new tripletSum();
	    int arr[] = {-4,-2,4};
	    int n = arr.length;
	    t.findTriplets(arr, n);
	}
}
