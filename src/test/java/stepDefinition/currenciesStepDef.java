package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.currencies;

import static pages.currencies.assertCurrency;
import static pages.currencies.selectCurrency;

public class currenciesStepDef {


    @When("user selects a currency")
    public void switchBetweenCurrencies(){
        selectCurrency();

    }

    @Then("user could find the selected currency")
    public void currentCurrency(){
        Assert.assertTrue(assertCurrency().contains("Euro"));

    }


}
