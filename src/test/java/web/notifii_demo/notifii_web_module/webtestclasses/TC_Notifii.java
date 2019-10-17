package web.notifii_demo.notifii_web_module.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import web.notifii_demo.notifii_web_module.webpageclasses.Login_screen;
import web.notifii_demo.notifii_web_module.webpageclasses.Log_packages_in_screen;
import web.notifii_demo.notifii_web_module.webpageclasses.Log_packages_out_screen;
import web.notifii_demo.notifii_web_module.webpageclasses.Package_history_screen;
import web.notifii_demo.notifii_web_module.webpageclasses.Search_packages_screeen;
import web.notifii_demo.notifii_web_module.webpageclasses.Contacts_screen;
import web.notifii_demo.notifii_web_module.webpageclasses.Resident_list_screen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Notifii extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;

	public TC_Notifii() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Notifii.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_notifii.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Login_screen.projectName);
		test = reports.startTest(setTestcaseName(browserName, "TC_Notifii"));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = Login_screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
		printSuccessLogAndReport(test, logger, "Browser Name : " + browserName);
	}

	public void Login_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Login_screen objLogin_screen = PageFactory.initElements(driver, Login_screen.class);
		testLogHeader(test, "Verify Login_screen page");
		objLogin_screen.fillinputUsername_412726(configFileObj.getProperty("Username"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Username : " + configFileObj.getProperty("Username"+ i + datasetScreencount));
		objLogin_screen.fillinputPassword_412730(configFileObj.getProperty("Password"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
	String text3 = objLogin_screen.clkbuttonLogIn_412739();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("LogIn"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Log_packages_in_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		Log_packages_in_screen objLog_packages_in_screen = PageFactory.initElements(driver, Log_packages_in_screen.class);
		testLogHeader(test, "Verify Log_packages_in_screen page");
		objLog_packages_in_screen.filltextareaTracking_number_412744(configFileObj.getProperty("Tracking_number"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Tracking_number : " + configFileObj.getProperty("Tracking_number"+ i + datasetScreencount));
		objLog_packages_in_screen.filltextareaCustom_message_412752(configFileObj.getProperty("Custom_message"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Custom_message : " + configFileObj.getProperty("Custom_message"+ i + datasetScreencount));
		objLog_packages_in_screen.clkspanSearch_412793();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : SearchLink");
		objLog_packages_in_screen.fillinputSearch_412794(configFileObj.getProperty("Search"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Search : " + configFileObj.getProperty("Search"+ i + datasetScreencount));
		objLog_packages_in_screen.clkDIVSelect_name_413758();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : Select_nameLink");
		objLog_packages_in_screen.clkbuttonLogThisPackageIn_412828();
		printInfoLogAndReport(test, logger, "Clicked on LogThisPackageInButton");
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Log_packages_out_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 3;
		Log_packages_out_screen objLog_packages_out_screen = PageFactory.initElements(driver, Log_packages_out_screen.class);
		testLogHeader(test, "Verify Log_packages_out_screen page");
		objLog_packages_out_screen.clkaPackages_413142();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : PackagesLink");
		String text2 = objLog_packages_out_screen.clkaLogPackagesOut_413163();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("LogPackagesOut"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("LogPackagesOut"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("LogPackagesOut"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("LogPackagesOut"+ i + datasetScreencount));
		}
		objLog_packages_out_screen.fillinputFilterResults_413195(configFileObj.getProperty("FilterResults"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered FilterResults : " + configFileObj.getProperty("FilterResults"+ i + datasetScreencount));

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Package_history_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 4;
		Package_history_screen objPackage_history_screen = PageFactory.initElements(driver, Package_history_screen.class);
		testLogHeader(test, "Verify Package_history_screen page");
		objPackage_history_screen.clkaPackages_413297();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : PackagesLink");
		String text2 = objPackage_history_screen.clkaPackageHistory_413298();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("PackageHistory"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("PackageHistory"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("PackageHistory"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("PackageHistory"+ i + datasetScreencount));
		}
	String text3 = objPackage_history_screen.clkbuttonUpdatePackageHistory_413256();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("UpdatePackageHistory"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("UpdatePackageHistory"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("UpdatePackageHistory"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("UpdatePackageHistory"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Search_packages_screeenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 5;
		Search_packages_screeen objSearch_packages_screeen = PageFactory.initElements(driver, Search_packages_screeen.class);
		testLogHeader(test, "Verify Search_packages_screeen page");
		objSearch_packages_screeen.clkaPackages_413452();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : PackagesLink");
		String text2 = objSearch_packages_screeen.clkaSearchPackages_413434();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("SearchPackages"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("SearchPackages"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("SearchPackages"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("SearchPackages"+ i + datasetScreencount));
		}
		objSearch_packages_screeen.fillinputTracking_number_413388(configFileObj.getProperty("Tracking_number"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Tracking_number : " + configFileObj.getProperty("Tracking_number"+ i + datasetScreencount));
		objSearch_packages_screeen.fillinputRecipient_name_413392(configFileObj.getProperty("Recipient_name"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Recipient_name : " + configFileObj.getProperty("Recipient_name"+ i + datasetScreencount));
	String text5 = objSearch_packages_screeen.clkbuttonSearch_413436();
		if(text5.equalsIgnoreCase(configFileObj.getProperty("Search"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("Search"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("Search"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("Search"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Contacts_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 6;
		Contacts_screen objContacts_screen = PageFactory.initElements(driver, Contacts_screen.class);
		testLogHeader(test, "Verify Contacts_screen page");
		String text1 = objContacts_screen.clkaCONTACTS_413711();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("CONTACTS"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("CONTACTS"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("CONTACTS"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("CONTACTS"+ i + datasetScreencount));
		}
		objContacts_screen.clkaResidents_413637();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : ResidentsLink");
		String text3 = objContacts_screen.clkaViewCurrentResidentsList_413602();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("ViewCurrentResidentsList"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("ViewCurrentResidentsList"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("ViewCurrentResidentsList"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("ViewCurrentResidentsList"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Resident_list_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 7;
		Resident_list_screen objResident_list_screen = PageFactory.initElements(driver, Resident_list_screen.class);
		testLogHeader(test, "Verify Resident_list_screen page");
		objResident_list_screen.fillinputFilterResults_413698(configFileObj.getProperty("FilterResults"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered FilterResults : " + configFileObj.getProperty("FilterResults"+ i + datasetScreencount));
		String text2 = objResident_list_screen.clkaLogOut_413664();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("LogOut"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("LogOut"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("LogOut"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("LogOut"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Resident_list_screen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { Login_screenTest(datasets);}
			if(isElementDispalyed) { Log_packages_in_screenTest(datasets);}
			if(isElementDispalyed) { Log_packages_out_screenTest(datasets);}
			if(isElementDispalyed) { Package_history_screenTest(datasets);}
			if(isElementDispalyed) { Search_packages_screeenTest(datasets);}
			if(isElementDispalyed) { Contacts_screenTest(datasets);}
			if(isElementDispalyed) { Resident_list_screenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}