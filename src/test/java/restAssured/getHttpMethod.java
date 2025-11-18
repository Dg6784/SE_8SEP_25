package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//import jdk.jfr.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class getHttpMethod {
    @Test
    public void verifyGetHttpMethod(){
        RestAssured.baseURI = "https://reqres.in/api/users";
        System.out.println(RestAssured.baseURI); 
        Response res = RestAssured
                .given()
                .header("content-type", ContentType.JSON)
                //.header("Content-Type", "application/json")
                .header("x-api-key","reqres-free-v1")
                .when()
                .log().all()
                .get("/2")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();

    }

}
