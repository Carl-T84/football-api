package com.football.api;


	import static io.restassured.RestAssured.given;

	import io.restassured.RestAssured;
	import org.testng.annotations.Test;

	public class FootballTests {
		@Test
		public void footballTestOne() {
			RestAssured.baseURI = "https://api-football-v1.p.rapidapi.com/countries";
			given()
					.header("x-rapidapi-key", "1b6a7927e9mshd369d0fa3926ee7p1579fdjsn0bbffc3154e0")
					.header("x-rapidapi-host", "api-football-v1.p.rapidapi.com")
					.when()
					.get()
					.then().log().all()
					.assertThat().statusCode(200);

		}

		@Test
		public void testPost() {
			RestAssured.baseURI = "https://reqres.in/api/users";
			String requestBody = "{\n" +
					"  \"name\": \"Carl\",\n" +
					"  \"job\": \"Thomas\" \n}";
			given()
					.body(requestBody)
					.when()
					.post()
					.then().log().all()
					.assertThat().statusCode(201);
		}
	}
