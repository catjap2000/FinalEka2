package PromodTest;

import StepObject.CareerPageSteps;
import Utils.ChromeRunner;
import org.junit.Test;

public class CareerTest extends ChromeRunner {
    @Test
    public void CareerPgPromod() {
        CareerPageSteps Career_Steps = new CareerPageSteps();
        Career_Steps
                .openUrl();

        Career_Steps
                .CookiesMainPg()
                .GoCareerPage()
                .AcceptCookies()
                .OurJobOffer()
                .KeyWordInput()
                .LocationInput()
                .JobTypeInput()
                .CategoryInput()
                .SearchButton()
                .ChooseJA()
                .ApplyButton();

        Career_Steps
                .FirstNameInput()
                .LastNameInput()
                .EmailInput()
                .PasswordInput()
                .DialCodeDropDown().PhoneNumberInput()
                .Terms()
                .SignUp();

    }
}
