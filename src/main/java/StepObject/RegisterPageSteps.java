package StepObject;

import PageObject.RegisterPg;
import com.codeborne.selenide.Condition;
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
        public RegisterPageSteps Cookies() throws InterruptedException {
            AcceptCookies.click();
            sleep(1000);
            return this;
        }

        @Step("Click Registration button")
        public RegisterPageSteps GoToAccountPage() {
            MainGoToCreateAccPg.click();
            return this;
        }
        @Step("Fill email address, Value: {catjap2000@gmail.com}")
        public RegisterPageSteps mail () throws InterruptedException {
            MainEmailInput.setValue(MainLogInEmail);
            MainEmailInput.shouldNotBe(Condition.empty).wait(1000);
            return this;
        }
        @Step("Fill Password, Value: {caterina550}")
        public RegisterPageSteps MainPassword (){
            MainPasswordInput.setValue(MainPassword).shouldNotBe(Condition.empty).click();
            return this;
        }
        @Step("Newsletter Checkbox")
        public RegisterPageSteps NewsletterCheckBox (){
            MainNewsletterCheckBox.click();
            return this;
        }
        @Step("Click Create My Account button")
        public RegisterPageSteps Account_Button () throws InterruptedException {
            MainCreateAccBtn.wait(1000);
            MainCreateAccBtn.click();
            return this;
        }
        @Step("Fill family name, Value: {Faker}")
        public RegisterPageSteps MainFamilyName (){
            familyNameInput.setValue(MainFamilyName).shouldNot(Condition.empty);
            return this;
        }
        @Step("fill First name, Value:{Caterina}")
        public RegisterPageSteps MainFirstNm (){
            firstNameInput.setValue(MainFirstNm).shouldNotBe(Condition.empty);
            return this;
        }
        @Step("Fill Date of Birth, Value: {02/01/75}")
        public RegisterPageSteps DoB (){
            MainDateOfBirthInput.setValue(MainDateOfBirth).shouldNotBe(Condition.empty);
            return this;
        }
        @Step("Fill phone number, Value: {Faker} ")
        public RegisterPageSteps MainPhoneNumber (){
            MainPhoneNumInput.setValue(MainPhoneNum).shouldNotBe(Condition.empty);
            return this;
        }
        @Step("Click Continue button")
        public RegisterPageSteps ContinueBut (){
            MainContinueButton.shouldBe(Condition.visible).click();
            return this;
        }
    }

