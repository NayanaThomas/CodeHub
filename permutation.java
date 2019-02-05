package codeing;

import java.util.HashMap;

public class permutation {
	public boolean checkPermutation(String string1, String string2) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

	    if( string1.length() != string2.length()){
	        return false;
	    }

	    for( int i=0; i<string1.length(); i++ ){
	        if( map.containsKey( String.valueOf( string1.charAt(i)))){
	            map.put( String.valueOf( string1.charAt(i)), map.get( String.valueOf( string1.charAt(i)) ) + 1 );
	        }else{
	            map.put( String.valueOf( string1.charAt(i)), 1 );
	        }
	    }

	    for( int i=0; i<string2.length(); i++ ){
	        if( map.containsKey( String.valueOf( string2.charAt(i)))){
	            map.put( String.valueOf( string2.charAt(i)), map.get( String.valueOf( string2.charAt(i))) - 1);
	        }else{
	            return false;
	        }
	    }

	    for (Integer value : map.values()) {
	        if( value != 0 ){
	            return false;
	        }
	    }
	    return true;
	}
	 public static void main(String args[])
	    {
		 permutation lp = new permutation();
	     System.out.println("Output: " + lp.checkPermutation("abc","bca"));
	    }
}
