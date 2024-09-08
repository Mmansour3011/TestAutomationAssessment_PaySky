package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;

import java.time.Duration;

public class ProductPage {
    private static WebDriver driver;

    private  By addToCartButton = By.xpath("//button[@data-test='add-to-cart']");
    private  By cartButton = By.xpath("//a[@data-test='nav-cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() throws InterruptedException {
        Utils.clickOnElement(driver,addToCartButton);
    }

    public CheckoutPage goToCheckoutPage() throws InterruptedException {
        Utils.clickOnElement(driver,cartButton);
        return new CheckoutPage(driver);
    }


}
