package codeing;
//Given a string, find the length of the longest substring without repeating characters.
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
       if(!s.isEmpty()) {
             int startChar = 0;
            int endChar=0;
            int size = 0;
            int start =0;
            int end = 0;
            int currMax = 1;
            int max=1;
            int i=0;
            while(++endChar < s.length()) {
                currMax = 1;
                for(i=startChar;i<endChar;i++){
                    if(s.charAt(i) == s.charAt(endChar)){
                        startChar++;
                        endChar = startChar;
                        break;
                    }
                    else {
                        currMax++;
                    }
                }
                if(currMax > max) {
                    max = currMax;
                }
            }
            return max;
        }
        else {
            return 0;
        }
       
    }
	public static void main(String args[]) {
		LongestSubstring ls = new LongestSubstring();
		System.out.println("bfw: "+ls.lengthOfLongestSubstring("bffbuttio"));
	}
}

/*OPTIMIZED SOLUTION
 * public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
 */

