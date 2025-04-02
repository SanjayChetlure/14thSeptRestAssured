package P1_BasicHttpRequests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex1_getRequest_reqRes 
{
	@Test(priority = 1)
	public void TC1_validUser() 
	{
		given()
			.contentType("application/json")
		.when()
			.get("https://reqres.in/api/users/2")
		.then()
			.statusCode(200);
	}
	
	@Test(priority = 2)
	public void TC2_invalidUser() 
	{
		given()
			.contentType("application/json")
		.when()
			.get("https://reqres.in/api/users/100")
		.then()
			.statusCode(404);
	}

}
