package application.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import application.testcases.*;
import project.framework.Reports;


@RunWith(Suite.class)
@SuiteClasses({
	BuyProductTestCase.class,
	ApiShoppingCart.class
})
public class SuiteTestRegression {
	@BeforeClass
	public static void initTest() {
		Reports.create("Automation Practice Testing Site", "Regression Suite");
	}
	@AfterClass
	public static void endTest() {
		Reports.close();
	}
}