package application.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public abstract class BeforeTests {

    public static RequestSpecification requestSpecificationMockapi= getRequestSpecBuilder(
            "http://5d9cc58566d00400145c9ed4.mockapi.io"
    );

    private static RequestSpecification getRequestSpecBuilder(String uri) {

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(uri);
        return requestSpecBuilder.build();
    }
}

