package jUnitPracticalExam;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	WebDriver driver;

	// Validate a single list item could be removed using the remove button when a
	// single checkbox is selected.
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
	public void removeItems() {
		driver.findElement(By.linkText("TonyTest42")).click();
		driver.findElement(By.linkText("Yes")).click();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
