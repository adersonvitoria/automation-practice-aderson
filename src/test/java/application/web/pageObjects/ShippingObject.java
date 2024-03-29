package application.web.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingObject {
	private WebDriver driver;
	
	public ShippingObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement check() {
		return this.driver.findElement(By.id("cgv"));
	}
	public WebElement proceed() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
	}
}