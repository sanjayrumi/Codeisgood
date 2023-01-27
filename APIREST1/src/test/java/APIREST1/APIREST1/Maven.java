package APIREST1.APIREST1;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Maven {

	public static void main(String[] args) 
	{
		Response r=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APILearn");
		System.out.println("status code is"+r.getStatusLine());
		System.out.println("Response code is");
		System.out.println(r.asString());

	}

}
