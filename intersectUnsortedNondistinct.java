package codeing;

import java.util.ArrayList;
import java.util.HashMap;

public class intersectUnsortedNondistinct {
	public int[] intersect(int[] nums1, int[] nums2) {
	        int size1 = nums1.length;
	        int size2 = nums2.length;
	        ArrayList<Integer> arr = new ArrayList<Integer>(); 
	        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	        
	        int i=0;
	        int j=0;
	        
	        while(i<size1) {
	            if(m.containsKey(nums1[i])){
	                m.put(nums1[i], (m.get(nums1[i])+1));
	            }
	            else {
	                  m.put(nums1[i], 1);        
	            }
	            i++;
	        }
	                      
	        while(j<size2) {
	            if((m.containsKey(nums2[j])) && (m.get(nums2[j])!=0)) {
	                arr.add(nums2[j]);
	                m.put(nums2[j], (m.get(nums2[j])-1));
	            }
	            j++;
	        }              
	            
	        int[] res = new int[arr.size()];
	        for (i=0; i<arr.size(); i++)
	            res[i] = arr.get(i);
	        return res;
	        
	    }
	public static void main(String[] args) {
		intersectUnsortedNondistinct i = new intersectUnsortedNondistinct();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,1};
		int[] res = i.intersect(nums1,nums2);
		System.out.print("[ ");
		for(int j=0; j< res.length;j++) {
			System.out.print(res[j]+  " ");
		}
		System.out.print("]");
	}
}

