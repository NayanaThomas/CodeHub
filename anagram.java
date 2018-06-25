package codeing;

import java.util.HashMap;

public class anagram {
	public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i),1);
            }
            else {
                int val = (map1.get(s.charAt(i)));
                val ++;
                map1.put(s.charAt(i), val);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<Character,Integer>();
        for(int i=0;i<t.length();i++) {
            if(!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i),1);
            }
            else {
                int val = (map2.get(t.charAt(i)));
                val ++;
                map2.put(t.charAt(i), val);
            }
        }
        if(map1.equals(map2)) {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		anagram a = new anagram();
		System.out.println(a.isAnagram("asdf","wwww"));
	}
}
