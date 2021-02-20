package day16;
class Drink1 {
	synchronized public void drinkTime(int time){
		for(int i=0;i<=time;i++){
			System.out.println(Thread.currentThread().getName()+" eating " +i);
		}
		synchronized(this){
			for(int i=0;i<=time;i++){
				System.out.println(Thread.currentThread().getName()+" drinking " +i);
		}
	}
}
}
class WaterBottel1 extends Thread{
	Drink1 d=new Drink1();
	public void run()
	{
		d.drinkTime(10);
	}
}

public class SycroBlock {
public static void main(String[] args){
		WaterBottel1 w=new WaterBottel1();
		Thread akshay=new Thread(w);
		Thread anil=new Thread(w);
		akshay.setName("akshay");
		anil.setName("anil");
		akshay.start();
		anil.start();
		
		
		
}
}

