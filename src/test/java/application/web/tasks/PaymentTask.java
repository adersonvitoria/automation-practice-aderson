package application.web.tasks;

import application.web.pageObjects.PaymentObject;
import org.openqa.selenium.WebDriver;

public class PaymentTask {
	private PaymentObject payment;
	
	public PaymentTask(WebDriver driver){
		this.payment = new PaymentObject(driver);
	}
	public void payByBankWire() {
		this.payment.payByBankWire().click();
	}
	public void proceed() {
		this.payment.iConfirmMyOrder().click();
	}
}