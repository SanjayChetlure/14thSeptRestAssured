package P3_ResponseValidation;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Ex3_ValodateResponse_getSingleDataUsingJSOnObject
{

		@Test(priority = 3)
		public void getSingleTitleUsingJSOBObject() 
		{
			//approach3: Converting Response into JSON Object
			
			Response resp = given()    
					.contentType(ContentType.JSON)
				.when()
					.get("http://localhost:3000/store");
				
			//converting response into JSON Object type
			JSONObject jo=new JSONObject(resp.asString());  
		
			//String	data=jo.getJSONArray("book").getJSONObject(3).getString("price").toString();
			String	data=jo.getJSONArray("book").getJSONObject(3).getString("title");
			System.out.println(data);
			
		}

	

}
