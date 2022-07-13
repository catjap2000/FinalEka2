package StepObject;

import PageObject.RegisterPg;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

import static DataObject.RegisterPageData.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class RegisterPageSteps extends RegisterPg {
        @Step
        @Description("Open Account Page")
        public void openUrl(){
            open ("https://auth2.promod.com/en/?redirect_uri=www.promod.com%2Fen%2Fauth%2Fcallback%2F");
        }
        @Step
        @Description("Accept Cookies Button")
        public RegisterPageSteps Cookies(){
            AcceptCookies.click();
            sleep(1000);
            return this;
        }

        @Step
        @Description("Click Registration button")
        public RegisterPageSteps GoToAccountPage() {
            MainGoToCreateAccPg.click();
            return this;
        }
        @Step
        @Description("Fill email address, Value: {Faker}")
        public RegisterPageSteps mail (String mainLogInEmail) {
            MainEmailInput.setValue(MainLogInEmail).shouldNotBe(Condition.empty);
            return this;
        }
        @Step
        @Description("Fill Password, Value: {}")
        public RegisterPageSteps MainPassword (String mainPasswordInp){
            MainPasswordInput.setValue(MainPasswordInp).click();
            return this;
        }
        @Step
        @Description("Newsletter Checkbox")
        public RegisterPageSteps NewsletterCheckBox (){
            MainNewsletterCheckBox.click();
            return this;
        }
        @Step
        @Description("Click Create My Account button")
        public RegisterPageSteps AccButton () {
            MainCreateAccBtn.click();
            return this;
        }
        @Step
        @Description("Fill family name")
        public RegisterPageSteps MainCredentialsName(String mainFamilyNm) {
            familyNameInput.setValue(MainFamilyNm);
            return this;
        }
        @Step
        @Description("Fill first name")
        public RegisterPageSteps MainCredentialsFirstName(String mainFirstNm) {
            firstNameInput.setValue(MainFirstNm);
            return this;
        }
        @Step
        @Description("Fill DoB")
        public RegisterPageSteps MainCredentialsDate(String mainDateOfBirth) {
            MainDateOfBirthInput.setValue(MainDateOfBirth);
            return this;
        }
        @Step
        @Description("Fill Phone number")
        public RegisterPageSteps MainCredentialsPhone(String mainPhoneNum) {
            MainPhoneNumInput.setValue(MainPhoneNum);
            return this;
        }
        @Step
        @Description("Click Continue button")
        public RegisterPageSteps ContinueBut (){
            MainContinueButton.click();
            return this;
        }
    }

