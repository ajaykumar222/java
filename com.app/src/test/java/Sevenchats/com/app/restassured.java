package Sevenchats.com.app;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import java.io.FileOutputStream;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class restassured {
	
	public static void main(String[] args) {
		
		
		ObjectMapper object = new ObjectMapper();
		JSONObject a=new JSONObject();
		a.put("name", "morpheus");
		a.put("job", "leader");
		RestAssured.baseURI="https://reqres.in/";
		Response Resp=given().header("Content-Type","application/json; charset=utf-8").contentType(ContentType.JSON).body(a).when().post("/api/users").then().assertThat().statusCode(201).and().
				header("server", "cloudflare").and(). 
				header("content-length", "65").
				extract().
				response();
				System.out.println("Response is\t"+Resp);
				
				String id=Resp.jsonPath().get("id");
				System.out.println(id);
				RestAssured.baseURI = "http://localhost:8888";
			    RequestSpecification httpRequest = RestAssured.given();
				Response response = httpRequest.post();
				JsonPath jsonPathEvaluator = response.jsonPath();
				String firstName = jsonPathEvaluator.get("id");
				System.out.println(firstName);
				
				
				FileOutputStream foutput=new FileOutputStream(src);
		         
		        // Specify the message needs to be written.
		        String message = "Data Imported Successfully.";
		         
		        // Create cell where data needs to be written.
		        sheet.getRow(i).createCell(3).setCellValue(message);
		          
		        // Specify the file in which data needs to be written.
		        FileOutputStream fileOutput = new FileOutputStream(src);
		         
		        // finally write content
		        workbook.write(fileOutput);
		         
		         // close the file
		        fileOutput.close();
				
		
	
	}

}
