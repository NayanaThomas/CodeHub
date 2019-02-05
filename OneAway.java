package codeing;
/* There are 3 types pf edit that can be performed on strings:
 * insert a char
 * remove a char
 * replace a char
 * Given 2 strings, check whether one string is one edit away from other
 */
public class OneAway {
	public boolean isOneAway(String s1, String s2) {
		int diff = s1.length()-s2.length();
		if(diff != -1 && diff != 1 && diff!= 0) {
			return false;
		}
		if(s1.length()<s2.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		int i=0,j=0;
		boolean foundOne = false;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				if(foundOne)  {
					return false;
				}	
				else {
					foundOne = true;
				}
				if(s1.length()==s2.length()) {
					j++;
				}
				i++;
			}
			else {
				i++;
				j++;
			}
		}
		return true;
	}
	public static void main(String args[])
    {
		OneAway lp = new OneAway();
		System.out.println("Output: " + lp.isOneAway("ab","cb"));
    }
}
