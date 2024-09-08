package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Utils;

public class CheckoutPage {

    private static WebDriver driver;

    private  By checkoutButton = By.xpath("//button[@data-test='proceed-1']");
    private  By checkoutButton2 = By.xpath("//button[@data-test='proceed-2']");
    private  By checkoutButton3 = By.xpath("//button[@data-test='proceed-3']");
    private  By paymentMethod = By.xpath("//select[@data-test='payment-method']");
    private  By confirmButton = By.xpath("//button[@data-test='finish']");
    private  By paymentStatus = By.cssSelector("div.help-block");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() throws InterruptedException {
        Utils.clickOnElement(driver,checkoutButton);
    }

    public void proceedToCheckout2() throws InterruptedException {
        Utils.clickOnElement(driver,checkoutButton2);
    }

    public void proceedToCheckout3() throws InterruptedException {
        Utils.clickOnElement(driver,checkoutButton3);
    }

    public void selectPaymentMethod() throws InterruptedException {
        Utils.selectFromDropDownList(driver,paymentMethod,"Cash on Delivery");
    }

    public void proceedToCheckout4() throws InterruptedException {
        Utils.clickOnElement(driver,confirmButton);
    }

    public String getPaymentStatus() {
        return driver.findElement(paymentStatus).getText();
    }
}
