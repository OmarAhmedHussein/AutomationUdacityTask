package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static stepDefinition.Hooks.driver;

public class wishlistStepDef {

    int number;

    @Given("user click on wishlist for a specific product")
    public void wishlist()  {
        driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]")).click();
    }
    @When("wishlist notification success is visible")
    public void success_wishlist(){
        driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed();
    }
    @And("user get the number of wishlist items after adding product")
    public void wishlist_item(){
        String wishnum= driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
        System.out.println(wishnum);
        wishnum =wishnum.replaceAll("[^0-9]","");
        number =Integer.parseInt(wishnum);
        Assert.assertTrue(number>0);
    }
    @Then("number of wishlist items increased")
    public void wishlist_items_increased(){
        Assert.assertTrue(number>0);
    }

}
