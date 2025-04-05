package P4_Logging_Path_Query_Parameters_Cookies_Headers;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Ex4_Headers
{
	@Test
	public void testHeades_withouStoringResponse()
	{
		given()
		
		.when()
			.get("https://google.com/")
		.then()
			.header("Content-Type", "text/html; charset=ISO-8859-1")
			.header("Content-Encoding", "gzip")
			.header("Server", "gws");
	}

	//@Test
	public void getHeadersInfo()
	{
		 Response resp = given()
				 		.when()
				 			.get("https://google.com/");
		
		String header = resp.getHeader("Content-Type");
		 System.out.println("----Content type----"+header);
	}
	

		
	@Test(priority = 3)   //not that must useful / as log.all() /log.headers()
	public void getAllHeadersInfo()
	{
		 Response resp = given()
		
		.when()
			.get("https://google.com/");
		
		Headers allHeader = resp.headers();
		
		for(Header singleHeader:allHeader)
		{
			System.out.println(singleHeader.getName()+" : "+singleHeader.getValue());
		}
	}


}
