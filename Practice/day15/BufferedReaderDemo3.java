package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo3 {
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("input.txt");//read
		BufferedReader br=new BufferedReader(fr);//readline
		String read=br.readLine();
		while(read!=null)
		{
		System.out.println(read);
		read=br.readLine();
		}
	}
}
