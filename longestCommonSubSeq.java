package codeing;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class longestCommonSubSeq {
	public static void main (String[] args) {
		//code
		longestCommonSubSeq g = new longestCommonSubSeq();
		Scanner s = new Scanner(System.in);
	    int testCases = s.nextInt();
	    int i=0;
	    while(i<testCases) {
	        //System.out.println(s.next());
	        //System.out.println(s.next());
	        String len1 = s.next();
	        //System.out.println(len1);
	        String len2 = s.next();
	       // System.out.println(len2);
	        int length1 = Integer.parseInt(len1);
	        int length2 =Integer.parseInt(len2);
	        if(length1 == 0 || length2 == 0) {
	            System.out.println("0");
	            return;
	        }
	        String s1 = s.next();
	        String s2 = s.next();
	        i++;
	        g.longestCommon(s1,s2);
	    }
	    return;
	}
	public void longestCommon(String s1, String s2) {
	    int[][] res = new int[s1.length()+1][s2.length()+1];
	    for(int i=0;i<=s1.length();i++) {
	        for(int j=0;j<=s2.length();j++) {
	            if(i==0 || j==0) {
	                res[i][j] = 0;
	                //System.out.println(res[i][j]);
	            }
	            else if(s1.charAt(i-1) == s2.charAt(j-1)) {
	                res[i][j] = res[i-1][j-1] + 1;
	                //System.out.println(res[i][j]);
	            }
	            else {
	                res[i][j] = Math.max(res[i-1][j], res[i][j-1]);
	                //System.out.println(res[i][j]);
	            }
	        }
	    }
	    System.out.println(res[s1.length()][s2.length()]);
	}
}