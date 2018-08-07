package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummaryPage {

    private WebDriver driver;

    public SummaryPage(WebDriver driver) {

        this.driver = driver;
    }


    public WebElement getButtonCheckout2(){
        return driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span"));
    }
}