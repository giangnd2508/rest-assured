package full;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StudentListGetTest extends Base {

	@BeforeMethod
	public void basePath() {
		RestAssured.basePath = "/student";
	}

	@Test
	public void showAllStudentInfoTest() {
		Response res = given().when().get("/list");
		System.out.println(res.body().prettyPrint());
	}
}
