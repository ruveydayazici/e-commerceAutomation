package methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import javax.swing.JOptionPane;

public class ScenariosMethods extends BasePage {


    @FindBy(how = How.ID, id = "txtUserName")
    private WebElement Username;
    @FindBy(how = How.ID, id = "txtPassword")
    private WebElement Password;
    @FindBy(how = How.ID, id = "btnLogin")
    private WebElement BtnLogin;
    @FindBy(how = How.ID, id = "btnHalfLogin")
    private WebElement BtnHalfLogin;
    @FindBy(how = How.XPATH, xpath = "//input[@class = 'desktopOldAutosuggestTheme-input']")
    private WebElement SearchText;
    @FindBy(how = How.XPATH, xpath = "//div[text()= 'ARA']")
    private WebElement SearchBtn;
    @FindBy(how = How.XPATH, xpath = "(//div[@class='carousel-lazy-item'])[1]")
    private WebElement SelectFirstPhone;
    @FindBy(how = How.ID, id = "addToCart")
    private WebElement AddBasket;
    @FindBy(how = How.ID, xpath = "//button[text()='Sepete git']")
    private WebElement GotoBasket;
    @FindBy(how = How.ID, xpath = "//h1[text()='Sepetim']")
    private WebElement ControlBasketHeaderText;


    public void openLoginPage() throws InterruptedException {
        goToUrl(Url);
        waitBySeconds(3);
        // geldi mi logine ?
        String UrlMust = "https://giris.hepsiburada.com/?ReturnUrl=https%3A%2F%2Foauth.hepsiburada.com%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DSPA%26redirect_uri%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252Fuyelik%252Fcallback%26response_type%3Dcode%26scope%3Dopenid%2520profile%26state%3D787941dafad441ffbb576b0b64a1b25e%26code_challenge%3DY137bIq5VcuYhE7uoJ18EsEdFoxF_Kprnlu0T7s4Lbo%26code_challenge_method%3DS256%26response_mode%3Dquery%26ActivePage%3DPURE_LOGIN%26oidcReturnUrl%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252F";
        controlPage(UrlMust);
    }

    public void controlOnLoginPage() {
        //loginden sonra gelen sayfa kontrolü
        String UrlMust = "https://www.hepsiburada.com/";
        controlPage(UrlMust);
    }

    public void LoginSendKeysUsername(String username) throws InterruptedException {
        String testUserName = "testeruvu@gmail.com";
        Username.sendKeys(testUserName);
    }

    public void LoginSendKeysPassword(String password) throws InterruptedException {
        Password.sendKeys(password);
    }

    public void clickOnTheLoginButton() throws InterruptedException {
        BtnLogin.click();
    }

    public void clickOnTheHalfLoginButton() throws InterruptedException {
        BtnHalfLogin.click();
        Thread.sleep(4000);
    }

    public void phoneSearchText(String phone) throws InterruptedException {
        SearchText.sendKeys(phone);
        SearchBtn.click();
        Thread.sleep(5000);
        String CurrentUrl ="https://www.hepsiburada.com/ara?q=iPhone+11";
        controlPage(CurrentUrl);
    }

    public void addFirstPhone() throws InterruptedException {
        SelectFirstPhone.click();
        Thread.sleep(5000);
        AddBasket.click();
        Thread.sleep(5000);
        GotoBasket.click();
    }

    public void controlsBasketPage() throws InterruptedException {
        String basketHeaderText;
        String basketHeaderTextOrj="Sepetim";
        Thread.sleep(3000);
        basketHeaderText = ControlBasketHeaderText.getText();
        compareString(basketHeaderText, basketHeaderTextOrj);
        String CurrentUrl = "https://checkout.hepsiburada.com/";
        controlPage(CurrentUrl);
    }

    public void compareString(String string0, String string1) {
        waitBySeconds(3);
        Assert.assertEquals(string0,string1);
    }

    public void controlPage(String urlMust) {
        compareString(printPageUrl(),urlMust);
        System.out.println(printPageUrl()  + "     " + urlMust);
    }

    public void teardown() {
        driver.close();
    }

    }



