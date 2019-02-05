package codeing;

import java.io.*;
import java.util.*;


public class SherlockAndAnagram {

    // Complete the sherlockAndAnagrams function below.
    public int sherlockAndAnagrams(String s) {
        int count = 0;
        ArrayList<String> l = new ArrayList<String>();
        for(int i=0;i<s.length();i++) {
            for(int j=1;j<s.length()-i+1;j++) {
                l.add(s.substring(i,i+j));
            }
        }
        for(int i=0;i<l.size();i++) {
            for(int j=i+1;j<l.size();j++) {
                String one = l.get(i);
                String two = l.get(j);
                if(i!=j && one.length() == two.length() && checkAnagram(one,two)) {
                    count ++;
                }
            }
        }
        return count;
    }
    
    public boolean checkAnagram(String one, String two) {
        HashMap<Character, Integer> hmap1 = new HashMap<Character,Integer>();
         HashMap<Character, Integer> hmap2 = new HashMap<Character,Integer>();
        for(int i=0;i<one.length();i++) {
            if(hmap1.containsKey(one.charAt(i))) {
                hmap1.put(one.charAt(i),hmap1.get(one.charAt(i))+1);
            }
            else {
                hmap1.put(one.charAt(i),1);
            }
        }
        for(int i=0;i<two.length();i++) {
            if(hmap2.containsKey(two.charAt(i))) {
                hmap2.put(two.charAt(i),hmap2.get(two.charAt(i))+1);
            }
            else {
                hmap2.put(two.charAt(i),1);
            }
        }
        if(hmap1.equals(hmap2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
    		SherlockAndAnagram lp = new SherlockAndAnagram();
		System.out.println("Output: " + lp.sherlockAndAnagrams("abba"));
    }
    
}
    