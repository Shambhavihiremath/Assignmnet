package day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Document4.txt");
		System.out.println(fr.read());
		

	}

}
