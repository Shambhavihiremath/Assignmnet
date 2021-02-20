package day14;

import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("Document4.txt",true);
		fw.write("Shambhavi Hiremath");
	     fw.write	(97);
	  
	  fw.flush();
	  fw.close();
	}
}
