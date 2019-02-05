package codeing;

/*package whatever //do not write package name here */

//You are given weights and values of N items, put these items in a knapsack of capacity W 
//to get the maximum total value in the knapsack. Note that we have only one quantity of each item, 
//In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and 
//weights associated with N items respectively. Also given an integer W which represents knapsack 
//capacity, find out the maximum value subset of val[] such that sum of the weights of this subset 
//is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick 
//it (0-1 property).

import java.util.*;

class knapSack {
	public static void main (String[] args) {
		knapSack g = new knapSack();
		Scanner s = new Scanner(System.in);
	    int testCases = s.nextInt();
	    int i=0;
	    while(i<testCases) {
	        //System.out.println(s.next());
	        //System.out.println(s.next());
	        String len1 = s.next();
	        //System.out.println(len1);
	        String maxWt = s.next();
	       // System.out.println(len2);
	        int length1 = Integer.parseInt(len1);
	        int maxCapacity =Integer.parseInt(maxWt);
	        if(length1 == 0 || maxCapacity == 0) {
	            System.out.println("0");
	            return;
	        }
	        int[] val = new int[length1];
	        int[] wt = new int[length1];
	        for(int ij=0;ij<length1;ij++) {
	            val[ij] = Integer.parseInt(s.next());
	        }
	        for(int ij=0;ij<length1;ij++) {
	            wt[ij] = Integer.parseInt(s.next());
	        }
	        i++;
	        g.knapsack(val, wt, maxCapacity);
	    }
	    return;
	}
	public void knapsack (int[] val, int[] wt, int maxCapacity ) {
	    int[][] wtArr = new int[val.length+1][maxCapacity+1];
	    for(int i=0;i<val.length+1;i++) {
	        for(int j=0;j<maxCapacity+1;j++) {
	            if(i==0 || j==0) {
	                wtArr[i][j] = 0;
	            }
	            else if(wt[i-1]<=j) {
	                wtArr[i][j] = Math.max(val[i-1] + wtArr[i-1][j-wt[i-1]], wtArr[i-1][j]);
	            }
	            else {
	                wtArr[i][j] = wtArr[i-1][j];
	            }
	        }
	    }
	    System.out.println(wtArr[val.length][maxCapacity]);
	}
}

/*
Input:
1
3
4
1 2 3
4 5 1
Output:
3
*/