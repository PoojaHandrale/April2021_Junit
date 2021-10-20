package jUnitPracticalExam;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {
	//Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void removeWhenToggle() {

		WebElement toggleAll = driver.findElement(By.name("allbox"));
		toggleAll.click();

		if (toggleAll.isSelected()) {
			driver.findElement(By.linkText("TonyTest48")).click();
			driver.findElement(By.linkText("Yes")).click();

			System.out.println("Selected item removed from the list");
		}
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
