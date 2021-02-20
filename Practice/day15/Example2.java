package day15;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws IOException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id");
		int id=scan.nextInt();
		System.out.println("Enter Name ");
		String name=scan.next();
		System.out.println("Enter Salary ");
		int salary=scan.nextInt();


		BufferedWriter bw=new BufferedWriter(new FileWriter("Employee.txt",true));
		bw.newLine();
		bw.write("\n"+id+"\t"+name+"\t"+salary);
	

		bw.flush();
	}
}

