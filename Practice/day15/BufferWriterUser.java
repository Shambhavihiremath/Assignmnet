package day15;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class BufferWriterUser {
	
public static void main(String[] args) throws IOException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
	String name=scan.next();
	System.out.println("Enter the age");
	String age=scan.next();
	
			FileWriter fw=new FileWriter("input.txt");//create+writeon char
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Name:"+name);
			bw.newLine();
			bw.write("Age:"+age);
			bw.newLine();
			
	
			bw.flush();
}
}