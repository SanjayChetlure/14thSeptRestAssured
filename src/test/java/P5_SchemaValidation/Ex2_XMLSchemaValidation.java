package P5_SchemaValidation;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Ex2_XMLSchemaValidation
{
	@Test
	public void XMLSchemaValidation()
	{
		given()
		.when()
			.get("request url")
		.then()	
			.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("XMLSchema.xsd") );

	}




}
