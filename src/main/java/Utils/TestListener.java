package Utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Attachment(value = "Web Page Screenshot", type = "image/png")

    public byte[] takeScreenshot(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
    @Override
    public void onTestStart(ITestResult result){}

    @Override
    public void onTestSuccess (ITestResult result){}

    @Override
    public void onTestFailure (ITestResult result){
        WebDriver driver = com.codeborne.selenide.WebDriverRunner.getWebDriver();
        takeScreenshot(driver);
    }


    @Override
    public void onTestFailedButWithinSuccessPercentage (ITestResult result){}



}
