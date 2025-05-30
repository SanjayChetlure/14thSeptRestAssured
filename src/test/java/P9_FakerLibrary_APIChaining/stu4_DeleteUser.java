package P9_FakerLibrary_APIChaining;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class stu4_DeleteUser
{	
	@Test
	public void TC4_DeleteUser(ITestContext context)
	{
		//int id=(String)context.getAttribute("user_id");    //only test
		String id=(String)context.getSuite().getAttribute("student_id");   //complte suite
		
		given()
			.pathParam("id", id)
		.when()
			.delete("http://localhost:3000/students/{id}")
			
		.then()
			.statusCode(200)
			.log().all();		
	}

}
