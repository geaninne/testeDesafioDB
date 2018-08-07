package verifications;

import org.openqa.selenium.WebDriver;
import suport.Generator;
import suport.Screenshot;
import tasks.ShippingTasks;

/*Verifica se o endereco esta correto*/
public class AddressVerification {

private ShippingTasks shippingTasks;
    private WebDriver driver;
    public AddressVerification(WebDriver driver) {
        this.driver = driver;
        this.shippingTasks=new ShippingTasks(driver);
    }

    public void addressCheck(){

        String endereco = "rua 40";
        String endereco2 = "Austin, Texas 00000";
        if(this.textInPage(endereco) && this.textInPage(endereco2)){
            System.out.println("O endereco esta correto");
            String screen1 = "./reports/screenshots/" + Generator.dataHora() +"EnderecoCorreto.png";
            Screenshot.printScreen(driver, screen1);
            shippingTasks.checkout();

        } else{
            System.out.println("O endereco esta incorreto");
            String screen1 = "./reports/screenshots/" + Generator.dataHora() +"ErroEnderecoCorreto.png";
            Screenshot.printScreen(driver, screen1);

        }



    }


    private boolean textInPage(String text){

        return this.driver.getPageSource().contains(text);
    }
}
