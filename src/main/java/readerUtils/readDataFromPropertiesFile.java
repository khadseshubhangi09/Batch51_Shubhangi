package readerUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataFromPropertiesFile {
	
	public static String readDataFronORProperties(String path, String keyData) throws IOException {
		//File file =new File("C:\\Users\\LENOVO\\eclipse-workspace\\Batch51_maven\\ObjectRepository\\registerOR.properties");
		File file=new File(path);
		FileInputStream input=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(input);
		//String value=prop.getProperty("Register.ContactInformation.FirsrName.input");
		String value = prop.getProperty(keyData);
		return value;
		
	}

}
