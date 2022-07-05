package PromodTest;

import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.Test;

import static DataObject.RegisterPageData.*;

public class RegisterTest extends ChromeRunner {

    @Test
    public void RegPgProm() {
        RegisterPageSteps Reg_Steps = new RegisterPageSteps();

        Reg_Steps
                .openUrl();

        Reg_Steps
                .Cookies()
                .GoToAccountPage()
                .mail();
        Assert.assertTrue(Reg_Steps.MainEmailInput.is(Condition.not(Condition.empty)));

        Reg_Steps
                .MainPassword();
        Assert.assertTrue(Reg_Steps.MainPasswordInput.is(Condition.not(Condition.empty)));

        Reg_Steps
                .NewsletterCheckBox()
                .AccButton()
                .MainCredentialsName()
                .MainCredentialsFirstName()
                .MainCredentialsDate()
                .MainCredentialsPhone()
                .ContinueBut();




}


}



