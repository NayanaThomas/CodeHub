package codeing;

public class CountAndSay {
    public static String countAndSay(int n) {
        String s = "1";
        if(n==1) return s;
        for(int i=0;i<n;i++) {
            s = getNum(s);
        }
        return s;
    }
    public static String getNum(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int num = 0;
        for(int i= 0;i<n;i++) {
            int count = 1;
            num = s.charAt(i)-'0';
            while((++i < n) && (s.charAt(i) - '0') == num) {
                count++;
            }
            sb.append(count);
            sb.append(s.charAt(--i));
        }
        return sb.toString();
    }
    public static void main(String args[]) {
    System.out.println(CountAndSay.countAndSay(4));
    }
}