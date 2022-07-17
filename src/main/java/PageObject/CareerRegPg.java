package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CareerRegPg {
    public SelenideElement

            AcceptCookiesMain = $("#popin_tc_privacy_button"),
            CareerPageSelector = $(new By.ByXPath("//*[@id=\"abtest-footer\"]/nav/div[3]/div[2]/ul/li[4]/a")),
            CareerCookies = $(new ByText("Accept all")),
            CareerOurJobOffers = $(new ByText("Our job offers")),
            CareerKeyword = $(new By.ByXPath("//*[@id=\"10\"]")),
            CareerLocation = $(new By.ByXPath("//*[@id=\"12\"]")),
            CareerLocation2 = $(new ByText("France")),
            CareerJobType = $(new By.ByXPath("//*[@id=\"14\"]")),
            dropdown = $(new By.ByXPath("//*[@id=\"16\"]")),
            CareerCategoryCheckBx = $("Siege"),
            CareerJobSearchBtn = $("Search"),
            CareerJA = $(".card-title bold truncate--2"),
            CareerJobApplyBtn = $(new ByText("Apply")),
            CareerFirsNameInput = $(By.id("#20")),
            CareerLastNameInput = $(By.id("#21")),
            CareerRegEmailInput = $(By.id("#22")),
            CareerRegPasswordInput = $(By.id("#23")),
            CareerDialCodeDropDown = $(".iti__selected-dial-code"),
            CareerCountryName = $("Georgia (საქართველო)"),
            CareerPhoneNumberInput = $(By.id("#24")),
            CareerTermsCheckBx = $(By.id("#25")),
            SignUpBtn = $(new ByText(" Sign up"));


    protected ElementsCollection.SelenideElementIterable getOptions() {
        return null;
    }
}
