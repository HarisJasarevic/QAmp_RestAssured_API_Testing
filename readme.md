Assignment 2
- Include PlaceLab API LoginTest into Test Automation suite (RESTAssured, Java, TestNG and
  Maven

RESTAssured Project Readme

This project is an example of using RESTAssured library for API testing. It includes classes and methods for making HTTP requests and validating responses. The project focuses on testing the login functionality of the "PlaceLab" application.

Project Structure

The project consists of the following packages and classes:

com.QAmp.restApiPractice.steps.HTTPRequest: This class contains methods for sending POST requests. It uses RESTAssured library and includes a sendPostRequest method that accepts an endpoint and a request body. The method sets the content type to JSON, adds the request body, and sends the request to the specified endpoint.

com.QAmp.restApiPractice.utilities.AuthenticationRequest: This class is responsible for creating the request body for authentication. It includes a method createMainBody that constructs a JSON object containing the email and password. The class also includes methods for validating the response headers and status code.

com.QAmp.restApiPractice.utilities.GlobalValues: This class defines global constants used in the project, such as the host URL, email, password, and the application JSON content type.

com.QAmp.restApiPractice.tests.LoginTest: This class contains a test case for the login functionality. It uses the AuthenticationRequest class to create the request body and the HTTPRequest class to send the POST request. The class includes methods for validating the response headers and status code.

Usage

To use this project, follow these steps:

Set the host URL, email, and password as system properties. You can do this by passing them as parameters or by configuring them in your test framework.

Run the LoginTest class to execute the test case for the login functionality. The test case sends a POST request to the /api/v2/sessions endpoint with the authentication request body. It then validates the response headers and status code.

Dependencies

This project relies on the following dependencies:

RESTAssured: A Java library for simplifying API testing. It is used for making HTTP requests and validating responses.

AssertJ: A fluent assertion library for Java. It is used for asserting the response headers and status code.

Conclusion

This RESTAssured project provides a basic example of testing the login functionality of the "PlaceLab" application. It demonstrates how to send a POST request with a request body, validate the response headers and status code, and use RESTAssured for API testing. Feel free to modify and expand this project according to your testing needs.
