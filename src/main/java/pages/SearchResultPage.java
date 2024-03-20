package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class SearchResultPage {

    private WebDriver browser;

    public SearchResultPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getHeaderText() {
        return browser.findElement(Locators.SearchResultPage.HEADER_TEXT).getText();
    }

}