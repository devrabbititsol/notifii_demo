package web.notifii_demo.notifii_web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Log_packages_in_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbitdev.com/login.php\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"notifii_demo\",\"project_description\":\"desc\",\"project_id\":438,\"module_name\":\"Notifii_web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":735,\"testcase_name\":\"TC_Notifii\",\"testcase_id\":588,\"testset_id\":0,\"executed_timestamp\":1643894213,\"browser_type\":\"chrome,mozilla\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "notifii_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Log_packages_in_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//textarea[@id='tracking_number']")	
	private WebElement	Tracking_number_412744textarea;
	public void filltextareaTracking_number_412744(String varInputValue) {
		waitForExpectedElement(driver, Tracking_number_412744textarea);
		Tracking_number_412744textarea.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//form[@id='package-login-form']/fieldset[2]/section[3]/div/div[1]/label/textarea")	
	private WebElement	Custom_message_412752textarea;
	public void filltextareaCustom_message_412752(String varInputValue) {
		waitForExpectedElement(driver, Custom_message_412752textarea);
		Custom_message_412752textarea.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//span[@id='select2-chosen-1']")	
	private WebElement	Search_412793span;
	public String clkspanSearch_412793() {
		waitForExpectedElement(driver, Search_412793span);		
		String text = Search_412793span.getText();
		Search_412793span.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen1_search']")	
	private WebElement	Search_412794input;
	public void fillinputSearch_412794(String varInputValue) {
		waitForExpectedElement(driver, Search_412794input);
		Search_412794input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='select2-result-label-2']/table/tbody/tr")	
	private WebElement	Select_name_413758DIV;
	public String clkDIVSelect_name_413758() {
		waitForExpectedElement(driver, Select_name_413758DIV);		
		String text = Select_name_413758DIV.getText();
		Select_name_413758DIV.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//button[@id='submit_button']")	
	private WebElement	LogThisPackageIn_412828button;
	public String clkbuttonLogThisPackageIn_412828() {
		waitForExpectedElement(driver, LogThisPackageIn_412828button);		
		String text = LogThisPackageIn_412828button.getText();
		LogThisPackageIn_412828button.click();
		return text;
	}

}