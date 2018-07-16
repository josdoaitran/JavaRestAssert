package tests;

import com.jayway.restassured.RestAssured;
import common.BaseTest;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

/**
 * Example test with Rest Assert
 */
public class getWeatherData extends BaseTest{
    @Test(description="Testing the web service whether success 200 has been received")
    @Description ("Description : Testing the web service whether success 200 has been received")
    @Severity (SeverityLevel.CRITICAL)
    public void testGetWeatherDataFromALocation() {
        RestAssured.baseURI = baseAPIUrl;

    }
}

