package day14;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Documents\\Document4.rtf");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		//if file exits it wont create another

	}

}
