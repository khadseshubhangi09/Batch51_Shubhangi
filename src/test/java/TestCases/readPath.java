package TestCases;

public class readPath {
	public static void main(String[] args) {
		readPath.fetchpathDynamically();
	}
	public static void fetchpathDynamically() {
		
		//D:\\eclipse\\Batch51_Cusip\\driverDetails\\chromedriver.exe
		//D:\\eclipse\\Batch51_Cusip\\ObjectRepository\\registerOR.properties
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
	}

}
