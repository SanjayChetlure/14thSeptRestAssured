package P4_Logging_Path_Query_Parameters_Cookies_Headers;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.Set;


public class Ex3_Cookies
{	
	//@Test
	public void testCookies()
	{
		given()
		
		.when()
			.get("https://google.com/")		
		.then()
			.cookie("AEC","AVcja2eob4obOHIIqcQyuaKlcDINTcbB4KAuAdj0ikaAycefZ9P-zxbo-Ek")
			.log().all();
	}
	
	@Test
	public void getCookieInfo()
	{
		 Response resp = given()	
				 		.when()
				 			.get("https://google.com/");
		
		String cookieValue = resp.getCookie("AEC");
		 System.out.println("----Cookie Info----"+cookieValue);
	}
	
	@Test
	public void getAllCookies()
	{
		 Response resp = given()	
				 		.when()
				 			.get("https://google.com/");	
		 
		Map<String, String> map = resp.cookies();
		Set<String> allCookieNames = map.keySet();   //get all keys
		
		for(String cookieName:allCookieNames)
		{
			System.out.println(cookieName+" : "+map.get(cookieName));
		}
	}

	

	

}
