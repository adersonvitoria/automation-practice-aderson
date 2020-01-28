package application.tasks;

import org.openqa.selenium.WebDriver;
import application.objects.AddProductCartObject;

public class AddProductCartTask {
	private AddProductCartObject product;
	
	public AddProductCartTask(WebDriver driver){
		this.product = new AddProductCartObject(driver);
	}
	public void addProductToCart() {
		product.addToCart().click();
	}
	public String totalAmount() {
		return product.total().getText();
	}
	public void checkout() {
		product.ProceedToCheckout().click();
	}
	public void checkoutSummary() {
		product.ProceedToCheckoutSummary().click();
	}
	public String productName() {
		return product.productNameCheck().getText();
	}
}