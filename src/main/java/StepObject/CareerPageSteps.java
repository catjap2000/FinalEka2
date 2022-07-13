package StepObject;

import DataObject.CareerRegData;
import PageObject.CareerRegPg;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static DataObject.CareerRegData.*;
import static com.codeborne.selenide.Selenide.open;

public class CareerPageSteps extends CareerRegPg {

    @Step ("Open Main Page")
    public void openUrl(){
        open ("https://www.promod.com/en/");
    }

//    @Step("Accept Cookies on Main Page")
//    public CareerPageSteps CookiesMainPg(){
//        AcceptCookiesMain.click();
//        return this;
//    }

    @Step ("Go to Career Page")
    public CareerPageSteps GoCareerPage(){
        CareerPageUrl.click();
        return this;
    }
    @Step("Accept Cookies on Career Page")
    public CareerPageSteps CareerAcceptCookies(){
        CareerCookies.click();
        return this;
    }
    @Step ("Choose Our Job Offers")
    public CareerPageSteps OurJobOffer(){
        CareerOurJobOffers.click();
        return this;
    }
    @Step ("Fill Keyword Input, Value: {Tech}")
    public CareerPageSteps KeyWordInput(){
        CareerKeyword.setValue(CareerKeyWordInput);
        return this;
    }
    @Step ("Fill Location Input, Value: {France}")
    public CareerPageSteps LocationInput(){
        CareerLocation.setValue(CareerLocationInput);
        return this;
    }
    @Step ("Skip Job Type Input, Value: {0}")
    public CareerPageSteps JobTypeInput(){
        CareerJobType.setValue(CareerJobTypeInput);
        return this;
    }
    @Step ("Select Category(Choose from DropDown)")
    public CareerPageSteps CategoryInput(){
        CareerCategoryInputDD.setValue(CareerCategoryChBx).shouldBe(Condition.selected).click();
        return this;
    }
    @Step("Click on Search Button")
    public CareerPageSteps SearchButton(){
        CareerJobSearchBtn.click();
        return this;
    }
    @Step ("Choose first Job Announcement, Value: {0}")
    public CareerPageSteps ChooseJA(){
        CareerJA.setValue("0").click();
        return this;
    }
    @Step ("Click Apply Button")
    public CareerPageSteps ApplyButton(){
        CareerJobApplyBtn.click();
        return this;
    }
    @Step ("Fill First Name, Value: {Faker}")
    public CareerPageSteps FirstNameInput(){
        CareerFirsNameInput.setValue(CareerFirstNameInput).shouldNotBe(Condition.empty);
        return this;
    }
    @Step("Fill Last Name, Value:{Faker}")
    public CareerPageSteps LastNameInput(){
        CareerLastNameInput.setValue(CareerRegData.CareerLastNameInput).shouldNotBe(Condition.empty);
        return this;
    }
    @Step("Fill Email Address, Value: {catjap@gmail.com}")
    public CareerPageSteps EmailInput(){
        CareerRegEmailInput.setValue(CareerLogInEmailInput).shouldNotBe(Condition.empty);
        return this;
    }
    @Step("Create Your Password, Value: {Faker}")
    public CareerPageSteps PasswordInput(){
        CareerRegPasswordInput.setValue(CareerLogInPassword).shouldNotBe(Condition.empty);
        return this;
    }
    @Step("Select Country Dial Code (DropDown), Value: {Georgia (საქართველო)}")
    public CareerPageSteps DialCodeDropDown(){
        CareerDialCodeDropDown.click();
        CareerCountryName.shouldBe(Condition.selected);
        return this;
    }
    @Step("Fill Phone Number, Value: {550550550}")
    public CareerPageSteps PhoneNumberInput(){
        CareerPhoneNumberInput.setValue(CareerPhoneNumInput).shouldNotBe(Condition.empty);
        return this;
    }
    @Step("Check Terms Box")
    public CareerPageSteps Terms(){
        CareerTermsCheckBx.shouldBe(Condition.checked);
        return this;
    }
    @Step ("Click SignUp Button")
    public CareerPageSteps SignUp(){
        SignUpBtn.click();
        return this;
    }


}


