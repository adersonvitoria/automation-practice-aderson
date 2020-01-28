package application.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentObject {
	private WebDriver driver;
	
	public PaymentObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement payByBankWire() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("payment_module")));
		return element;
	}
	public WebElement iConfirmMyOrder() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")));
		return element;
	}
	
}