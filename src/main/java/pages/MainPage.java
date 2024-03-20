package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class MainPage {
    private WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }

    public MainPage clickInSearchField() {
        browser.findElement(Locators.MainPage.SEARCH_FIELD).click();
        return this;
    }

    public MainPage inputTextInSearchField(String text) {
        browser.findElement(Locators.MainPage.SEARCH_FIELD).sendKeys(text);
        return this;
    }

    public SearchResultPage clickInSearchButton() {
        browser.findElement(Locators.MainPage.SEARCH_BTN).click();
        return new SearchResultPage(browser);
    }

}