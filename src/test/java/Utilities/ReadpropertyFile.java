package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Selenium testing\\BrilliusTesting\\src\\test\\resources\\Configfiles\\config.properties");
        
		Properties p = new Properties();
		
		p.load(fr);
	}

}
