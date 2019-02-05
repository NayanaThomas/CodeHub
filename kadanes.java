package codeing;

import java.util.*;

class kadanes {
	public static void main (String[] args) {
		kadanes g = new kadanes();
		Scanner s = new Scanner(System.in);
	    int testCases = s.nextInt();
	    int i=0;
	    while(i<testCases) {
	        String len1 = s.next();
	        int length1 = Integer.parseInt(len1);
	        if(length1 == 0) {
	            System.out.println("0");
	            return;
	        }
	        int j=0;
	        int[] arr = new int[length1];
	        while(j<length1) {
	            arr[j] = Integer.parseInt(s.next());
	            j++;
	        }
	        i++;
	        g.kadanesALgo(arr);
	    }
	    return;
	}
	public void kadanesALgo(int[] arr) {
	    int maxSum = arr[0];
	    int curSum = arr[0];
	    for(int i=1;i<arr.length;i++) {
	        curSum=Math.max(arr[i],curSum+arr[i]);
	        maxSum = Math.max(maxSum, curSum);
	    }
	    System.out.println(maxSum);
	    
	}
}

