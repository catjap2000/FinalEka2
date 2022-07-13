package PromodTest;

import StepObject.CareerPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

@Listeners(Utils.TestListener.class)
public class CareerTest extends ChromeRunner {
    @Test
    @Description ("Go to Career page, using filter (location, job type & category) choose 1 Job Announcement and Apply")
    public void CareerPgPromod() throws InterruptedException {
        CareerPageSteps Career_Steps = new CareerPageSteps();
        SoftAssert softAssert = new SoftAssert();
        Career_Steps
                .openUrl();

        Career_Steps
                .GoCareerPage()
                .CareerAcceptCookies()
                .OurJobOffer()
                .KeyWordInput()
                .LocationInput()
                .JobTypeInput()
                .CategoryInput()
                .SearchButton()
                .ChooseJA()
                .ApplyButton();
        Thread.sleep(2000);

        Career_Steps
                .FirstNameInput()
                .LastNameInput()
                .EmailInput()
                .PasswordInput()
                .DialCodeDropDown().PhoneNumberInput()
                .Terms()
                .SignUp();

        softAssert.assertAll();
    }
}
