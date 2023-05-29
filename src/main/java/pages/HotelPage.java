package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {
	WebDriver driver;
	
	
	public HotelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
By Language = By.xpath("//button[@id='languages']");
By LangSele = By.xpath("//button[@id='languages']/../ul/li[9]");



By ClickOnCity = By.xpath("//span[@id='select2-hotels_city-container']");
By EnterCity = By.xpath("//input[@class= 'select2-search__field']");
By ClickCity = By.xpath("//ul[@id ='select2-hotels_city-results']/li[1]/i");





public void clickOnLanguage() {
	driver.findElement(Language).click();
}

public void SelectLang(){
	driver.findElement(LangSele).click();
	
}

	
public void ClickOnCity() {
	driver.findElement(ClickOnCity).click();
	
	
}


public void enterCityName(String city) throws InterruptedException {
		driver.findElement(EnterCity).sendKeys(city);
		Thread.sleep(3000);
	}

public void clickcity() {
	driver.findElement(ClickCity).click();

}

	
	
	
	
	

}
