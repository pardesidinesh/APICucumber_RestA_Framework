package resources;

/**
 * Below method can be used to prepare the test data for the POST request where ever body is required.
 *
 * @param - Are driven from the Feature file
 */

public class TestDataBuild {
    public String getBody(String title, String body, String userid) {
        String postbody = "{\"title\":\"" + title + "\",\"body\":\"" + body + "\",\"userid\":\"" + userid + "\"}";
        return postbody;
    }
}
