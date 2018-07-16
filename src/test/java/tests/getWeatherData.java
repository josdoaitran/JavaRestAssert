package tests;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.internal.http.Method;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import common.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static common.BaseTest.baseAPIUrl;

/**
 * Example test with Rest Assert
 */
public class getWeatherData extends BaseTest{
    @Test(description="Testing the web service whether success 200 has been received")
    public void testGetWeatherDataFromALocation() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response= httpRequest.get(baseAPIUrl+"/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
    }
}

