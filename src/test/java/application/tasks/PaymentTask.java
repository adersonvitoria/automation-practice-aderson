package application.tasks;

import org.openqa.selenium.WebDriver;
import application.objects.PaymentObject;

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