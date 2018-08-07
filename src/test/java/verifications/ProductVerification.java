package verifications;

import org.openqa.selenium.WebDriver;
import suport.Generator;
import suport.Screenshot;
import tasks.ProductTasks;

/*Verifica se o produto foi adicionado ao carrinho*/

public class ProductVerification {
    private ProductTasks productTasks;
    private WebDriver driver;
    public ProductVerification(WebDriver driver) {
        this.driver = driver;
        this.productTasks = new ProductTasks(driver);
    }

    public void productCheck(){
        String nameProduct = "Blouse";
        if(driver.getPageSource().contains(nameProduct)){
            System.out.println("O produto foi adicionado corretamente ao carrinho");
            String screen1 = "./reports/screenshots/" + Generator.dataHora() +"produtoAdicionado.png";
            Screenshot.printScreen(driver, screen1);
            productTasks.checkout2();

        } else{
            System.out.println("O produto não foi adicionado ao carrinho");
            String screen1 = "./reports/screenshots/" + Generator.dataHora() +"ErroProdutoAdicionado.png";
            Screenshot.printScreen(driver, screen1);

        }


    }

}




