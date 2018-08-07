package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage {

    private WebDriver driver;
    public ShippingPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getTermosServico(){

        return driver.findElement(By.id("cgv"));
    }


    public WebElement getProceedButton(){


        return driver.findElement(By.name("processCarrier"));
    }





}
