package web.notifii_demo.notifii_web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Contacts_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbitdev.com/login.php\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"notifii_demo\",\"project_description\":\"desc\",\"project_id\":438,\"module_name\":\"Notifii_web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":735,\"testcase_name\":\"TC_Notifii\",\"testcase_id\":588,\"testset_id\":0,\"executed_timestamp\":1644062066,\"browser_type\":\"chrome\",\"testcase_overwrite\":false,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "notifii_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Contacts_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'CONTACTS')]")	
	private WebElement	CONTACTS_413711a;
	public String clkaCONTACTS_413711() {
		waitForExpectedElement(driver, CONTACTS_413711a);		
		String text = CONTACTS_413711a.getText();
		CONTACTS_413711a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-recipients-primary']/div/ul/li[1]/a")	
	private WebElement	Residents_413637a;
	public String clkaResidents_413637() {
		waitForExpectedElement(driver, Residents_413637a);		
		String text = Residents_413637a.getText();
		Residents_413637a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='tab-recipients-primary']/div/ul/li[1]/ul[1]/li[1]/a")	
	private WebElement	ViewCurrentResidentsList_413602a;
	public String clkaViewCurrentResidentsList_413602() {
		waitForExpectedElement(driver, ViewCurrentResidentsList_413602a);		
		String text = ViewCurrentResidentsList_413602a.getText();
		ViewCurrentResidentsList_413602a.click();
		return text;
	}

}