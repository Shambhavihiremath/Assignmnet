package day16;
class Engagement extends Thread{
public void run(){
	for (int i=1;i<=5;i++){
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
}
class CardDistribution extends Thread{
public void run(){
	for (int i=1;i<=5;i++){
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
}
class Marriage extends Thread{
public void run(){
	for (int i=1;i<=5;i++){
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
}



public class JoinDemo {
public static void main(String[] args){
	Engagement enagement =new Engagement();
	CardDistribution cardDistribution=new CardDistribution();
		Marriage marraige=new Marriage();
		enagement.setName("Engagement");
		
	
}
}
