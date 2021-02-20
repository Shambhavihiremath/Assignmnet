package day_10;

public class ThrowDemo {
	void loginTime(int time)
	{
		System.out.println("You have logged at: " +time);
		if(time>12){
			throw new ArithmeticException("Absent");
		}
		else{
			System.out.println("present");
		}

	}

	public static void main(String[] args) {

		//throw new ArithmeticException("It is throwing exception");
		ThrowDemo t=new ThrowDemo();
		t.loginTime(11);

	}
}
