package web.notifii_demo.notifii_web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Search_packages_screeen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":4,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbitdev.com/login.php\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"notifii_demo\",\"project_description\":\"desc\",\"project_id\":438,\"module_name\":\"Notifii_web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":735,\"testcase_name\":\"TC_Notifii\",\"testcase_id\":588,\"testset_id\":0,\"executed_timestamp\":1644047854,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "notifii_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Search_packages_screeen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-track-primary']/div/ul/li[1]/a")	
	private WebElement	Packages_413452a;
	public String clkaPackages_413452() {
		waitForExpectedElement(driver, Packages_413452a);		
		String text = Packages_413452a.getText();
		Packages_413452a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-track-primary']/div/ul/li[1]/ul[1]/li[4]/a")	
	private WebElement	SearchPackages_413434a;
	public String clkaSearchPackages_413434() {
		waitForExpectedElement(driver, SearchPackages_413434a);		
		String text = SearchPackages_413434a.getText();
		SearchPackages_413434a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='tracking_number']")	
	private WebElement	Tracking_number_413388input;
	public void fillinputTracking_number_413388(String varInputValue) {
		waitForExpectedElement(driver, Tracking_number_413388input);
		Tracking_number_413388input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='recipient_name']")	
	private WebElement	Recipient_name_413392input;
	public void fillinputRecipient_name_413392(String varInputValue) {
		waitForExpectedElement(driver, Recipient_name_413392input);
		Recipient_name_413392input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")	
	private WebElement	Search_413436button;
	public String clkbuttonSearch_413436() {
		waitForExpectedElement(driver, Search_413436button);		
		String text = Search_413436button.getText();
		Search_413436button.click();
		return text;
	}

}