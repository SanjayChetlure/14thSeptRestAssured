package P1_BasicHttpRequests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;


public class Ex2_putRequest_Students
{
	@Test(priority = 1)
	public void TC1_updateStudentDetail() 
	{
		LinkedHashMap map=new LinkedHashMap();
		map.put("id", 1);
		map.put("name", "AMOL");
		map.put("location", "INDIA");
		map.put("phone", 1111);
		
		String [] ar= {"JAVA","SELENIUM"};
		map.put("courses", ar);
		
		
		given()
			.contentType("application/json")
			.body(map)
		.when()	
			.put("http://localhost:3000/students/1")
		.then()
			.statusCode(200)
			.log().all();
	}
	

}
