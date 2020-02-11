package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
    static String place_id = null;
    RequestSpecification res;
    ResponseSpecification resspec;
    Response response;
    TestDataBuild data = new TestDataBuild();

    @Given("Add Json posts Payload with {string} {string} {string}")
    public void add_Json_posts_Payload_with(String titile, String body, String userid) throws IOException {
        res = given().spec(requestSpecification())
                .body(data.getBody(titile, body, userid));
    }

    @When("user calls {string} {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String id, String method) {
        APIResources resourceAPI = APIResources.valueOf(resource);
        System.out.println(resourceAPI.getResource());

        if (method.equalsIgnoreCase("POST"))
            response = res.when().post(resourceAPI.getResource());
        else if (method.equalsIgnoreCase("GET"))
            response = res.when().get(resourceAPI.getResource() + id);
    }

    @Then("the API call got success with {string}")
    public void the_API_call_got_success_with(String statuscode) {
        int sc = response.getStatusCode();
        String statusCode = Integer.toString(sc);
        assertEquals(statusCode, statuscode);
    }

    @Given("I am on the json placeholder page")
    public void i_am_on_the_json_placeholder_page() throws IOException {
        res = given().spec(requestSpecification());
    }

}
