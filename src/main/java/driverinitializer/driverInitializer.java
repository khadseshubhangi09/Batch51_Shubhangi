package driverinitializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import reusableData.reusableData;

public class driverInitializer {
	public static WebDriver  driver;
	public static void launchDriver(String url) {
		
		if (reusableData.browserCategory.equals("Chrome"))
				{
			System.setProperty(reusableData.chromedriverType, reusableData.chromedriverPath);
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get(url);
			
		} 
		else if(reusableData.browserCategory.equals("Edge"))
		{
			System.setProperty(reusableData.edgedriverType, reusableData.edgedriverPath);
			 driver = new EdgeDriver();
			 driver.manage().window().maximize();
			driver.get(url);
		}
		else {
			System.out.println("invalid Browser");
		}
		
		
	}

}
