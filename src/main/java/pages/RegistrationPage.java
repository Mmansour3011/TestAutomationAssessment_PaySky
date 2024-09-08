package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Utils;

public class RegistrationPage {

    private static WebDriver driver;

    private  By firstName = By.cssSelector("#first_name");
    private  By lastName = By.cssSelector("#last_name");
    private  By dateOfBirth = By.cssSelector("#dob");
    private  By address = By.cssSelector("#address");
    private  By postcode = By.cssSelector("#postcode");
    private  By city = By.cssSelector("#city");
    private  By state = By.cssSelector("#state");
    private  By country = By.cssSelector("#country");
    private  By phone = By.cssSelector("#phone");
    private  By emailField = By.cssSelector("#email");
    private  By passwordField = By.cssSelector("input#password");
    private  By submit = By.cssSelector("button.btnSubmit");

    public RegistrationPage(WebDriver driver) {
        RegistrationPage.driver = driver;
    }

    public  LoginPage register(String username, String password) throws InterruptedException {
        Utils.insertData(driver,firstName, "Test");
        Utils.insertData(driver,lastName, "Test");
        Utils.insertData(driver,dateOfBirth, "01/01/1994");
        Utils.insertData(driver,address, "Test");
        Utils.insertData(driver,postcode, "123123");
        Utils.insertData(driver,city, "Test");
        Utils.insertData(driver,state, "Test");
        Utils.selectFromDropDownList(driver,country, "Egypt");
        Utils.insertData(driver,phone, "123123123");
        Utils.insertData(driver,emailField, username);
        Utils.insertData(driver,passwordField, password);
        Utils.clickOnElement(driver,submit);
        return new LoginPage(driver);
    }
}
