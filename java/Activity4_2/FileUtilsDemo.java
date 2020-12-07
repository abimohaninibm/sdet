package Activity4_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilsDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("src/Activity4_2/demo.txt");
		
		if(f.createNewFile()) {
			System.out.println("FILE CREATED..");
		}
		else{
			System.out.println("FILE NOT CREATED..");
		}
		
		//create a fileutil object for the file created.
		File fileutil = FileUtils.getFile("src/Activity4_2/demo.txt");
		
		//write data into the file
		FileUtils.writeStringToFile(fileutil, "THIS IS THE DATA I INSERTED", "UTF-8");
		
		//print the data in the console
		System.out.println("Data in the file : "+FileUtils.readFileToString(fileutil, "UTF-8"));
		
		//create a directory
		File dir = new File("src/Activity4_2/resourses");
		
		//copy data to dest dir
		FileUtils.copyFileToDirectory(f, dir);
		
		//view data from file in dest dir
		File newfile = new File(dir,"demo.txt");
		
		//reading from the copied file
		System.out.println("**********Reading from the copied file***********");
		System.out.println(FileUtils.readFileToString(newfile,"UTF-8"));
		
		
	}
}
