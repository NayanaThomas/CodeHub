package codeing;

public class zigZag {
	public String convert(String s, int numRows) {
	       if(numRows == 1) {
	           return s;
	       }
	        String[] arr = new String[numRows];
	        String newString = new String();
	        int dir = 0;
	        int j=0;
	        for(j=0;j<numRows;j++) {
	        		arr[j]="";
	        }
	        j=0;
	        for(int i=0;i<s.length();i++) {
	        		arr[j]=arr[j]+(s.charAt(i));
	            if(j == 0) {
	                dir=0; //down
	             }
	            else if(j==numRows-1) {
	                dir = 1; //up
	            }
	            if(dir==0) {
	            		j++;
	            }
	            else if(dir==1) {
	                j--;
	            }
	            
	        }
	        for( j=0;j<numRows;j++) {
	            newString = newString+(arr[j]);
	        }
	        return newString;
	    }
	public static void main(String args[]) {
		zigZag zz = new zigZag();
		System.out.println("zigzag: "+zz.convert("PAYPALISHIRING",3));
	}
}
