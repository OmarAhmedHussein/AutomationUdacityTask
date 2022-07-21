package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinition.Hooks.driver;

public class search {

    public WebElement search_filed() {

        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement search_button() {
        return driver.findElement(By.cssSelector(" button[type=\"submit\"]"));
    }

    public WebElement search_by_using_suk() {

        return   driver.findElement(By.id("small-searchterms"));
    }

}
