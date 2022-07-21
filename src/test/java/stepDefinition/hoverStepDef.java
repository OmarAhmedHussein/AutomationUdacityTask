package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static stepDefinition.Hooks.driver;

public class hoverStepDef {

    String subCategoryName;
    Actions hover = new Actions(driver);

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {
        WebElement HeaderMenu = driver.findElement(By.xpath("//div [@class=\"header-menu\"]  //ul[@class]"));
        hover.moveToElement(HeaderMenu).perform();
        Thread.sleep(2000);

// hover on "Computers"
        WebElement Computers = driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
        hover.moveToElement(Computers).perform();
        Thread.sleep(2000);
    }
    // getText() of subCategory before click on it
    @When("user select categories")
    public void select_categories(){
        WebElement desktops =driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]  a[href=\"/desktops\"]"));
        hover.moveToElement(desktops).perform();
        subCategoryName = desktops.getText().toLowerCase().trim();        // this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);

// click on "Desktops"
        desktops.click();

    }
    @Then("user can access the category page")
    public void category_page(){
        SoftAssert soft =new SoftAssert();
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");
        soft.assertAll();
    }
}
