package jUnitPracticalExam;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	WebDriver driver;

	// Validate when the toggle all check box is CHECKED, all check boxes for list
	// items are also CHECKED ON.
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" http://techfios.com/test/101/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void checkBox() {
		
		driver.findElement(By.name("allbox")).click();

	}
	

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
