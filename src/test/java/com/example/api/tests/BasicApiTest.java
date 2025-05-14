package com.example.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class BasicApiTest {
    public static void main(String[] args) {
        // Define the base URI of the API
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com";

        // Send a GET request to /posts/1 endpoint
        Response response = RestAssured.given()
                                        .when()
                                        .get("/posts/1");

        // Print the response body
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
        String str = response.getBody().asString();

        // Print the status code
        System.out.println("Status Code: " + response.getStatusCode());
        Assert.assertEquals((str.contains("qum42")) /*Expected value*/, true /*Actual Value*/);
    }
}

