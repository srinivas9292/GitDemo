package project3.project3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesfile {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("D:\\New WS2\\project3\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));	//If propert is String then keep it in " "
		System.out.println(prop.getProperty("URL"));
		
		//Modify data internally
		prop.setProperty("browser", "Firefox");				
		System.out.println(prop.getProperty("browser"));
		
		//modify data as output Externally - means modify in data.properties files also
		FileOutputStream fos= new FileOutputStream("D:\\New WS2\\project3\\data.properties");
		prop.store(fos, null);
		
	}

}
