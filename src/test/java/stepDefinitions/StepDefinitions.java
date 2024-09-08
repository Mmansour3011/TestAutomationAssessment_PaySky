package stepDefinitions;

import io.cucumber.java.After;
import org.testng.Assert;
import pages.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    private WebDriver driver;
    private BasePage basePage;
    private ShoppingPage shoppingPage;
    private LoginPage loginPage;
    private ProductPage productPage;
    private CheckoutPage checkoutPage;

    public StepDefinitions(BasePage basePage) {
        this.basePage = basePage;
    }


    @Before
    public void setUp() {
        basePage.setUp();
        driver = basePage.driver;
        loginPage = new LoginPage(driver);
        shoppingPage = new ShoppingPage(driver);
        productPage = new ProductPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @After
    public void tearDown() {
        basePage.tearDown();
    }

    //    @Given("I am registered with username {string} and password {string}")
//    public void i_am_registered_with_username_and_password(String username, String password) throws InterruptedException {
//        driver.get("https://practicesoftwaretesting.com/auth/register");
//        Thread.sleep(3000);
//        loginPage=RegistrationPage.register(username,password);
//    }
    @Given("I am logged in with username {string} and password {string}")
    public void i_am_logged_in_with_username_and_password(String username, String password) throws InterruptedException {
        driver.get("https://practicesoftwaretesting.com/auth/login");
        loginPage.login(username, password);
        shoppingPage = loginPage.goToShoppingPage();
    }


    @When("I buy a product")
    public void i_buy_a_product() throws InterruptedException {
        productPage = shoppingPage.selectItem();
        productPage.addToCart();

    }

    @And("I check out")
    public void i_check_out() throws InterruptedException {
        checkoutPage = productPage.goToCheckoutPage();
        checkoutPage.proceedToCheckout();
        checkoutPage.proceedToCheckout2();
        checkoutPage.proceedToCheckout3();
        checkoutPage.selectPaymentMethod();
        checkoutPage.proceedToCheckout4();
    }

    @Then("The process is completed")
    public void the_process_is_completed() {
        Assert.assertEquals("Payment was successful", checkoutPage.getPaymentStatus(), "The payment process failed.");
    }

}
