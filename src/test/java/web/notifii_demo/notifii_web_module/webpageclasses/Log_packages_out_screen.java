package web.notifii_demo.notifii_web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Log_packages_out_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":4,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbitdev.com/login.php\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"notifii_demo\",\"project_description\":\"desc\",\"project_id\":438,\"module_name\":\"Notifii_web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":735,\"testcase_name\":\"TC_Notifii\",\"testcase_id\":588,\"testset_id\":0,\"executed_timestamp\":1644047854,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "notifii_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Log_packages_out_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-track-primary']/div/ul/li[1]/a")	
	private WebElement	Packages_413142a;
	public String clkaPackages_413142() {
		waitForExpectedElement(driver, Packages_413142a);		
		String text = Packages_413142a.getText();
		Packages_413142a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-track-primary']/div/ul/li[1]/ul[1]/li[2]/a")	
	private WebElement	LogPackagesOut_413163a;
	public String clkaLogPackagesOut_413163() {
		waitForExpectedElement(driver, LogPackagesOut_413163a);		
		String text = LogPackagesOut_413163a.getText();
		LogPackagesOut_413163a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='pending_packages_wrapper']/div[1]/div[1]/div/label/div/span[2]/input")	
	private WebElement	FilterResults_413195input;
	public void fillinputFilterResults_413195(String varInputValue) {
		waitForExpectedElement(driver, FilterResults_413195input);
		FilterResults_413195input.sendKeys(varInputValue);
	}

}