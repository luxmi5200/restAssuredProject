package com.example.api.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ApiTest1 {

@Test(groups = {"api"})
public void testGetEndpoint() {
baseURI = "http://jsonplaceholder.typicode.com";
given().
when().
get("/posts/1").
then().
statusCode(200).
body("userId", equalTo(1)).
body("id", equalTo(1)).
body("title", notNullValue());
}
}
