package TestCases;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverinitializer.driverInitializer;
import readDataFromExcel.excelReader;
import readerUtils.readDataFromPropertiesFile;

import reusableData.reusableData;
import seleniumActions.seleniumAPIAtions;

import seleniumActions.seleniumUIAtions;

public class com_testcase_register {
	@BeforeTest
	public void registerPageNavigation()
	{
		driverInitializer.launchDriver(reusableData.url);
	}
	
	@Test
	public void enterContactInformation() throws IOException
	{
	seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.ContactInformation.firsrName.input", excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_Contact, 1, 0));
	
	seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.ContactInformation.lastName.input", excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_Contact, 1, 1));
	seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.ContactInformation.phone.input", excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_Contact, 1, 2));
	seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.ContactInformation.userName.input", excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_Contact, 1, 3));
	}
	
	@Test
	public void enterMailingInformation() throws IOException
	{
		seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.MalingInformation.address1.input",excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_mailInfo, 1, 0));
		seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.MalingInformation.city.input",excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_mailInfo, 1, 1));
		seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.MalingInformation.state.input",excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_mailInfo, 1, 2));
		seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.MalingInformation.postalCode.input",excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_mailInfo, 1, 3));
		seleniumUIAtions.selectDropdownValue("Register.MailingInformation.country.select", excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_mailInfo, 1, 4));
	}
	@Test
	public void enterUserInformation() throws IOException
	{
		seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.Userformation.email.input",excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_userInfo, 1, 0));
		seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.UserInformation.password.input",excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_userInfo, 1, 1));
		seleniumUIAtions.enterValueInUI(reusableData.registerORPath, "Register.UserInformation.confirmPassword.input",excelReader.readTestDataFromExcel(reusableData.registerInfoDataPath, reusableData.sheetname_userInfo, 1, 2));
	}
	
}
