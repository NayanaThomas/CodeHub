package codeing;

public class Substring {
	public static int repeatedStringMatch(String A, String B) {
	/*	String temp = A;
		System.out.println("lljjkkl: "+temp);
		int count = 1;
		while(temp.length()<=2*B.length()) {
			if(temp.contains(B)) {
				return count; 
			}
			else {
				count++;
				temp=temp.concat(A);
				System.out.println(temp);
			}
		}
		return -1;
		
	*/  int start=-1;
		int count=1;
		int j=0;
		for(int i=0; i<A.length(); i++) {
			if(A.charAt(i) == B.charAt(j)) {
				j++;
				if(j>=B.length()) {
					return count;
				}
				if(i==A.length()-1) {
					i=-1;
					count++;
				}
			}
			else {
				start++;
				i=start;
				j=0;
			}
		}
		return -1;
	}
	    
	public static void main(String args[]) {
		String A="abcd";
		String B = "abf";
		int c = repeatedStringMatch(A, B);
		System.out.println(c);
	}		
}
