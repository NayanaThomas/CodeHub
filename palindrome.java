package codeing;

import java.util.*;

public class Palindrome {
	public static void main(String args[]) {
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean isPali = isPalindrome(num);
		if(isPali) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static boolean isPalindrome(int x) {
        int tempX = x;
        int revNum = 0;
        while(x!=0) {
            revNum = (revNum*10)+(x%10);
            x=x/10;
        }
        if(Math.abs(revNum) == tempX)
            return true;
        return false;
    }
}
