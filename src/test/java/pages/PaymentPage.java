package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

    private WebDriver driver;

    public PaymentPage(WebDriver driver){
        this.driver=driver;
    }
    public String getTotalPrice(){
        return driver.findElement(By.id("total_price")).getText();
    }

    public WebElement getSelectCard(){
        WebElement pagamento = driver.findElement(By.id("HOOK_PAYMENT"));
        return pagamento.findElement(By.className("bankwire"));
    }

    public WebElement getProceedButton(){
        return driver.findElement(By.xpath("//p[@id='cart_navigation']/button/span"));
    }


}
