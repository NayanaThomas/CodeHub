package codeing;

class Pal {
    public static boolean isPalindrome(String s) {
       if(s.isEmpty()) {
           return true;
       } 
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length-1;
        while(start<end) {
            if(!isAlphanumeric(c[start])) {
                start++;
            }
            else if(!isAlphanumeric(c[end])) {
                end--;
            }
            else if(Character.toLowerCase(c[start]) != Character.toLowerCase(c[end])) {
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }
    public static boolean isAlphanumeric(char c)
    {
        if (!Character.isLetterOrDigit(c))
            return false;
        return true;
    }
    
    public static void main(String args[]) {
    	String ans = "A man, a plan, a canal: Panama";
    	boolean b = Pal.isPalindrome(ans);
    	System.out.println(b);
    }
}