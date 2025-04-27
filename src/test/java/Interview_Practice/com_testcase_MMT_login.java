package Interview_Practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import asserstion.assertfunctions;
import dataBaseConnectionDetails.DBUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.util.NumberToTextConverter;

import driverIntializer.driverIntializer;
import readDataFromExcel.excelReader;
import readerUtils.readDataFromPeropertiesFile;
import reusableData.resusebaleData;
import seleniumActions.seleniumUIActions;

public class com_testcase_MMT_login {
	
	private static final Logger logger = LogManager.getLogger(com_testcase_MMT_login.class);
	
	@BeforeTest
	public void registerPageNavigation()
	{
		driverIntializer.launchdriver(resusebaleData.mmt_url);
		//driverIntializer.driver.manage().deleteAllCookies();
		
	}
	
	

	
	
	@Test
	public void enterFlightDetails() throws Exception
	{
		
		logger.info("***************This Steps included selection the data for Flight resevation***************");
	//	logger.info("User enters From City and the Xpath is" + excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 0));
		seleniumUIActions.implicitWait(10);
		driverIntializer.driver.findElement(By.xpath("//span[@class=\'commonModal__close\']")).click();
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "MMT.Flights.FromCity", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_FlightReservation, 1, 0));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "MMT.Flights.to", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_FlightReservation, 1, 1));
		//logger.info("User enters lastname and the Xpath is" + excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 1));
		//seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "MMT.Flights.Departure",;
		//logger.info("User enters phone and the Xpath is" + excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 0));
		driverIntializer.driver.findElement(By.xpath("//label[@for='departure']")).sendKeys("28 April 2025");
		seleniumUIActions.click(resusebaleData.regiterORPath, "MMT.Flights.Search");

		
		
		
	}
		
	@AfterTest
	public void  closeBrowser() throws Exception
	{

		//driverIntializer.closebrowser();
		
	}
}
