package tasks;

import org.openqa.selenium.WebDriver;
import pages.AddressPage;
import pages.ShippingPage;

public class ShippingTasks {

    private ShippingPage shippingPage;
    private AddressPage addressPage;
    public ShippingTasks(WebDriver driver){

        this.shippingPage = new ShippingPage(driver);
        this.addressPage = new AddressPage(driver);
    }

    public void aceitarTermos(){

        shippingPage.getTermosServico().click();
        shippingPage.getProceedButton().click();

    }

    public void checkout(){
        addressPage.getProceedButton().click();

    }


}
