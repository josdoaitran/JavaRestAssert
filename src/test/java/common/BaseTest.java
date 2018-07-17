package common;

import org.testng.annotations.BeforeSuite;

import java.util.logging.Logger;

import static common.Utilities.sDirPath;

/**
 * Created by DoaiTran
 */
public class BaseTest {
    private static Logger logger = Logger.getLogger(BaseTest.class.getSimpleName());
    public static String baseAPIUrl;
    @BeforeSuite
    public void beforeTest(){
        baseAPIUrl = Utilities.getConfigValue(sDirPath+"/API.properties","API_URL");
    }

}
