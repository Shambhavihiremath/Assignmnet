package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException{
	//	BufferReader br=new BufferReader()
	FileReader fr=new FileReader("hmm.txt");
	BufferedReader br=new BufferedReader(fr);
	StringBuffer sb=new StringBuffer();
	String r=br.readLine();
	while(r!=null){
		sb.append(r);
		System.out.println(r);
		r=br.readLine();
		
	}
	
	System.out.println("conetnt of file: " +sb);
	sb.reverse();
	System.out.println("After reverse:"+sb);
	BufferedWriter bw=new BufferedWriter (new FileWriter("hmm.txt"));
	bw.write(sb.toString());
	bw.flush();
	bw.close();
	}
}
