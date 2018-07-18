package tests;

import com.jayway.restassured.response.Response;
import common.BaseTest;
import common.Requests;
import common.jsonData.WeatherJSONData;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.Logger;

import static common.BaseTest.baseAPIUrl;
import static common.jsonData.WeatherJSONData.triggerWeather;

/**
 * Example test with Rest Assert
 */
public class getWeatherData extends Requests{
    private static Logger logger = Logger.getLogger(getWeatherData.class.getSimpleName());
    @Test()
    public void testGetWeatherDataFromALocation() {
        Response re = Requests.getRequest("/data/2.5/weather?q=London,uk?appid=e39b66bad0e2961268c73508c026551b");
        Requests.validateCodeResponse(re,200);
    }
    @Test()
    public void testPostWeatherData() throws IOException {
        Response re = postRequest("/data/3.0/stations?appid=e39b66bad0e2961268c73508c026551b", triggerWeather);
        System.out.println(re.toString());
        Requests.validateCodeResponse(re, 201);
    }
}

