package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hooks;


public class currencies {
    public static Select selectCurrency() {
        Select currencyDDL = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        currencyDDL.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fhtc-one-mini-blue");
        return currencyDDL;
    }
    public static String assertCurrency() {
        String euro= selectCurrency().toString();
        System.out.println(euro);
        return euro;
    }
}
