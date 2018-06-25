package codeing;
/*
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSUmSOrted {
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		int left = 0;
		int right = numbers.length-1;
		int curr =0;
		while(left+1 < right) {
			curr=numbers[left]+numbers[right];
			if(curr==target) {
				res[0] = left+1;
				res[1] = right+1;
				return res;
			}
			else {
				if(curr<target) {
					left = findNum(numbers, target-numbers[right], left+1, right);
				}
				else {
					right = findNum(numbers, target-numbers[left], left, right-1);
				}
			}
		}
		res[0] = left+1;
		res[1] = right+1;
		return res;
	}
	
	private int findNum(int[] numbers, int searchNum, int left, int right) {
		while(left<right) {
			int mid = (left+right)/2;
			if(numbers[mid] == searchNum) {
				return mid;
			}
			else if(numbers[mid] < searchNum) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return left;
	}
	public static void main(String[] args) {
		TwoSUmSOrted two = new TwoSUmSOrted();
		int[] res = new int[2];
		int[] numbers = {2,7,11,15};
		int target = 9;
		res = two.twoSum(numbers, target);
		System.out.print("[ ");
		for(int i=0;i<2;i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println("]");
	}
}
