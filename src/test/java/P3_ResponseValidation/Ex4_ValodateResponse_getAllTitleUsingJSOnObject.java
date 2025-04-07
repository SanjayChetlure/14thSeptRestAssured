package P3_ResponseValidation;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Ex4_ValodateResponse_getAllTitleUsingJSOnObject
{

	    @Test(priority = 4)
		public void getAllTitlesFromResponseUsingJSONObject() 
		{
			//approach3: Converting Response into JSON Object
			
			Response resp = given()    
								.contentType(ContentType.JSON)
							.when()
								.get("http://localhost:3000/store");
				
			//converting response into JSON Object type
			JSONObject jo=new JSONObject(resp.asString());  
			
			int lastIndex = jo.getJSONArray("book").length()-1;
			System.out.println(lastIndex);
			
			//        0  3<=3
			for(int i=0; i<=lastIndex; i++)
			{
				//                                                  2
//				String title = jo.getJSONArray("book").getJSONObject(i).get("title").toString();
				String title = jo.getJSONArray("book").getJSONObject(i).getString("title");
				System.out.println(title);
				
			}
		}


	

}
