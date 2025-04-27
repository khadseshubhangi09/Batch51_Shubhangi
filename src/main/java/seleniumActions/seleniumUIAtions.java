package seleniumActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverinitializer.driverInitializer;
import readerUtils.readDataFromPropertiesFile;
import reusableData.reusableData;

public class seleniumUIAtions {
	public static void enterValueInUI(String ORPath, String ORKey,String inputData) throws IOException 
	{
		driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFile.readDataFronORProperties(ORPath, ORKey))).sendKeys(inputData);
		
	}
	
	public static void selectDropdownValue(String xpath , String value) throws IOException 
	{
		WebElement ele = driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFile.readDataFronORProperties(reusableData.registerORPath, xpath)));
		Select select = new Select(ele);
		select.selectByValue(value);
	}

}
