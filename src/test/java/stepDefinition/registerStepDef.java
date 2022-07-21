package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.registrationPage.*;

public class registerStepDef {

    public static String email = "omarahmed16795@gmail.com";
    public static String pass = "P@ssw0rd";
    public static String firstName = "Omar";
    public static String lastName = "Ahmed";

    @Given("open the registration page")
    public void goToUrl(){
        registerLink().click();
    }
    @When("enter valid data")
    public void enterValidData(){
        genderMale().click();
        firstName().sendKeys(firstName);
        lastName().sendKeys(lastName);
        dateOfBirthDay();
        dateOfBirthMonth();
        dateOfBirthYear();
        emailAddress().sendKeys(email);
        enterPassword().sendKeys(pass);
        enterConfirmPassword().sendKeys(pass);

    }
    @And("click registration button")
    public void clickRegistration(){
        clickRegisterButton().click();
    }
    @Then("the message will be displayed")
    public void messageIsDisplayed(){
        String expectedResult = "Your registration completed";
        Assert.assertTrue(message().getText().contains(expectedResult), "Error Message: User couldn't register successfully");

    }
    @And("then click on log out")
    public void clickLogOut(){
        clickLogoutButton().click();
    }


}
