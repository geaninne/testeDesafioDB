package tasks;

import org.openqa.selenium.WebDriver;
import pages.PaymentPage;

public class PaymentTasks {

    private PaymentPage paymentPage;
    public PaymentTasks(WebDriver driver){
        this.paymentPage = new PaymentPage(driver);
    }

    public void pay(){
        paymentPage.getSelectCard().click();
        paymentPage.getProceedButton().click();
    }

}
