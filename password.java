package codeing;

public class Password {
	
    static String[] strengthenPasswords(String[] passwords) {
        int n= passwords.length;
        for(int i=0;i<n;i++)
        {   
            passwords[i] = passwords[i].replace('S', '5');
            passwords[i] = passwords[i].replace('s', '5');
            int len = passwords[i].length();
            if(len%2 == 1){
                if(len != 1 && Character.isDigit(passwords[i].charAt(len/2)))
                {
                    int dig = Character.getNumericValue(passwords[i].charAt(len/2)) *2;
                    passwords[i] = passwords[i].substring(0,len/2) + dig + passwords[i].substring(len/2 + 1,len);
                    System.out.println(passwords[i]);
                }                    
            }  
            else{
                
                passwords[i] = passwords[i].charAt(len-1) + passwords[i].substring(1,len-2) + passwords[i].charAt(0);
                if(Character.isUpperCase(passwords[i].charAt(0))){
                    char c = passwords[i].charAt(len-1);
                    passwords[i] = passwords[i].substring(0,len-2) + Character.toUpperCase(c);
                }
                    
                else{
                    char c= passwords[i].charAt(len-1);
                    passwords[i] = passwords[i].substring(0,len-2) + Character.toLowerCase(c);
                }
                    
                if(Character.isUpperCase(passwords[i].charAt(len-1))){
                    char c = passwords[i].charAt(0);
                    passwords[i] = Character.toUpperCase(c) + passwords[i].substring(1,len-1);
                }
                    
                else{
                    char c = passwords[i].charAt(0);
                    passwords[i] = Character.toLowerCase(c) + passwords[i].substring(1,len-1);
                }
                    
            }
            String str1 = passwords[i].toLowerCase();
            if(str1.contains("nextcapital"))
            {
                int k = str1.indexOf("nextcapital");
                passwords[i] =  passwords[i].substring(0,k-1) + passwords[i].charAt(k+3)+passwords[i].charAt(k+2)+passwords[i].charAt(k+1)+passwords[i].charAt(k)+ passwords[i].substring(k+4,len-1);
               /* char temp1 = s.charAt(i);
                s.charAt(i) = s.charAt(i+3);
                s.charAt(i+3)= temp1;
                temp1 = s.charAt(i+1);
                s.charAt(i+1) = s.charAt(i+2);
                s.charAt(i+2) = temp1;      */            
            }
        }
    return passwords;

    }
	
	public static void main(String args[]) {
		String[] array = new String[] {"o2d", "fi4ht"};  
		strengthenPasswords(array);
	}
}
