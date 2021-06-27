package steps;

import methods.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.io.IOException;
import java.net.MalformedURLException;

public class ScenariosStepDef extends PageFactory {

    public ScenariosStepDef() throws MalformedURLException {
    }

    @Given("Open Login Page")
    public void openLoginPage() throws InterruptedException{
        senaryoMethods.openLoginPage();
    }

    @And("Control on Login Page")
    public void controlOnLoginPage() {
        senaryoMethods.controlOnLoginPage();
    }

    @And("Login sendKeys username {string}")
    public void loginSendKeysUsername(String username) throws InterruptedException, IOException {
        senaryoMethods.LoginSendKeysUsername(username);
    }


    @And("Login sendKeys password {string}")
    public void loginsendKeysPassword(String password) throws InterruptedException {
        senaryoMethods.LoginSendKeysPassword(password);
    }

    @And("Click on the login button")
    public void clickOnTheLoginButton() throws InterruptedException {
        senaryoMethods.clickOnTheLoginButton();
        Thread.sleep(5000);
    }

    @And("Again Login sendKeys password {string}")
    public void againLoginSendKeysPassword(String password) throws InterruptedException {
        senaryoMethods.LoginSendKeysPassword(password);
    }

    @And("Again Click on the login button")
    public void againOnTheLoginButton() throws InterruptedException {
        senaryoMethods.clickOnTheHalfLoginButton();
    }

    @And("Book Search text {string}")
    public void bookSearchTextAnd(String phone) throws InterruptedException {
        senaryoMethods.phoneSearchText(phone);
    }

    @And("Add a Phone Basket first Phone")
    public void addFirstPhone() throws InterruptedException {
        senaryoMethods.addFirstPhone();
    }

    @And("Controls Basket Page")
    public void controlsBasketPage() throws InterruptedException {
        senaryoMethods.controlsBasketPage();
    }

    @Then("Close Driver")
    public void closeDriver() {
        senaryoMethods.teardown();
    }

}
