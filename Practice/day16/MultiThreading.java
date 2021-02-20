package day16;
class Aarthi extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
}
	class Archana extends Thread{
	public	void run(){
			for(int i=20;i<=30;i++){
				System.out.println(i);
	}
	}
	}
	class Abhay extends Thread{
		public	void run(){
				for(int i=40;i<=80;i++){
					System.out.println(i);	
				}
		}
	}
	public class MultiThreading {
		public void main(String[] args){
			Aarthi aarthi=new Aarthi();
			Archana archna=new Archana();
			Abhay abhay=new Abhay();
			aarthi.start();
			archna.start();
			abhay.start();
			
		}
	}			
