// given a string, write a function to check if it's a permutaion of palindrome
public class P4_Palindrom {

	public static void main(String[] args) {
		String str = "tact coa"; 
		int countOdd = 0;
		
		
        // count frequency of each table
		int[] table = new int['z' - 'a' + 1];
        for(char ch : str.toCharArray())
        {
        	if(ch == ' ')  // it will not work if do like this : if(ch != ' ')
        	{
               // nothing to do
        	}
        	else
        	{	
        	  if(ch >= 'a' && ch <= 'z')
        	   	 table[ch - 'a']++;   
        	  if(table[ch - 'a'] % 2 == 1)
        	   	 countOdd++;
        	  else
        		 countOdd--;
           }
        }
        if(countOdd <= 1)
        	System.out.println("Yes - a permutation of palindrome");
        else
        	System.out.println("No - not a permutation of palindrome");		
	}
}
