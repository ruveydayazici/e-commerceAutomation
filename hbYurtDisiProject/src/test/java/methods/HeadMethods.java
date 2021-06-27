package methods;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.inject.Inject;


public class HeadMethods {
    public final WebDriver driver;

    public HeadMethods(){
        this.driver = PageFactory.driver;
    }

    @Inject

    public String printPageUrl() {

        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl() ;
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void controlPage(String urlMust) {
        compareString(printPageUrl(),urlMust);
        System.out.println(printPageUrl()  + "     " + urlMust);
    }
    public void compareString(String string0, String string1) {
        waitBySeconds(3);
        Assert.assertEquals(string0,string1);
    }

    public void waitBySeconds(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }






    public void sendKeysBy(String key, String text) {

    }





 /*   public ElementInfo getElementInfo(String key) {

        return StoreHelper.INSTANCE.findElementInfoByKey(key);
    }*/

    public void untilElementAppear(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean waitDisplayed(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        } catch (Exception e) {
            System.out.println(e.getMessage()+"  "+ e);
            return false;
        }
        return true;
    }

    public void elementDisplayedControlWithSwipe(By by) {
        for (int i = 0; i < 4; i++) {
            if (waitDisplayed(by)) {
                System.out.println(by + " görüldü!");
                break;
            } else {
                scrollToElement(by);
                System.out.println((i + 1) + ". kez swipe yapıldı !");
            }
        }
    }

    public void scrollToElement(By by) {
        WebElement element = driver.findElement (by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})",
                element);
    }
}
