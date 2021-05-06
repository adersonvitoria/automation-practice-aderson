package application.api.testCase;

import application.api.requests.GetApiBuyCartRequest;
import com.aventstack.extentreports.Status;
import framework.Reports;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class GetApiShoppingCartTest {
	public GetApiBuyCartRequest getapibuycartrequest = new GetApiBuyCartRequest();

	@Before
	public void setUp(){}

	@Test
	public void shoulValidHealthCheckMockApiShoppingCart() {

		Response responseShoppingCart = getapibuycartrequest.shoppingCart();

		responseShoppingCart
							.then()
							.statusCode(HttpStatus.SC_OK);

			Reports.log(Status.INFO, "A API foi carregada");
			Reports.log(Status.PASS, "Validação - StatusCode(200) OK");
	}

	@After
	public void tearDown(){}

}
