package day16;

class Drink {
	synchronized public void drinkTime(int time){
		for(int i=0;i<=time;i++){
			System.out.println(Thread.currentThread().getName()+" drinking water " +i);
		}
	}
}
class WaterBottel extends Thread{
	Drink d=new Drink();
	public void run()
	{
	d.drinkTime(10);
		}
	}

public class SynchronizationDemo {
	public static void main(String[] args){
		WaterBottel w=new WaterBottel();
		Thread akshay=new Thread(w);
		Thread anil=new Thread(w);
		akshay.setName("akshay");
		anil.setName("anil");
		akshay.start();
		anil.start();
		
		
		
}
}