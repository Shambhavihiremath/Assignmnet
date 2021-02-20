package day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException{
		File f=new File("hmm.txt");
		FileWriter fw=new FileWriter(f);//create+writeon char
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Vankama");
		bw.newLine();
		bw.write("Namaskar");
		bw.newLine();
		bw.write("Welcome");
		bw.newLine();
		bw.flush();
		
	}
}
