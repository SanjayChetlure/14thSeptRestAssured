package P3_ResponseValidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex1_ValidateResponse_getRequest_Students
{
	
	//@Test(priority = 1)
	public void TC1_validateReponseOfSingleStudent() 
	{
		given()
			.contentType("application/json")
		.when()	
			.get("http://localhost:3000/students/1")
		.then()
			.log().all()
			.statusCode(200)				//status code
			.body("id", equalTo("1"))        //body
			.body("name", equalTo("AMOL"))
			.body("location", equalTo("INDIA"))
			.body("phone", equalTo(1111))
			.body("phone", equalTo(1111))
			.body("courses[0]", equalTo("JAVA"))
			.body("courses[1]", equalTo("SELENIUM"))
			.contentType("application/json");		//content Type
	}
	
	
	@Test(priority = 2)
	public void TC2_validateReponseOfMultipleStudent() 
	{
		given()
			.contentType("application/json")
		.when()	
			.get("http://localhost:3000/students")
		.then()
			.statusCode(200)
			.body("[0].id", equalTo("1"))
			.body("[0].name", equalTo("AMOL"))
			.body("[1].location", equalTo("US"))
			.body("[1].phone", equalTo("2222"))
			.body("[2].courses[0]", equalTo("Python"))
			.body("[3].courses[1]", equalTo("Selenium"))
			.contentType("application/json")
			.log().all();
	}
	
	

}
