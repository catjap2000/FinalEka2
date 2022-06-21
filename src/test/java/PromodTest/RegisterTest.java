package PromodTest;

import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import org.junit.Assert;
import org.junit.Test;

import static DataObject.RegisterPageData.MainLogInEmail;

public class RegisterTest extends ChromeRunner {

    @Test
    public void RegPgProm() throws InterruptedException {
        RegisterPageSteps Reg_Steps = new RegisterPageSteps();

        Reg_Steps
                .openUrl();

        Reg_Steps
                .Cookies()
                .GoToAccountPage()
                .mail()
                .MainPassword()
                .NewsletterCheckBox()
                .Account_Button();

        Assert.assertTrue(Reg_Steps.AcceptCookies.isSelected());
        Assert.assertTrue(Reg_Steps.MainCreateAccBtn.isDisplayed());


        Reg_Steps
                .MainFamilyName()
                .MainFirstNm()
                .DoB()
                .MainPhoneNumber()
                .ContinueBut();

}


}



