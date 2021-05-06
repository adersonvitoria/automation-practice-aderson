package application.api.requests;

import application.base.BeforeTests;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetApiBuyCartRequest extends BeforeTests {

    public Response shoppingCart() {
        return given()
                .spec(requestSpecificationMockapi)
                .header("Content-Type", "application/json")
                .when()
                .get("shopping_cart");
    }
}
