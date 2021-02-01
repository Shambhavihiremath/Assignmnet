package hi;

public class prime_series {
	public static void main(String[] args)   
	{  
	int count=0,n=0,i=1,j=1;  
	while(n<7)  
	{  
		j=1;  
	count=0;  
	while(j<=i)  
	{  
		if(i%j==0)  
			count++;  
			j++;   
	}  
		if(count==2)  
	{  
			System.out.printf("%d ",i);  
			n++;  
	}  
			i++;  
	}  
	}  
	}  
