package codeing;

import java.util.*;

public class reverseInt {
	public static void main(String args[]) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int num = input.nextInt();
		int newNum = reverse(num);
		System.out.println("new num: "+newNum);
	}
	public static int reverse(int x) {
        int revNum=0;
		while(x!=0) {
            int tempNum = (revNum*10) + (x%10);
            //to handle overflow of 32 bit numbers.
            if ((tempNum - (x%10)) / 10 != revNum)
            { return 0; }
            revNum=tempNum;
            x=x/10;
        }
        return revNum;   
    }
}
