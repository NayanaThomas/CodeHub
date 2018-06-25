package codeing;

public class PerfectSquare {
	public boolean isPerfectSquare(int num) {
		long left =1, right = num/2;
        long mid=0;
        long nums = (long)num;
	    long midSquared = 0;
	
        if(num == 1) {
            return true;
        }
        if(num < 1 || num == Integer.MAX_VALUE) {
            return false;
        }
	    while(left<=right) {
	    		mid = (left+right)/2;
	    		midSquared = mid*mid;
	        if(midSquared == nums) {
	        		return true;
	        }
	        else if(midSquared > nums) {
	        		right = mid-1;
	        }
	        else {
	        		left = mid+1;
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		PerfectSquare gi = new PerfectSquare();
		int target = 808201;
		boolean res= gi.isPerfectSquare(target);
		System.out.print(res);
	}
}
