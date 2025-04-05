package P3_ResponseValidation;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Ex2_ValodateResponse_afterStoringResponse 
{
	@Test(priority = 1)
	public void TC1_testJSONResponse2() 
	{
		//approach2: store response in a variable (with capturing response)
		
		Response resp = given() 							
							.contentType(ContentType.JSON)   //.contentType("application/json")
						.when()
							.get("http://localhost:3000/store");
		
		
		Assert.assertEquals(resp.getStatusCode(), 200,"Failed- status code mismatch");
		Assert.assertEquals(resp.jsonPath().getString("book[0].title")	, "savings of the country");
		
		
//		Assert.assertEquals(resp.getHeader("Content-Type")	, "application/json");
//		Assert.assertEquals(resp.getCookie("CookieName")	, "CookieValue");			
	
		//Note: if title is not stored in same order then this approach will not work
		//we can write conditional/looping statement
	}
	

}
