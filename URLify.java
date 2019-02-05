package codeing;

public class URLify {
	public String replaceUrl(String s ) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== ' ') {
				 count++;
			}
		}
		int index = s.length() + count*2;
		char[] newString = new char[index+1];
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				newString[index] = '0';
				newString[index-1] = '2';
				newString[index-2] = '%';
				index=index-3;
			}
			else {
				newString[index] = s.charAt(i);
			    index--;
			}
		}
		
		String newS = String.valueOf(newString);
		System.out.println(newS);
		return newS;
	}
	 public static void main(String args[])
	    {
		 URLify lp = new URLify();
	     System.out.println("Output:" + lp.replaceUrl("Quick brown fox"));
	    }
}
