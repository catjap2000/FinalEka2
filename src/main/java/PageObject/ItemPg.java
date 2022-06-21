package PageObject;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ItemPg {
public SelenideElement
    ItemSearchBtn = $(".pmd-headerNav_svgLink pmd-button--noAppearance"),
    ItemSearchInput = $(".pmd-searchBar_container"),
    ItemStartSearchBtn = $(".pmd-button pmd-searchBar_submitButton pmd-button_primary"),
    ItemInSearchResults = $(".pmd-productThumbnailsWrapper_item"),
    ItemChooseColor = $(".pmd-colorThumbnail"),
    ItemChooseSizeBtn = $("Please choose your size "),
    ItemChooseSizeOptions = $("38"),
    ItemAddShoppingCart = $("Add to shopping cart"),
    ItemShoppingCardBtn = $(By.linkText("https://www.promod.com/en/cart/")),
    ItemAddMoreItemBtn =$("+");



}
