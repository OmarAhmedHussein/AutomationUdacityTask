package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.loginPage;

import static pages.loginPage.seeMyAccount;
import static stepDefinition.registerStepDef.email;
import static stepDefinition.registerStepDef.pass;

public class loginStepDef {

    @Given("user navigates to login page")
    public void openLoginPage(){
        loginPage.clickLogin().click();

    }
    @When("user can login with valid email and valid password")
    public void logInWithValidData(){
       loginPage.enterEmail().sendKeys(email);
       loginPage.enterPassword().sendKeys(pass);

    }
    @Then("user can login successfully")
    public void clickLoginButton(){
        loginPage.clickOnLoginButton().click();
    }

    @And("user is now in homepage")
    public void openHomePage(){
        Assert.assertTrue(seeMyAccount().isDisplayed());


    }
}
