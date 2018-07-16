package common;

import org.testng.annotations.BeforeSuite;

import static common.Utilities.sDirPath;

/**
 * Created by DoaiTran
 */
public class BaseTest {
    public static String baseAPIUrl;
    @BeforeSuite
    public void beforeTest(){
        baseAPIUrl = Utilities.getConfigValue(sDirPath+"/API.properties","API_URL");
    }

}
