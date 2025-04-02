package P1_BasicHttpRequests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex1_getRequest_Students
{
	@Test(priority = 1)
	public void TC1_getAllStudents() 
	{
		given()
			.contentType("application/json")
		.when()	
			.get("http://localhost:3000/students")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority = 2)
	public void TC2_getValidStudent() 
	{
		given()
			.contentType("application/json")
		.when()	
			.get("http://localhost:3000/students/1")
		.then()
			.statusCode(200);
	}
	
	
	@Test(priority = 3)
	public void TC3_getInValidStudent() 
	{
		given()
			.contentType("application/json")
		.when()	
			.get("http://localhost:3000/students/5")
		.then()
			.statusCode(404);
	}
}
