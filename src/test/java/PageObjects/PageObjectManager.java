package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public GreenCartPage greenCartPage;
    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }

    public GreenCartPage getGreenCartPage()
    {
        greenCartPage = new GreenCartPage(driver);
        return greenCartPage;
    }
}
