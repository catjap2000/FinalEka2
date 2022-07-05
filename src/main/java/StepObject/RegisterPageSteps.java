package StepObject;

import PageObject.RegisterPg;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement.*;
import io.qameta.allure.Step;

import static DataObject.RegisterPageData.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class RegisterPageSteps extends RegisterPg {
        @Step ("Open Account Page")
        public void openUrl(){
            open ("https://auth2.promod.com/en/?redirect_uri=www.promod.com%2Fen%2Fauth%2Fcallback%2F");
        }

        @Step ("Accept Cookies Button")
        public RegisterPageSteps Cookies(){
            AcceptCookies.click();
            sleep(1000);
            return this;
        }

        @Step("Click Registration button")
        public RegisterPageSteps GoToAccountPage() {
            MainGoToCreateAccPg.click();
            return this;
        }
        @Step("Fill email address, Value: {Faker}")
        public RegisterPageSteps mail () {
            MainEmailInput.setValue(MainLogInEmail).shouldNotBe(Condition.empty);
            return this;
        }
        @Step("Fill Password, Value: {}")
        public RegisterPageSteps MainPassword (){
            MainPasswordInput.setValue(MainPasswordInp).click();
            return this;
        }
        @Step("Newsletter Checkbox")
        public RegisterPageSteps NewsletterCheckBox (){
            MainNewsletterCheckBox.click();
            return this;
        }
        @Step("Click Create My Account button")
        public RegisterPageSteps AccButton () {
            MainCreateAccBtn.click();
            return this;
        }
        @Step("Fill family name")
        public RegisterPageSteps MainCredentialsName() {
            familyNameInput.setValue(MainFamilyNm);
            return this;
        }
        @Step("Fill first name")
        public RegisterPageSteps MainCredentialsFirstName() {
            firstNameInput.setValue(MainFirstNm);
            return this;
        }
        @Step("Fill DoB")
        public RegisterPageSteps MainCredentialsDate() {
            MainDateOfBirthInput.setValue(MainDateOfBirth);
            return this;
        }
        @Step("Fill Phone number")
        public RegisterPageSteps MainCredentialsPhone() {
            MainPhoneNumInput.setValue(MainPhoneNum);
            return this;
        }
        @Step("Click Continue button")
        public RegisterPageSteps ContinueBut (){
            MainContinueButton.click();
            return this;
        }
    }

