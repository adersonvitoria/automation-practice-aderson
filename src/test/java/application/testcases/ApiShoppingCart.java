package application.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aventstack.extentreports.Status;

import project.framework.Reports;

import static io.restassured.RestAssured.given;

public class ApiShoppingCart {
	private String baseUri;

	@Before
	public void setUp() {
		Reports.startTest("Teste - API do Carrinho de Compras.");
		baseUri = "http://5d9cc58566d00400145c9ed4.mockapi.io/shopping_cart";
		Reports.log(Status.INFO, "A API foi carregada");
		
	}

	@Test
	public void testMain() {
			
		given()
		.when()
			.get(baseUri)
		.then()
			.statusCode(200);
		
}

	@After
	public void tearDown() {
		Reports.log(Status.PASS,"Validação - StatusCode(200) OK");
	}

}
