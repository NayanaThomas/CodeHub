package codeing;

import java.util.HashSet;
import java.util.Set;

// intersect with distinct elements
public class intersectArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
       int i=0;
        
        for(int num: nums1) {
            if(!set.contains(num))
                set.add(num);
        }
        
        for(int num2: nums2) {
            if((set.contains(num2)) && (!set2.contains(num2)))
                set2.add(num2);
        }
        int[] result = new int[set2.size()];
        for(int num1: set2) {
        		result[i] = num1;
            i++;
        }
        return result;
    }
	    
	
	public static void main(String[] args) {
		intersectArrays i = new intersectArrays();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] res = i.intersection(nums1,nums2);
		for(int j=0; j< res.length;j++) {
			System.out.println(res[j]);
		}
	}
}
