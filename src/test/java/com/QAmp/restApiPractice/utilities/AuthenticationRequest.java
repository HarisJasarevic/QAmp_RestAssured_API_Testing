package com.QAmp.restApiPractice.utilities;

import org.assertj.core.api.Assertions;
import org.json.JSONObject;

public class AuthenticationRequest {

    private static String email;
    private static String password;
    public JSONObject requestBody;

    public AuthenticationRequest () {
        email = GlobalValues.EMAIL;
        password = GlobalValues.PASSWORD;
        createMainBody();
    }

    private void createMainBody () {
        JSONObject data = new JSONObject();
        data.put("password", password);
        data.put("email", email);
        requestBody = data;
    }

    public void validateResponseHeaders (final String contentType) {
        Assertions.assertThat(contentType)
                .as("Wrong JSON response content-type header!")
                .isEqualTo(GlobalValues.APPLICATION_JSON);
    }

    public void validateResponseStatusCode (final int statusCode) {
        Assertions.assertThat(statusCode)
                .as("Invalid status code!")
                .isEqualTo(201);
    }
}
