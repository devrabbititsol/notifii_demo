package web.notifii_demo.notifii_web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Resident_list_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbitdev.com/login.php\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"notifii_demo\",\"project_description\":\"desc\",\"project_id\":438,\"module_name\":\"Notifii_web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":735,\"testcase_name\":\"TC_Notifii\",\"testcase_id\":588,\"testset_id\":0,\"executed_timestamp\":1643894213,\"browser_type\":\"chrome,mozilla\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "notifii_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Resident_list_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='recipient_list_wrapper']/div[1]/div[1]/div/label/div/span[2]/input")	
	private WebElement	FilterResults_413698input;
	public void fillinputFilterResults_413698(String varInputValue) {
		waitForExpectedElement(driver, FilterResults_413698input);
		FilterResults_413698input.sendKeys(varInputValue);
	}

	@FindBy(how = How.CSS, using = "html > body > div.wrapper.boxed-layout > div.header > div.wrapper.boxed-layout > div.header > div.topbar > div.container > div.pull-right > a")	
	private WebElement	LogOut_413664a;
	public String clkaLogOut_413664() {
		waitForExpectedElement(driver, LogOut_413664a);		
		String text = LogOut_413664a.getText();
		LogOut_413664a.click();
		return text;
	}

}