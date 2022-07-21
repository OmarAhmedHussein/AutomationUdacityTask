package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static stepDefinition.Hooks.driver;

public class sliderStepDef {

    @When("user clicks on first slider")
    public void slider() throws InterruptedException {

        driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[1]")).click();

    }
    @Then("relative product for first slider is display")
    public void FirstSlider(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphpne");
    }
    @When("user clicks on second slider")
    public void clickOnSecondSlider() throws InterruptedException {

        driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[2]")).click();

    }
    @Then("relative product for second slider is display")
    public void secondSlider(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=nokia");
    }

}
