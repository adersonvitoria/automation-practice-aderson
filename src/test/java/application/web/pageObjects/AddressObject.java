package application.web.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressObject {
	private WebDriver driver;
	
	public AddressObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement proceed() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
	}
}