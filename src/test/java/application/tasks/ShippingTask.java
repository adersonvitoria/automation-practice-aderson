package application.tasks;

import org.openqa.selenium.WebDriver;
import application.objects.ShippingObject;

public class ShippingTask {
	private ShippingObject shipping;
	
	public ShippingTask(WebDriver driver){
		this.shipping = new ShippingObject(driver);
	}
	public void agreeTerms() {
		this.shipping.check().click();
	}
	public void proceed() {
		this.shipping.proceed().click();
	}
}