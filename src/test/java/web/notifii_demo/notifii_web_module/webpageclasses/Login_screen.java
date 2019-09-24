package web.notifii_demo.notifii_web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Login_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbitdev.com/login.php\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"notifii_demo\",\"project_description\":\"desc\",\"project_id\":438,\"module_name\":\"Notifii_web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":735,\"testcase_name\":\"TC_Notifii\",\"testcase_id\":588,\"testset_id\":0,\"executed_timestamp\":1643894213,\"browser_type\":\"chrome,mozilla\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "notifii_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Login_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")	
	private WebElement	Username_412726input;
	public void fillinputUsername_412726(String varInputValue) {
		waitForExpectedElement(driver, Username_412726input);
		Username_412726input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='password']")	
	private WebElement	Password_412730input;
	public void fillinputPassword_412730(String varInputValue) {
		waitForExpectedElement(driver, Password_412730input);
		Password_412730input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//form[@id='login-form']/fieldset[1]/section[4]/div[1]/div[2]/button")	
	private WebElement	LogIn_412739button;
	public String clkbuttonLogIn_412739() {
		waitForExpectedElement(driver, LogIn_412739button);		
		String text = LogIn_412739button.getText();
		LogIn_412739button.click();
		return text;
	}

}