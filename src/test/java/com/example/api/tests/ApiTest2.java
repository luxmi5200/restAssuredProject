package com.example.api.tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

public class ApiTest2 {
	
	@Test(groups = {"api"})
	public void testGetEndpoint() {
	baseURI = "http://jsonplaceholder.typicode.com";
	given().
	when().
	get("/posts/1").
	then().
	body("userId", equalTo(1)).
	body("id", equalTo(1)).
	body("title", notNullValue());
	}
}


