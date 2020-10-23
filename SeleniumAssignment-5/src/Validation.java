

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Validation {

	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Selenium New Jar Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

	@Test
	public void test() {

		String title=driver.getTitle();

		//Assert.assertEquals("Welcome to OpenClinic : Clinica1", title);		// this statement also validates title
		Assert.assertTrue(title.contains("OpenClinic"));
		System.out.println("Validaton Successfull, TestCase Passed");
	}

}
