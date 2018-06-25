package codeing;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
        int sign = 1;
        if((dividend<0 && divisor > 0) || (dividend>0 && divisor<0)) {
            sign = -1;
        }
        
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        if((ldividend < ldivisor) || (ldividend == 0)) {
            return 0;
        }
        
        long lans = helperDivide(ldividend, ldivisor);
        int ans;
        
        if(lans > Integer.MAX_VALUE && sign == 1) {
            return Integer.MAX_VALUE;
        }
        
        if(lans < Integer.MIN_VALUE && sign == -1) {
            return Integer.MIN_VALUE;
        }
        
        else {
        		ans = (int)(sign*lans);
        }
        return ans;
    }
    public long helperDivide(long dividend, long divisor) {
        if(dividend < divisor) {
            return 0;
        }
        long sum = divisor;
        long multiple = 1;
        while((sum+sum)<=dividend) {
            sum+=sum;
            multiple+=multiple;
        }
        return multiple+helperDivide((dividend-sum),divisor);
    }
    
    public static void main(String[] args) {
    	DivideTwoIntegers d = new DivideTwoIntegers();
    		int ans = d.divide(-2147483648, -1) ;
    		System.out.println(ans);
    }
}