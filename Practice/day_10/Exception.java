package day_10;

public class Exception {
	public static void main(String[] args) {
		try {
			int[] no = {1, 2, 3,4};
			System.out.println(no[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Not Found.");
		} 
		finally {
			System.out.println("Both try and catch finished");
		}
	}
}
