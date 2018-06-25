package codeing;

import java.util.*;

public class ListCombinations {

	public String[] allComb(String arr[][]) {
		  int total = 1;
		  int rowCount = arr.length;
		  int columnCount = 0;
		  int i=0,j=0;
		  int[] current = new int[50];
		  
		   for (j = 0; j < arr.length; j++) {
		    total *= arr[j].length;
		    current[j] = 0;
		  }
		  String[] result = new String[total];
		  
		  //finding all possible permutations.
		  for (i = 0; i < total; i++) {
		    int inc = 1;
		    result[i] = "";
		    for (j = 0; j < arr.length; j++) {
		      result[i] += arr[j][current[j]] + ' ';
		      if ((current[j] += inc) == arr[j].length)
		        current[j] = 0;
		      else
		        inc = 0;
		    }
		  }
		  return (result);
		}

  public static void main(String[] args) {
	  String [][] test2 = {{"quick","lazy"},
		      {"brown","black","grey"},
		        {"fox","dog"}
		        };
	  //calling the function.
      String result[] = new ListCombinations().allComb(test2);
      //printing all the combinations.
      for(int i=0;i<result.length;i++)
      System.out.println(result[i]);
  }
}