package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import library.Constants;
import pages.HotelPage;

public class HotelTest {
	WebDriver driver;

	@Parameters("Browser")
	@BeforeMethod
	public void before(String browser) {
		if (browser.equalsIgnoreCase("Firefox")) {
			driver = library.Browser.launch("Firefox");
		} else if (browser.equalsIgnoreCase("Chrome")) {
			driver = library.Browser.launch("Chrome");
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = library.Browser.launch("Edge");
		} else {
			driver = library.Browser.launch("Firefox");
		}
		driver.get(Constants.URL);
	}

	@AfterMethod
	public void after(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			System.out.println("The testcase that failed is:" + result.getName());
			Shutterbug.shootPage(driver).withName(result.getName()).save();
		}

	}

	@Test
	public void testcase1() throws InterruptedException {
		HotelPage city = new HotelPage(driver);

		city.clickOnLanguage();
		city.SelectLang();
		city.ClickOnCity();
		city.enterCityName(Constants.CITYNAME);
		city.clickcity();

	}

}
