package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class RegisterPg {

    public SelenideElement

        MainGoToCreateAccPg = $(new ByText("Create an account")),
        AcceptCookies = $("#popin_tc_privacy_button"),
        MainEmailInput = $(".pmd-input_field pmd-input_field--email"),
        MainPasswordInput = $(new By.ByName("password")),
        MainNewsletterCheckBox = $(byName("newsletter")),
        MainCreateAccBtn = $("#pmd-button"),
        familyNameInput = $("#name"),
        firstNameInput = $("#firstname"),
        MainDateOfBirthInput = $("#dateOfBirth"),
        MainPhoneNumInput = $(new ByText("0606060606")),
        MainContinueButton = $(".pmd-button pmd-form_button pmd-button_primary");


}
