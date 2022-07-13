package PromodTest;

import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.RegisterPageData.*;

@Listeners(Utils.TestListener.class)
public class RegisterTest extends ChromeRunner {

    @Test
    public void RegPgProm() throws InterruptedException {
        RegisterPageSteps Reg_Steps = new RegisterPageSteps();

        Reg_Steps
                .openUrl();

        Reg_Steps
                .Cookies()
                .GoToAccountPage()
                .mail(MainLogInEmail);
        Assert.assertTrue(Reg_Steps.MainEmailInput.is(Condition.not(Condition.empty)));

        Reg_Steps
                .MainPassword(MainPasswordInp);
        Assert.assertTrue(Reg_Steps.MainPasswordInput.is(Condition.not(Condition.empty)));

        Reg_Steps
                .NewsletterCheckBox()
                .AccButton();
        Thread.sleep(1000);

        Reg_Steps
                .MainCredentialsName(MainFamilyNm)
                .MainCredentialsFirstName(MainFirstNm)
                .MainCredentialsDate(MainDateOfBirth)
                .MainCredentialsPhone(MainPhoneNum)
                .ContinueBut();




}


}



