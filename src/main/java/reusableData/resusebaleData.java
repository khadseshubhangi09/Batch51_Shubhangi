package reusableData;

import readPath.readpath;

public interface resusebaleData {
	
	public static String chromedriverType="webdriver.chrome.driver";

	//public static String chromedriverPath="C:\\Users\\LENOVO\\eclipse-workspace\\Batch51_Automation\\batch51\\driverDetails\\chromedriver.exe";

	public static String chromedriverPath=   readpath.fetchpathDynamically()+"\\driverDetails\\chromedriver.exe";

	public static String edgedriverType="webdriver.edge.driver";
	public static String edgedriverPath=readpath.fetchpathDynamically() + "\\driverDetails\\msedgedriver.exe"; 
    public static String url="https://demo.guru99.com/test/newtours/register.php";
    public static String mmt_url="https://www.makemytrip.com";
    public static String alerturl="https://www.hyrtutorials.com/p/alertsdemo.html";
    public static String url1="https://demo.guru99.com/test/newtours/register.php";
    public static String dataTable="https://demo.guru99.com/test/web-table-element.php";
    public static String browserCateogry="chrome";
    public static String mousehover="https://demoqa.com/menu/#";
    public static String anchortag="https://www.zlti.com/";
    public static String downloadUrl="https://www.tutorialspoint.com/selenium/practice/upload-download.php";
    public static String Demo_Guru_FrameName="a077aa5e";
    public static String switchtoframeurl="https://demo.guru99.com/test/guru99home/";
    public static String switchtowindow="https://www.hyrtutorials.com/p/window-handles-practice.html";
    public static String sheetname_Contact="ContactInformation";
    public static String sheetname_FlightReservation="FlightReservation";

    public static String sheetname_mailInfo="MailingInformation";
    public static String sheetname_userInfo="UserInformation";
    public static String regiterORPath="C:\\Users\\LENOVO\\eclipse-workspace\\Batch51_Automation\\batch51\\ObjectRepository\\registerOR.properties";
    public static String excelpath="C:\\Users\\LENOVO\\eclipse-workspace\\Batch51_Automation\\batch51\\src\\test\\resources\\ResgisterInformation_testData.xlsx";


    public static String calender="https://www.redbus.com/";

    public static String waittUrl="https://www.hyrtutorials.com/p/waits-demo.html";

    

    
    public static String pagination="https://www.scrapingcourse.com/ecommerce/";

    public static String RESTAPI_URL="https://api.restful-api.dev/";
    public static String PostReq_Endpoint="objects";
    
}
