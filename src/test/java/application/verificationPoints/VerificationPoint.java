package application.verificationPoints;

import com.aventstack.extentreports.Status;
import framework.Reports;
import framework.ScreenShots;
import org.openqa.selenium.WebDriver;


public class VerificationPoint {
	private String CHECK_ORDER = "Your order on My Store is complete.";
	private WebDriver driver;
	
	public VerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}
	public void checkProduct(String name) {
		if(this.pageContains(name)) {
			Reports.log(Status.PASS, "Validação - Produto correto.", ScreenShots.capture(driver));
		} else {
			Reports.log(Status.FAIL, "Validação - Produto incorreto.", ScreenShots.capture(driver));
		}
	}
	public void checkOrder() {
		if(this.pageContains(CHECK_ORDER)) {
			Reports.log(Status.PASS, "Validação - Compra realizada com sucesso.", ScreenShots.capture(driver));
		} else {
			Reports.log(Status.FAIL, "Validação - Falha ao comprar.", ScreenShots.capture(driver));
		}
	}
	public void checkTotal(String total) {
		if(this.pageContains(total)) {
			Reports.log(Status.PASS, "Validação - Valor total da compra correto.", ScreenShots.capture(driver));
		} else {
			Reports.log(Status.FAIL, "Validação - Valor total da compra incorreto.", ScreenShots.capture(driver));
		}
	}
	public void checkAddress(String address, String city) {
		if(this.pageContains(address) && this.pageContains(city)) {
			Reports.log(Status.PASS, "Validação - O endereço está correto.", ScreenShots.capture(driver));
		} else {
			Reports.log(Status.FAIL, "Validação - O endereço está incorreto.", ScreenShots.capture(driver));
		}
	}
}