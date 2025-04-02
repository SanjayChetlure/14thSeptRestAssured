package P2_CreatingPostRequestPayloadInMultipleWays;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class Ex2_postRequest_org_JSONLibrary
{
	@Test
	public void TC1_createNewStudentDeatail() 
	{
		JSONObject jo=new JSONObject();
		jo.put("id", 4);
		jo.put("name", "Mahesh");
		jo.put("location", "Mumbai");
		jo.put("phone", "4444");
		
		String [] ar={"SQL","Selenium"};
		jo.put("courses", ar);
		
		given()
			.contentType("application/json")
			.body(jo.toString())
		.when()	
			.post("http://localhost:3000/students")
		.then()
			.statusCode(201)
			.log().all();
	}
	
}
