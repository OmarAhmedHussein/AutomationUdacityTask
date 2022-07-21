package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class loginPage {

    public static WebElement clickLogin() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public static WebElement enterEmail() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public static WebElement enterPassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public static WebElement clickOnLoginButton() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public static WebElement seeMyAccount() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

}
