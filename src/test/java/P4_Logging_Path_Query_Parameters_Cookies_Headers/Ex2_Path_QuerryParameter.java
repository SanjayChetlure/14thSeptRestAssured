package P4_Logging_Path_Query_Parameters_Cookies_Headers;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex2_Path_QuerryParameter
{	
	
	@Test(priority = 1)
	public void TC1() 
	{
		given()
			.pathParam("path1", "api")
			.pathParam("path2", "users")
			.queryParam("page", "2")
			.queryParam("id", "5")
			.contentType("application/json")
		.when()
			.get("https://reqres.in/{path1}/{path2}")
		.then()
			.log().all();
	}
	
	@Test(priority = 2)
	public void TC2() 
	{
		given()
			.pathParams("path1","api","path2","user")
			.queryParams("page","2","id","5")
			.contentType("application/json")
		.when()
			.get("https://reqres.in/{path1}/{path2}")
		.then()
			.log().all();
	}
	
	

}
