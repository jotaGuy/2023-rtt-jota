package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleFile {

	public static void main(String[] args) {

		File file = new File("sample1.txt");

		System.out.println(file.getAbsolutePath());
		System.out.println("File exists? " + file.exists());

		// . means the current directory
		// .. mean the parent directory

		File dir = new File("C//Users//jaybaez//Desktop//java-class");
		System.out.println(dir.getAbsolutePath());

		File parent = new File("..//..//..//..//..//..//..");
		
		System.out.println("==========================");

		System.out.println("Parent directory " + parent.getAbsolutePath());
		
		System.out.println("==========================");
		
		for (File f : parent.listFiles()) {
			System.out.println(f.getName());
		}
		
		System.out.println("==========================");

		try {
			PrintWriter writer = new PrintWriter(new FileWriter(file, true));
			writer.append("This is the java class file number 2\n");
			writer.write("This is a write");
			writer.flush();
			writer.close();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			System.out.println("==================");
		}
	}
	
	

}
