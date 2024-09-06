package testscripts;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class RestAss {

	
	


	public class TestExample1 
	{
		@Test
		public void test_1()
	{
			
			
			String x="{\r\n"
					+ "    \"clientId\":\"Ctel\",\r\n"
					+ "    \"clientSecret\":\"CteL12$\",\r\n"
					+ "    \"grantType\":\"client_credentials\",\r\n"
					+ "    \"scope\":\"read\"\r\n"
					+ "}";
		System.out.println(x);
		
		RequestSpecification httpRequest = RestAssured.given().
				
				header("Content-Type", "application/json")
				.body(x.toString())	;
		Response response = httpRequest.post("http://10.10.10.97:8081/v1/accessToken");
			
				given().
				
				header("Content-Type", "application/json")
				.body(x.toString())		
				.when()
				.post("http://10.10.10.97:8081/v1/accessToken")
				.then()
				.log().all();


				// First get the JsonPath object instance from the Response interface
				JsonPath jsonPathEvaluator = response.jsonPath();

				// Then simply query the JsonPath object to get a String value of the node
				// specified by JsonPath: City (Note: You should not put $. in the Java code)
				String token = jsonPathEvaluator.get("access_token");
				
				
				
				
				String y = "[\r\n"
						+ "    {\r\n"
						+ "        \"delvOrdNo\": \"90200\",\r\n"
						+ "        \"supLocCode\": \"5400\",\r\n"
						+ "        \"recLocCode\": \"5200\",\r\n"
						+ "        \"delvDate\": \"2022-04-26\",\r\n"
						+ "        \"itemInfo\": [\r\n"
						+ "            {\r\n"
						+ "                \"itemNo\": \"1\",\r\n"
						+ "                \"prodCode\": \"7245257\",\r\n"
						+ "                \"planQty\": 15\r\n"
						+ "            }\r\n"
						+ "        ]\r\n"
						+ "    }\r\n"
						+ "]";
				

				// Let us print the city variable to see what we got
				System.out.println("Token received from Response " + token);

				
				given().auth().oauth2(token).
				header("Content-Type", "application/json")
				.body(y.toString())		
				.when()			
				.post("http://10.10.10.97:8081/sap/v1/detailsSTO/")
				.then()
				.log().all();
	}
		
	}
}
