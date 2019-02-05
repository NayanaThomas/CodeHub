package codeing;
/*package whatever //do not write package name here */
//Given an array of size n-1 and given that there are numbers 
//from 1 to n with one missing, the missing number is to be found.
import java.util.*;
import java.io.*;

class missingNumber {
	public static void main (String[] args) {
		missingNumber g=new missingNumber();
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
	        while(j<length1-1) {
	            arr[j] = Integer.parseInt(s.next());
	            j++;
	        }
	        i++;
	        g.findMissing(arr,length1-1);
	    }
    }
    public void findMissing(int[] a, int n) {
       int x1 = a[0]; 
        int x2 = 1; 
         
        /* For xor of all the elements 
           in array */
        for (int i = 1; i < n; i++) {
            x1 = x1 ^ a[i];
              }
            
                 
        /* For xor of all the elements 
           from 1 to n+1 */        
        for (int i = 2; i <= n+1; i++) {
            x2 = x2 ^ i;       
             }
         
        System.out.println ((x1 ^ x2));
    }
}