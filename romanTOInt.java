package codeing;
import java.util.*;

public class romanTOInt {
	public static void main(String args[]) {
	    System.out.println("Enter Roman Literal: ");
		Scanner input = new Scanner(System.in);
		String roman = input.nextLine();
		romanTOInt r = new romanTOInt();
		int convInt = r.romanToInt(roman);
		System.out.println(convInt);
	}
	public int romanToInt(String s) {
        char[] ch=s.toCharArray(); 
        int prevVal = 0;
        int convInt = 0;
        for(int i=ch.length-1;i>=0;i--) {
            int val = getValue(ch[i]);
            if(val < prevVal) {
                convInt = convInt - val;
            }
            else {
            		convInt = convInt + val;
            }
            prevVal = val;
        }
        return convInt;
        
    }
    public int getValue(char c) {
    		int val = 0;
        switch(c) {
            case 'I' : val = 1;
            			   break;
            case 'V' : val = 5;
			   		   break;
            case 'X' : val = 10;
			   	       break;
            case 'L' : val = 50;
			   		   break;
            case 'C' : val = 100;
			           break;
		    case 'D' : val = 100;
			           break;
            case 'M' : val = 1000;
                       break;
            default : val = -1;
        }
        return val;
    }
}
