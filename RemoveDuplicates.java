package codeing;

import java.util.ArrayList;
import java.util.List;

class RemoveDuplicates {
	    public static String addBinary(String a, String b) {
	        StringBuilder sb = new StringBuilder();
	        int a1 = a.length()-1;
	        int b1 = b.length()-1;
	        int carry = 0;
	        int sum = 0;
	        while(a1>=0 || b1>= 0) {
	            sum = carry;
	            if(a1>=0) {
	                sum = sum+(a.charAt(a1--)-'0');
	            }
	            if(b1>=0) {
	                sum = sum + (b.charAt(b1--)-'0');
	            }
	            carry = sum/2;
	            sum = sum%2;
	            
	            sb.append(sum);
	        }
	        if(carry!=0) {
	            sb.append(carry);
	        }
	        return sb.reverse().toString();
	    }
	
public static void main(String args[]) {
	String ans = RemoveDuplicates.addBinary("11", "1");
	System.out.println(ans);
}
}




//package codeing;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class RemoveDuplicates {
//	public static void main(String args[]) {
//		int arr[] = {0,0,1,1,1,2,2,3,3,4};
//		int nums[] = {1,2,3,1};
//		//removeDuplicates(arr);
//		containsDuplicate(nums);
//	}
//	public static int removeDuplicates(int[] nums) {
//		Set<Integer> s = new HashSet<Integer>();
//		int n = nums.length;
//		for (int i = 0; i < n; i++) {
//			if (!s.contains(nums[i])) {
//				s.add(nums[i]);
//			} else {
//				for (int j = i; j < n - 1; j++) {
//					nums[j] = nums[j + 1];
//				}
//				i = i-1;
//			}
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(nums[i]+ " ");
//		}
//		return s.size();
//	}
//	
//    public static boolean containsDuplicate(int[] nums) {
//        if(nums.length == 0 || nums.length == 1) {
//            return false;
//        }
//        
//        Set<Integer> s = new HashSet<Integer>();
//        for(int i=0;i<nums.length;i++) {
//            if(s.contains(nums[i])) {
//                return true;
//            }
//            else {
//                s.add(nums[i]);
//            }
//        }
//        return false;
//        
//    }
//
//}
