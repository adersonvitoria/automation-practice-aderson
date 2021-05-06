package application.testSuites;

import application.api.testCase.GetApiShoppingCartTest;
import application.web.testCase.BuyProductTestCaseTest;
import framework.Reports;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({
		GetApiShoppingCartTest.class,
		BuyProductTestCaseTest.class

})
public class SuiteTestRegressionTest {
	@BeforeClass
	public static void initTest() {
		Reports.create("Automation Practice Testing Site", "Regression Suite");
	}
	@AfterClass
	public static void endTest() {
		Reports.close();
	}
}