package P3_ResponseValidation;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Ex5_ValodateResponse_verifySpecificTitleUsingJSOnObject
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
			
			String expTitle="Moby Dick1";
			boolean titleFound=false;
			
			for(int i=0; i<=lastIndex; i++)
			{
				String actTitle = jo.getJSONArray("book").getJSONObject(i).getString("title");
				
				if (actTitle.equals(expTitle)) 
				{
					titleFound=true;
					break;
				}				
			}
			
			Assert.assertTrue(titleFound,"Failed-title not found");
		}


	

}
