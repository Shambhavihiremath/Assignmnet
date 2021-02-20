package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
public static void main(String[] args) throws IOException{
	File f=new File("hi.txt");
	FileWriter f2=new FileWriter("hi.txt");
	f2.write("Hello");
	f2.write("\n");
	//f2.write(9); this wont work like no int
	f2.write("java");
	f2.flush();
	f2.close();
}
}
