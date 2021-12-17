import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;
public class Test02_GET {
	@Test
	public void test1() {

		given().get("https://reqres.in/api/users?page=2").then().
		statusCode(200).
		body("data.id[1]", equalTo(8)).
		body("data.first_name", hasItems("Michael","Lindsay")).
		log().all();
	}

}


