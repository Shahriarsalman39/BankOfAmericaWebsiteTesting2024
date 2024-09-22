package keyWordFrameWork;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Test_Reader {

	Properties pro;
	FileInputStream fis;
	
	public Test_Reader(){
		pro=new Properties();
		String FilePath="src/test/resources/test.properties";
	 try {
		fis= new FileInputStream(FilePath);
		pro.load(fis);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
		
	}
	public String readBrowser() {
		return pro.getProperty("Browser");
		
	}
	public String readurl() {
		return pro.getProperty("Url");
		
	}
	public String readUsername() {
		return pro.getProperty("Username");
		
	}
	public String readPassword() {
		return pro.getProperty("Password");
		
	}
}
