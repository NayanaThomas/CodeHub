package codeing;

public class FindLongestPalindrome {
	 public String longestPalindrome(String s) {
	        int n = s.length();
	        if(n == 1) {
	        		return s;
	        }
	        int max = 1;
	        int start = 0;
	        int end = 0;
	        boolean table[][] = new boolean[n][n];
	        for(int i=0;i<n;i++) {
	            table[i][i] = true;
	            max=1;
	        }
	        for(int i=0;i<n-1;i++) {
	            if(s.charAt(i)==s.charAt(i+1)) {
	                table[i][i+1] = true;
	                start = i;
	                end = i+1;
	                max=2;
	            }
	        }
	        for(int k=3;k<=n;k++) {
	            for(int i=0;i<n-k+1;i++) {
	                int j = i+k-1;
	                if(table[i+1][j-1] == true && s.charAt(i)==s.charAt(j)) {
	                    table[i][j] = true;
	                    if(k>max) {
	                        max = k;
	                        start = i;
	                        end = j;
	                    }
	                }
	            }
	        }
	        if(max == 1)
	        		return s.substring(0,1);
	        return s.substring(start, end+1);
	        
	    }
	 public static void main(String args[]) {
		 FindLongestPalindrome lp = new FindLongestPalindrome();
		 System.out.println("Longest Palindromic sub seq : "+ lp.longestPalindrome("abkah"));
	 }
}
