package codeing;
import java.util.HashMap;
/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
//1st qn, sorted array?
import java.util.Scanner;

public class twoSUm {
	public static void main(String args[]) {
		boolean found = false;
		System.out.println("Enter length of array: ");
		Scanner input = new Scanner(System.in);
		int size=input.nextInt();
		int[] intArr = new int[size];
		int[] resArr = new int[2];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++) {
			intArr[i]=input.nextInt();
		}
		System.out.println("Enter target value: ");
		int target=input.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<size;i++) {
			if(map.get(target-intArr[i])!=null) {
				resArr[0]=map.get(target-intArr[i]);
				resArr[1]= i;
				System.out.println("[ "+resArr[0]+" , "+ resArr[1]+" ]");
				found=true;
				break;
			}
			else {
				map.put(intArr[i], i);
			}
		}
		if(!found) {
			System.out.println("[ 0,0 ]");
		}
		input.close();
	}	
}
