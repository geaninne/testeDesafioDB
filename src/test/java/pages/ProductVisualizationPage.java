package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductVisualizationPage {

    private WebDriver driver;

    public ProductVisualizationPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getButtonAdd(){

        return driver.findElement(By.name("Submit"));
    }

    public WebElement getButtonCheckout(){
        return driver.findElement(By.xpath("//div[@id = 'layer_cart']/div/div[2]/div[4]/a/span"));
    }

}
