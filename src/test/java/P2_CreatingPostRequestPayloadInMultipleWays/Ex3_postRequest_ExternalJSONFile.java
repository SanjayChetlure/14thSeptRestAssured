package P2_CreatingPostRequestPayloadInMultipleWays;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;


public class Ex3_postRequest_ExternalJSONFile
{
	@Test
	public void TC1_createNewStudentDeatail() 
	{
		File path=new File("D:\\6th July 2024\\Workspace\\14thSepRestAssured\\JSON Files\\RequestBody.json");
		
		given()
			.contentType("application/json")
			.body(path)
		.when()	
			.post("http://localhost:3000/students")
		.then()
			.statusCode(201)
			.log().all();
	}
	
}
