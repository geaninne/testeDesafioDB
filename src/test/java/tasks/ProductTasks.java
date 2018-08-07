package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.InitialPage;
import pages.ProductVisualizationPage;
import pages.SummaryPage;
import org.openqa.selenium.support.ui.WebDriverWait;


/*Classe contem tarefas da atividade Adicionar Produto ao carrinho*/
public class ProductTasks {

    private ProductVisualizationPage productVisualizationPage;
    private InitialPage initialPage;
    private SummaryPage summaryPage;
    private WebDriverWait wait;

    private WebDriver driver;

    public ProductTasks(WebDriver driver){
        this.productVisualizationPage=new ProductVisualizationPage(driver);
        this.initialPage=new InitialPage(driver);
        this.summaryPage=new SummaryPage(driver);
        this.wait = new WebDriverWait(driver,10);


    }

    public void addProduct(){
        selectProduct();
        addCarrinho();
        checkout1();
    }

    public void selectProduct(){
        initialPage.getProduct().click();

    }


    public void addCarrinho(){

        productVisualizationPage.getButtonAdd().click();
    }


    public void checkout1(){

        WebElement buttonCheckout = productVisualizationPage.getButtonCheckout();
        wait.until(ExpectedConditions.visibilityOf(buttonCheckout));
        buttonCheckout.click();

    }


    public void checkout2(){

        WebElement buttonCheckout2 = summaryPage.getButtonCheckout2();
        wait.until(ExpectedConditions.visibilityOf(buttonCheckout2));
        buttonCheckout2.click();

    }


}
