package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {

    @BeforeTest
    public static void PromConfig(){


        Configuration.browser = "Chrome";
        Configuration.baseUrl = "https://www.promod.com/en/";
        Configuration.browserSize = "1300x1080";



    }
}
