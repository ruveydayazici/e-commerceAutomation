package methods;

import org.openqa.selenium.WebDriver;



public class PageFactory extends org.openqa.selenium.support.PageFactory {

    public static   WebDriver driver;
    public HeadMethods methods;
    public ScenariosMethods senaryoMethods;

    public PageFactory()  {
        driver          = Driver.getDriver();

        methods       = PageFactory.initElements(driver, HeadMethods.class);
        senaryoMethods = PageFactory.initElements(driver, ScenariosMethods.class);
    }

}
