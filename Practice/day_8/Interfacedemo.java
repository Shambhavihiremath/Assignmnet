package day_8;
interface Loan{
	void loanslab();
}
interface Employee{
	int loginHours=8;
	void designation();
}
class Manager implements Employee
{

	@Override
	public void designation() {
		System.out.println("I manage the team for 4 clients");
		System.out.println("I manage the");
		
	}
	
}
public class Interfacedemo {

}
