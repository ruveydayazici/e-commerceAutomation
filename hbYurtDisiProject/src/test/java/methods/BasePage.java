package methods;

import org.openqa.selenium.WebDriver;

public class BasePage extends HeadMethods{

    public final WebDriver driver;
    protected static String Url = "https://giris.hepsiburada.com/?ReturnUrl=https%3A%2F%2Foauth.hepsiburada.com%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DSPA%26redirect_uri%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252Fuyelik%252Fcallback%26response_type%3Dcode%26scope%3Dopenid%2520profile%26state%3D787941dafad441ffbb576b0b64a1b25e%26code_challenge%3DY137bIq5VcuYhE7uoJ18EsEdFoxF_Kprnlu0T7s4Lbo%26code_challenge_method%3DS256%26response_mode%3Dquery%26ActivePage%3DPURE_LOGIN%26oidcReturnUrl%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252F";

    public BasePage(){
        this.driver = PageFactory.driver;
    }
}
