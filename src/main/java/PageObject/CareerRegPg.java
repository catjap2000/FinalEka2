package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CareerRegPg {
    public SelenideElement

            AcceptCookiesMain = $("#popin_tc_privacy_button"),
            CareerPageUrl = $("promodjob.talentview.io/?source=site_entreprise"),
            CareerCookies = $(".ms-1 btn btn-primary btn-lg ms-1"),
            CareerOurJobOffers = $("Our job offers"),
            CareerKeyword = $("#10"),
            CareerLocation = $(By.id("#12")),
            CareerJobType = $(By.id("#14")),
            CareerCategoryInputDD = $("#16-prepend"),
            CareerCategoryCheckBx = $(new ByText("Siege")),
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





}
