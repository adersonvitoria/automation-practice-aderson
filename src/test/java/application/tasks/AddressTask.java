package application.tasks;

import org.openqa.selenium.WebDriver;
import application.objects.AddressObject;

public class AddressTask {
	private AddressObject address;
	
	public AddressTask(WebDriver driver){
		this.address = new AddressObject(driver);
	}
	public void proceed() {
		this.address.proceed().click();
	}
}