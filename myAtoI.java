package codeing;

public class myAtoI {
	public int myAtoi(String str) {
        int n = str.length();
        int sign=0;
        int num = 0;
        int digit=0;
        for(int i=0;i<=n-1;i++){
            if(str.charAt(i)==' ')
                continue;
            if(str.charAt(i)>='0' && str.charAt(i)<='9') {
            		digit = str.charAt(i)-'0';
                 if(i!=0 && str.charAt(i-1)=='-')
                    sign = -1;
                 if(num/10>Integer.MAX_VALUE || (num/10 == Integer.MAX_VALUE && num%10 < num))  {
                	 	if(sign == -1)
                	 		return Integer.MIN_VALUE;
                	 	else
                	 		return Integer.MAX_VALUE;
                 }
                 num = num*10+digit;
            }
        }
        if(sign!=0)
            num=num*sign;
        return num;
    }
	public static void main(String[] args) {
		myAtoI ai = new myAtoI();
		System.out.println(ai.myAtoi("-91283472332"));
	}
}
