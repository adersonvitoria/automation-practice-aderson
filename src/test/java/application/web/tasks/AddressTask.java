package application.web.tasks;

import application.web.pageObjects.AddressObject;
import org.openqa.selenium.WebDriver;

public class AddressTask {
	private AddressObject address;
	
	public AddressTask(WebDriver driver){
		this.address = new AddressObject(driver);
	}
	public void proceed() {
		this.address.proceed().click();
	}
}