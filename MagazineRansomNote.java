package codeing;

import java.util.HashMap;
import java.util.HashSet;

public class MagazineRansomNote {
	public void checkMagazine(String[] magazine, String[] note) {
        HashMap<String,Integer> hmap = new HashMap<String, Integer>();
        for(String word: magazine) {
        		if(hmap.containsKey(word)) {
        			hmap.put(word, hmap.get(word)+1);
        		}
        		else {
        			hmap.put(word,1);
        		}
            
        }
        for(String word: note) {
            if(!(hmap.containsKey(word))) {
                System.out.println("No");
                return;
            }
            else if(hmap.containsKey(word)) {
            		if(hmap.get(word) == 1)
            			hmap.remove(word);
            		else {
            			hmap.put(word, hmap.get(word)-1);
            		}
            }
        }
        System.out.println("Yes");
    }
	
	public static void main(String args[])
    {
		MagazineRansomNote lp = new MagazineRansomNote();
		String[] magazine = {"two","times","three", "is", "not", "four"};
		String[] note = {"two", "times", "two", "is", "four"};
		lp.checkMagazine(magazine, note);
    }
}
