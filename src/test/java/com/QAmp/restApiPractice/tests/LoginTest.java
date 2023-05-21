package com.QAmp.restApiPractice.tests;

import com.QAmp.restApiPractice.steps.HTTPRequest;
import com.QAmp.restApiPractice.utilities.AuthenticationRequest;
import io.restassured.response.Response;
import org.testng.annotations.*;
import java.util.logging.Logger;

public class LoginTest {

    private static final Logger LOGGER = Logger.getLogger("Login Test");

    @Test (priority = 1, description = "This verifies that user is able to log in to " + "PlaceLab.", suiteName = "Login Test")
    public void testLoginPagePositive () {

        AuthenticationRequest authenticationRequest = new AuthenticationRequest();

        Response response = HTTPRequest.sendPostRequest("/api/v2/sessions", authenticationRequest.requestBody.toString());
        LOGGER.info("Submit authentication POST request");

        authenticationRequest.validateResponseHeaders(response.contentType());
        authenticationRequest.validateResponseStatusCode(response.statusCode());

//        //GIVEN
//        given()
//                .baseUri("https://demo.placelab.com")
//                .contentType("application/json")
//                .body(authenticationRequest.requestBody.toString())

//                //WHEN
//                .when()
//                .post("/api/v2/sessions")

//                //THEN
//                .then()
//                .statusCode(201)
//                .contentType(GlobalValues.APPLICATION_JSON)
//                .body("api_token", notNullValue());

    }
}
