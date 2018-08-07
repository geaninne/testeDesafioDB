package verifications;

import org.openqa.selenium.WebDriver;
import suport.Generator;
import suport.Screenshot;

/*Classe valida se a compra foi efetuada com sucesso*/
public class ShopVerification {

    private WebDriver driver;

    public ShopVerification(WebDriver driver) {
        this.driver = driver;
    }

    public void shopCheck() {

        String message = "Your order on My Store is complete.";
        if (driver.getPageSource().contains(message)) {
            System.out.println("A compra foi realizada com sucesso");
            String screen1 = "./reports/screenshots/" + Generator.dataHora() + "compraCompleta.png";
            Screenshot.printScreen(driver, screen1);

        } else {
            System.out.println("Erro ao tentar realizar a compra");
            String screen1 = "./reports/screenshots/" + Generator.dataHora() + "compraCompleta.png";
            Screenshot.printScreen(driver, screen1);
        }


    }


}

