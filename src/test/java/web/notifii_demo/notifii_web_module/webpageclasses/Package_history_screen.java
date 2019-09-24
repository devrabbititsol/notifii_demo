package web.notifii_demo.notifii_web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Package_history_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":4,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbitdev.com/login.php\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"notifii_demo\",\"project_description\":\"desc\",\"project_id\":438,\"module_name\":\"Notifii_web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":735,\"testcase_name\":\"TC_Notifii\",\"testcase_id\":588,\"testset_id\":0,\"executed_timestamp\":1644047854,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "notifii_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Package_history_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-track-primary']/div/ul/li[1]/a")	
	private WebElement	Packages_413297a;
	public String clkaPackages_413297() {
		waitForExpectedElement(driver, Packages_413297a);		
		String text = Packages_413297a.getText();
		Packages_413297a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-track-primary']/div/ul/li[1]/ul[1]/li[3]/a")	
	private WebElement	PackageHistory_413298a;
	public String clkaPackageHistory_413298() {
		waitForExpectedElement(driver, PackageHistory_413298a);		
		String text = PackageHistory_413298a.getText();
		PackageHistory_413298a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//form[@id='package-history-form']/fieldset[1]/section[5]/div[1]/div[2]/button")	
	private WebElement	UpdatePackageHistory_413256button;
	public String clkbuttonUpdatePackageHistory_413256() {
		waitForExpectedElement(driver, UpdatePackageHistory_413256button);		
		String text = UpdatePackageHistory_413256button.getText();
		UpdatePackageHistory_413256button.click();
		return text;
	}

}