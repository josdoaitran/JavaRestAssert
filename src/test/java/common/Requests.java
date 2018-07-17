package common;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.util.logging.Logger;

public class Requests extends BaseTest{
    private static Logger logger = Logger.getLogger(Utilities.class.getSimpleName());

    /**
     * Method to make a request to API.
     * Return to raw response.
     * @param apiUrl
     * @return
     */
    public Response getRequest(String apiUrl){
        logger.info("Get request to: "+ apiUrl);
        RequestSpecification httpRequest = RestAssured.given();
        Response response= httpRequest.get(baseAPIUrl+apiUrl);
        String responseBody = response.getBody().asString();
        return response;
    }

    /**
     * Validate Header response: Content-Type
     * @param response
     * @param expectResult
     */
    public void validateContentTypeRespHeader(Response response, String expectResult){
        String contentType = response.header("Content-Type");
        boolean right = true;
        Assert.assertEquals(contentType,expectResult);
    }

    /**
     * Validate Header response: Server
     * @param response
     * @param expectResult
     */
    public void validateSeverRespHeader(Response response, String expectResult){
        String contentType = response.header("Server");
        boolean right = true;
        Assert.assertEquals(contentType,expectResult);
    }

    /**
     *
     * @param response
     * @param expectResult
     */
    public void validateContentEndcodingRespHeader(Response response, String expectResult){
        String contentType = response.header("Content-Encoding");
        boolean right = true;
        Assert.assertEquals(contentType,expectResult);
    }
}
