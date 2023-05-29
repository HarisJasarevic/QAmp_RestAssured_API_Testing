package com.QAmp.restApiPractice.steps;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static com.QAmp.restApiPractice.utilities.GlobalValues.HOST;

public class HTTPRequest {

    public static <T> Response sendPostRequest (final String endpoint, final T requestBody) {
        return given().contentType("application/json")
                .body(requestBody)
                .baseUri(HOST)
                .post(endpoint);
    }
}
