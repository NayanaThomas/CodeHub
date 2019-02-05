package codeing;

public class StringCompression {
	public String compress(String s1) {
		if(s1 == "" || s1 == " ") {
			return s1;
		}
		String compressedString = "";
		
		int i =0;
		while(i<s1.length()) {
			int count = 1;
			char ch = s1.charAt(i);
			while(((i+1)<s1.length()) && (s1.charAt(i+1)== s1.charAt(i))) {
				count++;	
				i++;
			}
			i++;
			compressedString = compressedString+ch+count;
			
		}
		return s1.length()>compressedString.length()?compressedString:s1;
	}
	public static void main(String args[])
    {
		StringCompression lp = new StringCompression();
		System.out.println("Output: " + lp.compress("aabcccccddd"));
    }
}
