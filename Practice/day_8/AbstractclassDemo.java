package day_8;
abstract class Operation{
	abstract void numbers(int a,int b);
		void display()
		{
			System.out.println("This is normal Method");
		}
		
	}
	

class Sachin extends Operation{

	@Override
	void numbers(int a, int b) {
		System.out.println(a+b);
		
	}
	
}
class Rahul extends Operation{

	@Override
	void numbers(int a, int b) {
		
		System.out.println(a-b);
	}
	
	
}



public class AbstractclassDemo {
public static void main(String[] args){
	Sachin s=new Sachin();
	s.numbers(3, 4);
	s.display();
	Rahul r=new Rahul();
	r.numbers(6,7);
	r.display();
}
}
