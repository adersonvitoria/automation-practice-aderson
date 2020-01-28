package application.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressObject {
	private WebDriver driver;
	
	public AddressObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement proceed() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
	}
}