package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Write {

	public static void main(String[] args) {
		// 1. define the file (path) that we want to write
		String filename = "C:\\eclipse-workspace\\filetowrite.txt";
		String message = "I', writing data that will be placed to a file.";
		
		// 2. create the file in java
		File file = new File(filename);
		
		// 3. open the file
		try {
			FileWriter fw = new FileWriter(file);
			
			// 4. write to the file
			fw.write(message);
			
			// 5. close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("Error: Could not read file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter.");
		}
		
		
		

	}

}
