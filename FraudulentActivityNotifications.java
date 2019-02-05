package codeing;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentActivityNotifications {

    // Complete the activityNotifications function below.
    public int activityNotifications(int[] expenditure, int d) {
        int[] trailing = new int[d];
        int count = 0;
        for(int i=0;i<expenditure.length-d;i++) {
        		int k=0;
            for(int j=i;j<i+d;j++) {
                
                trailing[k] = expenditure[j];
                k++;
            }
            if(expenditure[i+d]>=twiceMedian(trailing)) {
                count++;
            }
        }
        return count;
    }
     static int twiceMedian(int[] trailing) {
         Arrays.sort(trailing);
         if(trailing.length % 2 ==0) {
             int mid = trailing.length/2;
             float avg = (float)(trailing[mid-1]+trailing[mid])/2;
             return Math.round(avg*2);
         }
         else {
             return (trailing[trailing.length/2]*2);
         }
     }
         public static void main(String[] args) {
        	 	FraudulentActivityNotifications f = new FraudulentActivityNotifications();
        	 	int[] arr= {1,2,3,4,4};
        	 	System.out.println(f.activityNotifications(arr,4));
         }
         
     }