package day14;

import java.io.File;
import java.io.IOException;

public class CreateFolder {
	public static void main(String[] args) throws IOException {
		File f=new File("movies");//in workspace 
		
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
}
}