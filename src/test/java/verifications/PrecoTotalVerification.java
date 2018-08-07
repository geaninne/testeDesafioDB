package verifications;

import org.openqa.selenium.WebDriver;
import pages.AddressPage;
import pages.PaymentPage;
import suport.Generator;
import suport.Screenshot;

import static org.junit.Assert.assertEquals;

/*Verifica se o Preço esta correto*/

public class PrecoTotalVerification {

    private PaymentPage paymentPage;

    private WebDriver driver;
    public PrecoTotalVerification(WebDriver driver) {
        this.driver = driver;
        this.paymentPage = new PaymentPage(driver);
    }

    public void precoTotalCheck(){

        String precoTotal = paymentPage.getTotalPrice();
        assertEquals("$29.00",precoTotal);
        String screen4 = "./reports/screenshots/" + Generator.dataHora() +"precoTotal.png";
        Screenshot.printScreen(driver, screen4);


    }

}
