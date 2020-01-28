package application.testcases;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import application.tasks.AddProductCartTask;
import application.tasks.AddressTask;
import application.tasks.NewUserTask;
import application.tasks.PaymentTask;
import application.tasks.ShippingTask;
import application.verificationpoints.VerificationPoint;
import project.framework.Drivers;
import project.framework.Reports;
import project.framework.ScreenShots;

public class BuyProductTestCase {
	private WebDriver driver;
	private AddProductCartTask add;
	private AddressTask address;
	private NewUserTask newUser;
	private PaymentTask payment;
	private ShippingTask shipping;
	private VerificationPoint verificationPoint;
	
	private static int getNumero() {
	return new Random().nextInt(1000);
}
	
	@Before
	public void setUp() {
		Reports.startTest("Teste - Realizar pedido de compra com sucesso.");
		driver = Drivers.getFirefoxDriver();
		add = new AddProductCartTask(driver);
		address = new AddressTask(driver);
		newUser = new NewUserTask(driver);
		payment = new PaymentTask(driver);
		shipping = new ShippingTask(driver);
		verificationPoint = new VerificationPoint(driver);
	}
	@Test
	public void testMain() {
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		Reports.log(Status.INFO, "O Website foi carregado.", ScreenShots.capture(driver));
		add.addProductToCart();
		String name = add.productName();
		add.checkout();
		verificationPoint.checkProduct(name);
		String total = add.totalAmount();
		add.checkoutSummary();
		newUser.newAccount("adersonrosa"+ getNumero() + "@testedigitalbusiness.com");
		String addressAccount = "Jairo Dutra Street";
		String cityAccount = "Gravatai";
		newUser.personalInformation("Aderson", "Rosa", "password", addressAccount, cityAccount, "12345", "0102030405");
		newUser.submitAccount();
		verificationPoint.checkAddress(addressAccount,cityAccount);
		address.proceed();
		shipping.agreeTerms();
		shipping.proceed();
		verificationPoint.checkTotal(total);
		payment.payByBankWire();
		payment.proceed();
		verificationPoint.checkOrder();
		}
	@After
	public void tearDown() {
		driver.quit();
	}
}