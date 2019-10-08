//Boyan Xu CSE 360 assignment 1
public class Palindrome
{

		private static String testString;
		
		
        public boolean isPalindrome(){
        	
        	String forwards= testString;
        	String backwards = "";
        	int i = forwards.length();
        	
        	while(i > 0)//loop checking if it is a palidrome
        	{
        		backwards = backwards + forwards.charAt(i-1);
        		i--;
        	}
        	
 
        	
        	if(forwards.toUpperCase().equals(backwards.toUpperCase()))//boolean part
        	{
        		return true;
        	}
        	else
        	{
        		return false;
        	}
        	       	
        }
        public Palindrome(String test_String){
        	
        	testString = test_String;
        }
		
		
        	
        
        	
        
}


