package StepObject;

import PageObject.CareerRegPg;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Selenide.open;

public class CareerPageSteps extends CareerRegPg {

    @Step("Open Main Page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Open Career Page")
    public void openUrl() {
        open("https://www.promod.com/en/");
    }


    @Step("Accept Cookies on Main Page")
    public CareerPageSteps CookiesMainPg(){
        AcceptCookiesMain.click();
        return this;
    }

    @Step ("Go to Career Page")
    public CareerPageSteps GoCareerPage(){
        open ("https://promodjob.talentview.io/?source=site_entreprise");
        return this;
    }

    @Step
    @Description("Choose Our Job Offers")
    public CareerPageSteps OurJobOffer() {
        CareerOurJobOffers.click();
        return this;
    }

    @Step
    @Description("Fill Keyword Input, Value: {Tech}")
    public CareerPageSteps KeyWordInput(String careerKeyWordInput) {
        CareerKeyword.setValue(careerKeyWordInput).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Fill Location Input, Value: {France}")
    public CareerPageSteps LocationInput(String locationInput) {
        CareerLocation.setValue(locationInput);
        CareerLocation.dragAndDropTo(CareerLocation2).click();
        CareerLocation2.shouldBe(Condition.editable, Condition.text("France")).click();
        CareerLocation.shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Skip Job Type Input, Value: {0}")
    public CareerPageSteps JobTypeInput(String jobType) {
        CareerJobType.shouldBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Select Category(Choose from DropDown)")
    public CareerPageSteps CategoryInput() {
        dropdown.click();
//        CareerCategoryCheckBx.selectOption(2);
        CareerCategoryCheckBx.click();
        dropdown.click();
//        CareerCategoryCheckBx.shouldBe(selected);
//        Assert.assertEquals(CareerCategoryCheckBx.is(selected));
        return this;

    }

    @Step
    @Description ("Click on Search Button")
    public CareerPageSteps SearchButton() {
        CareerJobSearchBtn.submit();
        return this;
    }

    @Step
    @Description ("Choose first Job Announcement, Value: {0}")
    public CareerPageSteps ChooseJA() {
        CareerJA.click();
        return this;
    }

    @Step
    @Description ("Click Apply Button")
    public CareerPageSteps ApplyButton() {
        CareerJobApplyBtn.click();
        return this;
    }

    @Step
    @Description ("Fill First Name, Value: {Faker}")
    public CareerPageSteps FirstNameInput(String firstname) {
        CareerFirsNameInput.setValue(firstname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Fill Last Name, Value:{Faker}")
    public CareerPageSteps LastNameInput(String lastname) {
        CareerLastNameInput.setValue(lastname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Fill Email Address, Value: {catjap@gmail.com}")
    public CareerPageSteps EmailInput(String emailCareer) {
        CareerRegEmailInput.setValue(emailCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Create Your Password, Value: {Faker}")
    public CareerPageSteps PasswordInput(String passwordCareer) {
        CareerRegPasswordInput.setValue(passwordCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Select Country Dial Code (DropDown), Value: {Georgia (საქართველო)}")
    public CareerPageSteps DialCodeDropDown() {
        CareerDialCodeDropDown.click();
        CareerCountryName.shouldBe(Condition.selected);
        return this;
    }

    @Step
    @Description ("Fill Phone Number, Value: {550550550}")
    public CareerPageSteps PhoneNumberInput(String phoneNum) {
        CareerPhoneNumberInput.setValue(phoneNum).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Check Terms Box")
    public CareerPageSteps Terms() {
        CareerTermsCheckBx.shouldBe(checked);
        return this;
    }

    @Step
    @Description ("Click SignUp Button")
    public CareerPageSteps SignUp() {
        SignUpBtn.click();
        return this;
    }
    @Step
    @Description("Accept Cookies on Career Page")
    public CareerPageSteps CareerAcceptCookies() {
        CareerCookies.click();
        return this;
    }

//    @Step
//    @Description("Accept Cookies on Career Page")
//    public CareerPageSteps CareerAcceptCookies() {
//        if (CareerCookies.is(Condition.visible))
//            CareerCookies.should().click();
//        else if (CareerCookies.is(Condition.not(Condition.visible))) {
//            CareerCookies.shouldNot().click();
//
//        }
//        return null;
    }




