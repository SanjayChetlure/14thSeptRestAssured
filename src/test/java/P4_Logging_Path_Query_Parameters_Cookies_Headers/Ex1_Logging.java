package P4_Logging_Path_Query_Parameters_Cookies_Headers;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex1_Logging
{
	@Test(priority = 1)
	public void TC1_validUser() 
	{
		given()
			.contentType("application/json")
		.when()
			.get("https://reqres.in/api/users")
		.then()
			//.log().body();
			//.log().status();
			//.log().headers();
			//.log().cookies();
			.log().all();
	}
	

}
