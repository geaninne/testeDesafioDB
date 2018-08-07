package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InitialPage {

    private WebDriver driver;

    public InitialPage(WebDriver driver){

        this.driver=driver;

    }

    public WebElement getProduct(){

        return driver.findElement(By.linkText("Blouse")) ;
    }
}
