package P2_CreatingPostRequestPayloadInMultipleWays;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;


public class Ex4_postRequest_POJOClass
{
	@Test
	public void TC1_createNewStudentDeatail() 
	{
		
		StudentsPOJO data=new StudentsPOJO();
		data.setId("5");
		data.setName("Rahul");
		data.setLocation("Nanded");
		data.setPhone("5555");
		
		String [] courses= {"Sql", "Api"};
		data.setCourses(courses);

		given()
			.contentType("application/json")
			.body(data)
		.when()	
			.post("http://localhost:3000/students")
		.then()
			.statusCode(201)
			.log().all();
	}
	
}
