package co.micol.fileCopy.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;

public class fileCopy {
	private String source = "c:\\Temp\\source.txt";
	private String destination = "c:\\Temp\\object.txt";
	
	public void copy() {	
		try {
			reader = new FileReader(source);
			writer = new FileWriter(destination);
			
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				os.write(data);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
