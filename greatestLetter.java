package codeing;
/*
 * Given a list of sorted characters letters containing only lowercase letters, 
 * and given a target letter target, find the smallest element in the list that 
 * is larger than the given target.

	Letters also wrap around. 
	For example, if the target is target = 'z' and letters = ['a', 'b'], 
	the answer is 'a'.
 */
public class GreatestLetter {
	public char nextGreatestLetter(char[] letters, char target) {
	       int p=0;
	        int r=letters.length;
	        int m=0;
	         while(p<r) {
	            m=(p+r)/2;
	            if(target < letters[m]) {
	                r=m;
	            }
	            else {
	                 p=m+1;
	            }
	        }
	        return letters[p%letters.length];
	    }
		public static void main(String[] args) {
			GreatestLetter gi = new GreatestLetter();
			char[] charArray = {'c', 'f', 'j'};
			char target = 'a';
			char res = gi.nextGreatestLetter(charArray,target);
			System.out.print(res);
			
	}
}
