package codeing;

import java.util.*;
/*package whatever //do not write package name here 
 * 
4069
down vote
If you're only interested in the keys, you can iterate through the keySet() of the map:

Map<String, Object> map = ...;

for (String key : map.keySet()) {
    // ...
}
If you only need the values, use values():

for (Object value : map.values()) {
    // ...
}
Finally, if you want both the key and value, use entrySet():

for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}
*/

class FindingTheDistinctNumbers {
	public static void main (String[] args) {
		//code
		Scanner input = new Scanner(System.in);
		int testcase = input.nextInt();
		//input.nextInt();
		int count = 0;
		int num = 0;
		int[] arr; 
		for(int i=0;i<testcase;i++) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int ra=0;
			int[] resArr = new int[2];
			count = input.nextInt();
		     num = count*2+2;
		     arr = new int[num];
		     for(int j=0;j<num; j++) {
		         //input.nextInt();
		         arr[j] = input.nextInt();
		     }
		     
		     for(int j=0;j<num;j++) {
		         int val = 1;
		         if(map.containsKey(arr[j])) {
		            val = map.get(arr[j]);
		            val++;
		         }
		         map.put(arr[j],val);
		     }
		     
		     for (Integer key : map.keySet()) {
		    	 	if(map.get(key) %2 !=  0) {
		             resArr[ra] = key;
		             if(++ra==2) {
		                 break;
		             }
		         }
		    	}
		     Arrays.sort(resArr);
	         
		     for(int j=0;j<2;j++) {
		    	 	System.out.print(resArr[j]+" ");
		     }
		     System.out.println();
		}
		input.close();
	}
}