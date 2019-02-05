package codeing;
/*
 * Given two words, find if second word is the round rotation of first word.
	For example: abc, cab
	return 1
	since cab is round rotation of abc
 */
public class RoundRotation {
	public boolean isRoundRotated(String s1, String s2) {
		/*Solution 1
		 * 
		 * if (A.length() != B.length())
            		return false;
        		if (A.length() == 0)
            		return true;

        		for (int s = 0; s < A.length(); ++s) {
                for (int i = 0; i < A.length(); ++i) {
                    if (A.charAt((s+i) % A.length()) != B.charAt(i))
                        continue search;
                }
                return true;
            }
        		return false;
        		
        		time comp: O(N2)
        		space comp: O(1)
		 */
		
		/*SOLUTION 2
		 * 
		 * Time Complexity:  O(N2) N is the length of s1.
		 * Space Complexity: O(N), the space used building s1+s1
		 */
		String s = s2;
		s=s.concat(s2);
		if(s.contains(s1)) {
			return true;
		}
		return false;
		
		/*Solution 3
		 * 
		 */
		
		
	}
	public static void main(String args[])
    {
		RoundRotation rr = new RoundRotation();
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println("Length of lis i " + rr.isRoundRotated(s1,s2));
    }
}
