package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreenCartPage {
    public WebDriver driver;
    public GreenCartPage(WebDriver driver){
        this.driver=driver;
    }
    private By search = By.name("q");

    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);
        System.out.println(name);
    }
}
