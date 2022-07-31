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
            CareerCategoryCheckBx = $(By.xpath("//section[@id='jobs']/div/div[2]/form/div[4]/div[@id=\"dropdown-15\"]/ul/li[3]/a/span/span[@class=\"icon-wrapper\"]")),
            CareerJobSearchBtn = $(By.xpath("//html/body/div[1]/div[1]/div/main/div/section/div[2]/div/section/div/div[2]/form/div[5]/button")),
            CareerJA = $(By.xpath("//html/body/div[1]/div/div/main/div/section/div[2]/div/div/div/div/div/a/div/div/div[2]/div[@class=\"card-body\"]")),
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
