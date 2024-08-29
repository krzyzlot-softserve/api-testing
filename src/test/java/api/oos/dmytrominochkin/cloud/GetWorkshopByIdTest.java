package api.oos.dmytrominochkin.cloud;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWorkshopByIdTest {
    @Test
    public void getWorkshopByIdTest() {
        Response response = RestAssured.get("https://api.oos.dmytrominochkin.cloud/api/v1/Workshop/GetById/08db6cb8-3c33-415f-83e5-3528fa4ccd7e");
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200, but it's not");

        String title = response.jsonPath().getString("title");
        Assert.assertEquals(title, "IT club");
    }
}
