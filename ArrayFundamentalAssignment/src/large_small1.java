import java.util.Scanner;
public class large_small1 {
	

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++){
			System.out.println("Enter an element");
			a[i]=scan.nextInt();
		}
		
		int item=0;
		int j=0;
		
		for(int i=1;i<n-1;i++){
			item=a[i];
			j=i-1;
		
			while(j>=0 && a[j]>item){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=item;
		}
		System.out.println();
		System.out.println("Smallest 2 numbers in the given array");
		System.out.println(item=a[0]);
		System.out.println(item=a[1]);
		System.out.println("largest 2 numbers in the given array.");
		System.out.println(item=a[n-1]);
		System.out.println(item=a[n-2]);
		
		
		
		
	}
	}


