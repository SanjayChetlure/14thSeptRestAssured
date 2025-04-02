package P2_CreatingPostRequestPayloadInMultipleWays;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class Ex1_postRequest_Hashmap
{
	@Test(priority = 1)
	public void TC1_createNewStudentDeatail() 
	{
//		HashMap map=new HashMap();
		LinkedHashMap map=new LinkedHashMap();
		map.put("id", 3);
		map.put("name", "Ganesh");
		map.put("location", "Pune");
		map.put("phone", "3333");
		
		String [] ar={"Python","Selenium"};
		map.put("courses", ar);
		
		given()
			.contentType("application/json")
			.body(map)
		.when()	
			.post("http://localhost:3000/students")
		.then()
			.statusCode(201)
			.log().all();
	}
	
}
