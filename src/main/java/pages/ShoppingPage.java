package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class ShoppingPage {
    private static WebDriver driver;
    private By item = By.xpath("//a[@class='card'][1]");

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage selectItem() throws InterruptedException {
        Utils.clickOnElement(driver, item);
        return new ProductPage(driver);
    }
}
