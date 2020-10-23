import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Image {

	WebDriver driver;
	String url="https://api.jquery.com/dblclick/";

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

		driver.close();
	}

	@Test
	public void test() {

		try {
			File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination=new File("F:\\Picture\\Picture.jpg");
			Files.copy(pic, destination);
		}
		catch(IOException e) {
			System.out.println("Message : "+e.getMessage());
		}

	}

}
