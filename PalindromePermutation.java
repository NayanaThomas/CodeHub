package codeing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
	public boolean isPalindromePermuted(String s) {
		/*HashMap<Character, Integer> map = new HashMap<Character, Integer> ();
		boolean foundOdd = false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				continue;
			}
			if(map.containsKey(Character.toLowerCase(s.charAt(i)))) {
				map.put(Character.toLowerCase(s.charAt(i)), map.get(Character.toLowerCase(s.charAt(i)))+1);
			}
			else {
				map.put(Character.toLowerCase(s.charAt(i)), 1);
			}
		}
		for (Integer value : map.values()) {
	        if( value %2 != 0 ){
	        		if(foundOdd)
	        			return false;
	        		else
	        			foundOdd = true;
	        }
	    }
		return true;*/
		Set <Character> set = new HashSet <Character> ();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i)))
                set.remove(s.charAt(i));
        }
        return set.size() <= 1;
	}
	public static void main(String args[])
    {
		PalindromePermutation lp = new PalindromePermutation();
     System.out.println("Output: " + lp.isPalindromePermuted("carerac"));
    }
}
