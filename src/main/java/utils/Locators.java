package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By SEARCH_FIELD = By.id("searchInput");
        By SEARCH_BTN = By.id("searchButton");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.id("firstHeading");
    }


}