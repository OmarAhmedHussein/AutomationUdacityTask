package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static stepDefinition.Hooks.driver;

public class followUsStepDef {

    @When("Click on facebook and twitter and youtube and rss icon")
    public void clickFacebook() throws InterruptedException {
        driver.findElement(By.linkText("Facebook")).click();
        Thread.sleep(3000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Twitter")).click();
        Thread.sleep(3000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("YouTube")).click();
        Thread.sleep(3000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("RSS")).click();
        Thread.sleep(3000);

    }

    @Then("Facebook and twitter and youtube and rss pages open")
    public void tabs(){
        SoftAssert soft =new SoftAssert();
        //soft.assertEquals(driver.findElement(By.linkText("Facebook")).getAttribute("href"),"http://www.facebook.com/nopCommerce");
        soft.assertEquals(driver.findElement(By.linkText("Twitter")).getAttribute("href"),"https://twitter.com/nopCommerce");
        soft.assertEquals(driver.findElement(By.linkText("YouTube")).getAttribute("href"),"http://www.youtube.com/user/nopCommerce");
        soft.assertEquals(driver.findElement(By.linkText("RSS")).getAttribute("href"),"/news/rss/1");
        soft.assertAll();
    }
}
