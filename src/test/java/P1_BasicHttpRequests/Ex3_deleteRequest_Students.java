package P1_BasicHttpRequests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex3_deleteRequest_Students
{
	@Test(priority = 1)
	public void TC1_getAllStudents() 
	{
		given()
			.contentType("application/json")
		.when()	
			.delete("http://localhost:3000/students/5")
		.then()
			.statusCode(200)
			.log().all();
	}
	

}
