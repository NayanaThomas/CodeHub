package codeing;

public class peakMountainElement {
	 public int peakIndexInMountainArray(int[] A) {
	        int left = 0, right = A.length-1;
	        while(left<=right) {
	            int mid = left + (right-left)/2;
	            if (A[mid] > A[mid-1] && A[mid]>A[mid+1]) {
	                return mid;
	            }
	            else if (A[mid] > A[mid-1] && A[mid]<A[mid+1]){
	            		left = mid+1;
	            }
	            else {
	                right = mid-1;
	            }
	                
	        }
	    return left;
	    }
	 
	 	public static void main(String[] args) {
	 		peakMountainElement gi = new peakMountainElement();
			int[] target = {0,1,2,3,10,5,2,0};
			int res= gi.peakIndexInMountainArray(target);
			System.out.print(res);
		}
}
