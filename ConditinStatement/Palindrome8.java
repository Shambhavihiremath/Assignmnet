package hi;

public class Palindrome8 {
	public static void main(String[] args)
	{
         int lastDigit,sum=0,a;    
		int inputNumber=189; 
 
		a=inputNumber; 
        
		while(a>0)
		{   
			lastDigit=a%10;
			 sum=(sum*10)+lastDigit;  
			a=a/10;
			}    
        if(sum==inputNumber)    
			System.out.println("Number is palindrome");    
		else    
			System.out.println("Number is not palindrome");    
	}
}
