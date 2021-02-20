package day_9;

public class Exception1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("ban journry startedd");
		System.out.println("50km completed");
		try{
		   System.out.println(a/b);//exception
		}
		catch(Exception obj)
		{
			System.out.println("do not give zero");
		}
		
	}
}
