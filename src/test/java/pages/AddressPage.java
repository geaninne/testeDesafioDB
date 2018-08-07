package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddressPage {

    private WebDriver driver;
    public AddressPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getProceedButton(){
        return driver.findElement(By.name("processAddress"));
    }



}
